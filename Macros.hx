package ;

#if macro
import haxe.io.Output;
import haxe.macro.Type;
import haxe.macro.Expr;
import haxe.macro.Context;
import haxe.macro.Compiler;

using StringTools;
using haxe.io.Path;
using haxe.macro.Context;
using haxe.macro.ExprTools;
using haxe.macro.TypedExprTools;
using haxe.macro.PositionTools;
#end

class Macros {

    public static macro function getDirectory():ExprOf<String> {
        if (target != 'eval') {
            return macro $v{'/'};

        } else {
            return macro $v{directory};
        }
    }

    public static macro function getHaxever():ExprOf<String> {
        return macro $v{haxever};
    }

    public static macro function getTarget():ExprOf<String> {
        return macro $v{target};
    }

    #if macro
    public static function setup() {
        Compiler.define('dump-path', './$directory/$target-dump/');
        Compiler.define('dump', 'pretty');
        Context.onAfterTyping( onGenerate );
    }
    public static var ereg = ~/[ \\-\\:\\.]/gi;
    public static var collect = Context.defined('collect.info');
    public static var info:Map<Int, Array<Info>> = [];

    @:isVar public static var haxever(get, null):String;
    private static function get_haxever() {
        if (haxever == null) {
            haxever = '' + Context.definedValue('haxe');

            if (sys.FileSystem.exists('./.haxerc')) {
                var str = sys.io.File.getContent('./.haxerc');
                var json = haxe.Json.parse(str);
                
                if (haxever.indexOf( ereg.replace(json.version, '_') ) == -1) {
                    var haxerc = ereg.replace(json.version, '_');
                    if (json.version != haxever) haxever += '_' + haxerc;

                }

            }
            
        }

        return haxever;
    }

    @:isVar public static var target(get, null):String;
    private static function get_target() {
        if (target == null) {
            target = Context.definedValue('target.name');
            if (target == 'java' && Context.defined('jvm')) {
                target = 'jvm';

            }

        }
        return target;
    }
    public static var directory = ereg.replace('$haxever', '_');
    public static var file = '$target';
    @:isVar public static var handle(get, null):Output;
    private static function get_handle() {
        if (handle == null) if (collect) {
            if (!sys.FileSystem.exists('./$directory')) {
                sys.FileSystem.createDirectory('./$directory');

            }
            handle = sys.io.File.write('./$directory/$file.md');

        } else {
            handle = new haxe.io.BytesOutput();

        }

        return handle;
    }

    private static var output = haxe.macro.Compiler.getOutput();

    public static function build() {
        trace( Context.getDefines() );
        var ext = output.extension();
        var dir = output.directory();
        
        Compiler.setOutput( './$directory/$output' );

        var fields = Context.getBuildFields();

        for (field in fields) if (field.name == 'main') {
            switch field.kind {
                case FFun(_.expr => _.expr => EBlock(es)):
                    function itr(e:Expr) switch e {
                        case _.expr => EConst(CInt(v)): 
                            var pos = Context.getPosInfos(e.pos);
                            var loc = e.pos.toLocation();
                            var line = loc.range.start.line;
                            if ('$v' != '${loc.range.start.line}') {
                                if (info.exists(line)) {
                                    info.get(line)[0].value2 = '' + v;

                                } else {
                                    info.set( line, [{lineNumber:line, value1:'$v', value2:''}] );

                                }

                            }

                        case macro haxe.PosInfos:

                        case _: 
                            e.iter( itr );

                    }

                    es.iter( itr );

                case _:

            }

            break;

        }

        return fields;
    }

    public static function onGenerate(types:Array<ModuleType>):Void {
        for (type in types) {
            switch type {
                case TClassDecl(_.get() => cls = {name:'Main'}):
                    function itr(e:TypedExpr) switch e {
                        case _.expr => TConst(TInt(v)): 
                            var loc = e.pos.toLocation();
                            var line = loc.range.start.line;
                            if (v != loc.range.start.line) {
                                if (info.exists(line)) {
                                    var info = info.get(line);
                                    if (info.length == 1) {
                                        info.push( {lineNumber:line, value1:'$v', value2:''} );

                                    } else {
                                        info[1].value2 = '' + v;

                                    }

                                } else {
                                    throw 'Line number $line should already exist in `info`.';

                                }

                            }

                        case _.t => TAnonymous(_.get() => anon):
                            var sf = anon.fields.map( f->f.name );
                            var cs = ['fileName', 'lineNumber', 'className', 'methodName'];
                            var has = false;
                            for (c in cs) if (sf.indexOf(c) > -1) {
                                has = true;
                                break;
                            }
                            if (!has) {
                                e.iter( itr );
                            }

                        case _: 
                            e.iter( itr );

                    }

                    for (field in cls.statics.get()) if (field.name == 'main') {
                        field.expr().iter( itr );
                        break;
                    }

                    break;

                case x:

            }

        }

        var values = [for (_ => value in info) {
            value;
        }];
        values.sort( (a, b) -> a[0].lineNumber - b[0].lineNumber );
        
        handle.writeString('| line number | expr a | expr b | typed expr a | typed expr b | runtime a | runtime b |\n| ---- | ---- | ---- | ---- | ---- | ---- | ---- |\n');
        for (set in values) {
            var set1 = set[0];
            var set2 = set[1];
            handle.writeString('| ${set1.lineNumber} | ${set1.value1} | ${set1.value2} | ${set2.value1} | ${set2.value2} |\n');

        }

        handle.flush();
        handle.close();

        sys.io.File.copy('./runall.sh', './$directory/runall.sh');
    }
    #end

}