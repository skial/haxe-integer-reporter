// Generated by Haxe 4.2.0-rc.1+e6d21742f
package haxe.exceptions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NotImplementedException extends haxe.exceptions.PosException
{
	public NotImplementedException(haxe.lang.EmptyObject empty)
	{
		//line 6 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\exceptions\\NotImplementedException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public NotImplementedException(java.lang.String message, haxe.Exception previous, java.lang.Object pos)
	{
		//line 8 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\exceptions\\NotImplementedException.hx"
		super(( (( message == null )) ? ("Not implemented") : (message) ), ( (( previous == null )) ? (null) : (previous) ), ( (( pos == null )) ? (null) : (pos) ));
		//line 8 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\exceptions\\NotImplementedException.hx"
		if (( message == null )) 
		{
			//line 8 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\exceptions\\NotImplementedException.hx"
			message = "Not implemented";
		}
		
	}
	
	
}

