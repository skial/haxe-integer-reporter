// Generated by Haxe 4.1.3
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean isOfType(java.lang.Object v, java.lang.Object t)
	{
		//line 32 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		if (( v == null )) 
		{
			//line 33 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 34 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		if (( t == null )) 
		{
			//line 35 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 36 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 37 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 38 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 39 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		java.lang.String name = clt.getName();
		//line 41 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		{
			//line 41 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 41 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 41 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 41 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
				switch (__temp_hash3)
				{
					case 344809556:
					case 64711720:
					{
						//line 47 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
						{
							//line 47 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
							return v instanceof java.lang.Boolean;
						}
						
						//line 47 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 1063877011:
					{
						//line 49 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						if (__temp_svar1.equals("java.lang.Object")) 
						{
							//line 49 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
							return true;
						}
						
						//line 49 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 761287205:
					case -1325958191:
					{
						//line 43 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
						{
							//line 43 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
							return haxe.lang.Runtime.isDouble(v);
						}
						
						//line 43 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case -2056817302:
					case 104431:
					{
						//line 45 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
						{
							//line 45 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
							return haxe.lang.Runtime.isInt(v);
						}
						
						//line 45 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 52 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		java.lang.Class clv = v.getClass();
		//line 54 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 58 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static int _int(double x)
	{
		//line 62 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\4.1.3\\std\\java\\_std\\Std.hx"
		return ((int) (x) );
	}
	
	
}

