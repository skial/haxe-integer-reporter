// Generated by Haxe 4.2.0-rc.1+64bbaabab
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Error extends haxe.lang.ParamEnum
{
	public Error(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Blocked", "Overflow", "OutsideBounds", "Custom"};
	
	public static final haxe.io.Error Blocked = new haxe.io.Error(0, null);
	
	public static final haxe.io.Error Overflow = new haxe.io.Error(1, null);
	
	public static final haxe.io.Error OutsideBounds = new haxe.io.Error(2, null);
	
	public static haxe.io.Error Custom(java.lang.Object e)
	{
		//line 42 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\haxe\\io\\Error.hx"
		return new haxe.io.Error(3, new java.lang.Object[]{e});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 31 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\haxe\\io\\Error.hx"
		return haxe.io.Error.__hx_constructs[this.index];
	}
	
	
}


