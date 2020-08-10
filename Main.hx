package ;

@:build(Macros.build())
// @see https://github.com/HaxeFoundation/haxe/issues/9808
class Main {

    public static function main() {
        Writer.writePair( 0x80008000, -2147450880 );
        Writer.writePair( 0x80007FFF, -2147450881 );
        Writer.writePair( 0xffffffff, -1 );
        Writer.writePair( 0x7fffffff, 2147483647 );
        Writer.writePair( 0x3fffffff, 1073741823 );
        Writer.writePair( 0x80000000, -2147483648 );
        Writer.writePair( 0xC0000000, -1073741824 );
        Writer.writePair( 0xE0000000, -536870912 );
        Writer.close();
    }

}