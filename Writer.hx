package ;

import haxe.PosInfos;

using haxe.io.Path;

class Writer {

    private static var directory = Macros.getDirectory().normalize();
    private static var haxever = Macros.getHaxever();
    public static var file = Macros.getTarget();

    @:isVar public static var handle(get, default):String;
    private static function get_handle() {
        if (handle == null) {
            if (!sys.FileSystem.exists('./$directory')) {
                sys.FileSystem.createDirectory('./$directory');

            }
            handle = sys.io.File.getContent('./$directory/$file.md'.normalize());

        }

        return handle;
    }

    private static var lastIndex = 0;
    public static function writePair<T>(v1:T, v2:T, ?pos:PosInfos) {
        var index = handle.indexOf('| ${pos.lineNumber} |', lastIndex);
        var addition = '${v1}|${v2}|\n';

        if (index > -1) {
            lastIndex = index;
            var nl = handle.indexOf('\n', index);

            if (nl > -1) {
                handle = handle.substring(0, nl) + addition + handle.substring(nl+1, handle.length);

            } else {
                throw 'Unable to find newline.';

            }

        } else {
            throw 'Unable to find line number `${pos.lineNumber}` for values ${v1} and ${v2}';

        }

        trace( pos.lineNumber, v1, v2 );

    }

    public static function close():Void {
        sys.io.File.saveContent('./$directory/$file.md'.normalize(), handle);
    }
    
}