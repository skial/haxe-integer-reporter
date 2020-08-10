// Generated by Haxe 4.2.0-rc.1+64bbaabab
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Runtime
{
	
	public static java.lang.Object getField(haxe.lang.IHxObject obj, java.lang.String field, boolean throwErrors)
	{
		if (obj == null && !throwErrors) return null;
		return obj.__hx_getField(field, throwErrors, false, false);
	}

	public static double getField_f(haxe.lang.IHxObject obj, java.lang.String field, boolean throwErrors)
	{
		if (obj == null && !throwErrors) return 0.0;
		return obj.__hx_getField_f(field, throwErrors, false);
	}

	public static java.lang.Object setField(haxe.lang.IHxObject obj, java.lang.String field, java.lang.Object value)
	{
		return obj.__hx_setField(field, value, false);
	}

	public static double setField_f(haxe.lang.IHxObject obj, java.lang.String field, double value)
	{
		return obj.__hx_setField_f(field, value, false);
	}

	public static java.lang.Object callField(haxe.lang.IHxObject obj, java.lang.String field, java.lang.Object[] args)
	{
		return obj.__hx_invokeField(field, args);
	}
	static
	{
		//line 60 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		haxe.lang.Runtime.undefined = ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) );
	}
	
	public Runtime()
	{
	}
	
	
	public static java.lang.Object undefined;
	
	public static java.lang.Object closure(java.lang.Object obj, java.lang.String field)
	{
		
	return new haxe.lang.Closure(obj, field);
	
	}
	
	
	public static boolean eq(java.lang.Object v1, java.lang.Object v2)
	{
		
			if (v1 == v2)
				return true;
			if (v1 == null || v2 == null)
				return false;

			if (v1 instanceof java.lang.Number)
			{
				if (!(v2 instanceof java.lang.Number))
					return false;

				java.lang.Number v1c = (java.lang.Number) v1;
				java.lang.Number v2c = (java.lang.Number) v2;
				if (v1 instanceof java.lang.Long || v2 instanceof java.lang.Long)
					return v1c.longValue() == v2c.longValue();
				return v1c.doubleValue() == v2c.doubleValue();
			} else if (v1 instanceof java.lang.String || v1 instanceof haxe.lang.IEquatable) { //TODO see what happens with Boolean cases
				return v1.equals(v2);
			}

			return false;
	
	}
	
	
	public static boolean refEq(java.lang.Object v1, java.lang.Object v2)
	{
		
		if (v1 == v2)
			return true;

		if (v1 instanceof java.lang.String || v1 instanceof haxe.lang.IEquatable)
		{
			return v1 != null && v1.equals(v2);
		} else {
			return v1 == v2;
		}
	
	}
	
	
	public static boolean valEq(java.lang.Object v1, java.lang.Object v2)
	{
		
		return v1 == v2 || (v1 != null && v1.equals(v2));
	
	}
	
	
	public static double toDouble(java.lang.Object obj)
	{
		
		return (obj == null) ? 0.0 : ((java.lang.Number) obj).doubleValue();
	
	}
	
	
	public static boolean toBool(java.lang.Boolean obj)
	{
		//line 125 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( obj == null )) 
		{
			//line 125 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return false;
		}
		else
		{
			//line 125 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return obj.booleanValue();
		}
		
	}
	
	
	public static int toInt(java.lang.Object obj)
	{
		
		return (obj == null) ? 0 : ((java.lang.Number) obj).intValue();
	
	}
	
	
	public static long toLong(java.lang.Object obj)
	{
		//line 136 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( obj == null )) 
		{
			//line 136 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return ((long) (0) );
		}
		else
		{
			//line 136 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return ((java.lang.Number) (obj) ).longValue();
		}
		
	}
	
	
	public static boolean isDouble(java.lang.Object obj)
	{
		
		if (obj != null && obj instanceof java.lang.Number)
		{
			return true;
		} else {
			return false;
		}
	
	}
	
	
	public static boolean isInt(java.lang.Number num)
	{
		//line 161 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		return ( ( num != null ) && ( num.doubleValue() == num.intValue() ) );
	}
	
	
	public static boolean isInt(java.lang.Object obj)
	{
		//line 152 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( obj instanceof java.lang.Number )) 
		{
			//line 153 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			java.lang.Number n = ((java.lang.Number) (obj) );
			//line 154 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return ( n.doubleValue() == n.intValue() );
		}
		else
		{
			//line 156 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return false;
		}
		
	}
	
	
	public static boolean slowHasField(java.lang.Object o, java.lang.String field)
	{
		
		java.lang.Class cl = null;
		if (o instanceof java.lang.Class)
		{
			if (o == java.lang.String.class)
				return field.equals("fromCharCode");

			cl = (java.lang.Class) o;
		} else if (o instanceof java.lang.String) {
			return haxe.lang.StringRefl.handleGetField( (java.lang.String) o, field, false) != null;
		} else {
			cl = o.getClass();
		}

		try
		{
			java.lang.reflect.Field f = cl.getField(field);
			return true;
		}
		catch(Throwable t)
		{
			java.lang.reflect.Method[] ms = cl.getMethods();
			for (int i = 0; i < ms.length; i++)
			{
				if (ms[i].getName().equals(field))
				{
					return true;
				}
			}
		}

		return false;
	
	}
	
	
	public static int compare(java.lang.Object v1, java.lang.Object v2)
	{
		
			if (v1 == v2)
				return 0;
			if (v1 == null) return -1;
			if (v2 == null) return 1;

			if (v1 instanceof java.lang.Number || v2 instanceof java.lang.Number)
			{
				java.lang.Number v1c = (java.lang.Number) v1;
				java.lang.Number v2c = (java.lang.Number) v2;

				if (v1 instanceof java.lang.Long || v2 instanceof java.lang.Long)
				{
					long l1 = (v1 == null) ? 0L : v1c.longValue();
					long l2 = (v2 == null) ? 0L : v2c.longValue();
          return (l1 < l2) ? -1 : (l1 > l2) ? 1 : 0;
				} else {
					double d1 = (v1 == null) ? 0.0 : v1c.doubleValue();
					double d2 = (v2 == null) ? 0.0 : v2c.doubleValue();

          return (d1 < d2) ? -1 : (d1 > d2) ? 1 : 0;
				}
			}
			//if it's not a number it must be a String
			return ((java.lang.String) v1).compareTo((java.lang.String) v2);
	
	}
	
	
	public static java.lang.Object plus(java.lang.Object v1, java.lang.Object v2)
	{
		
			if (v1 instanceof java.lang.String || v2 instanceof java.lang.String)
				return toString(v1) + toString(v2);

			if (v1 instanceof java.lang.Number || v2 instanceof java.lang.Number)
			{
				java.lang.Number v1c = (java.lang.Number) v1;
				java.lang.Number v2c = (java.lang.Number) v2;

				double d1 = (v1 == null) ? 0.0 : v1c.doubleValue();
				double d2 = (v2 == null) ? 0.0 : v2c.doubleValue();

				return d1 + d2;
			}

			throw new java.lang.IllegalArgumentException("Cannot dynamically add " + v1 + " and " + v2);
	
	}
	
	
	public static java.lang.Object slowGetField(java.lang.Object obj, java.lang.String field, boolean throwErrors)
	{
		

	if (obj == null)
		if (throwErrors)
			throw new java.lang.NullPointerException("Cannot access field '" + field + "' of null.");
		else
			return null;

	java.lang.Class cl = null;
	try
	{
		if (obj instanceof java.lang.Class)
		{
			if (obj == java.lang.String.class && field.equals("fromCharCode"))
				return new haxe.lang.Closure(haxe.lang.StringExt.class, field);

			cl = (java.lang.Class) obj;
			obj = null;
		} else if (obj instanceof java.lang.String) {
			return haxe.lang.StringRefl.handleGetField((java.lang.String) obj, field, throwErrors);
		} else {
			cl = obj.getClass();
		}

		java.lang.reflect.Field f = cl.getField(field);
		f.setAccessible(true);
		return f.get(obj);
	} catch (Throwable t)
	{
		try
		{
			java.lang.reflect.Method[] ms = cl.getMethods();
			for (int i = 0; i < ms.length; i++)
			{
				if (ms[i].getName().equals(field))
				{
					return new haxe.lang.Closure(obj != null ? obj : cl, field);
				}
			}
		} catch (Throwable t2)
		{

		}

		if (throwErrors)
			throw (java.lang.RuntimeException)haxe.Exception.thrown(t);

		return null;
	}

	
	}
	
	
	public static java.lang.Object slowSetField(java.lang.Object obj, java.lang.String field, java.lang.Object value)
	{
		
		java.lang.Class cl = null;
		if (obj instanceof java.lang.Class)
		{
			cl = (java.lang.Class) obj;
			obj = null;
		} else {
			cl = obj.getClass();
		}

		try {
			java.lang.reflect.Field f = cl.getField(field);
			f.setAccessible(true);

			//FIXME we must evaluate if field to be set receives either int or double
			if (isInt(value))
			{
				f.setInt(obj, toInt(value));
			} else if (isDouble(value)) {
				f.setDouble(obj, toDouble(value));
			} else {
				f.set(obj, value);
			}
			return value;
		}
		catch (Throwable t)
		{
			throw (java.lang.RuntimeException)haxe.Exception.thrown(t);
		}
	
	}
	
	
	public static java.lang.Object slowCallField(java.lang.Object obj, java.lang.String field, java.lang.Object[] args)
	{
		
		java.lang.Class cl = null;
		if (obj instanceof java.lang.Class)
		{
			if (obj == java.lang.String.class && field.equals("fromCharCode"))
				return haxe.lang.StringExt.fromCharCode(toInt(args[0]));

			cl = (java.lang.Class) obj;
			obj = null;
		} else if (obj instanceof java.lang.String) {
			return haxe.lang.StringRefl.handleCallField((java.lang.String) obj, field, args);
		} else {
			cl = obj.getClass();
		}

		if (args == null) args = new java.lang.Object[0];

		int len = args.length;
		java.lang.Class[] cls = new java.lang.Class[len];
		java.lang.Object[] objs = new java.lang.Object[len];

		java.lang.reflect.Method[] ms = cl.getMethods();
		int msl = ms.length;
		int realMsl = 0;
		for(int i =0; i < msl; i++)
		{
			if (!ms[i].getName().equals(field) || (!ms[i].isVarArgs() && ms[i].getParameterTypes().length != len))
			{
				ms[i] = null;
			} else {
				ms[realMsl] = ms[i];
				if (realMsl != i)
					ms[i] = null;
				realMsl++;
			}
		}

		boolean hasNumber = false;

		for (int i = 0; i < len; i++)
		{
			Object o = args[i];
			if (o == null)
			{
				continue; //can be anything
			}
			objs[i]= o;
			cls[i] = o.getClass();
			boolean isNum = false;

			if (o instanceof java.lang.Number)
			{
				cls[i] = java.lang.Number.class;
				isNum = hasNumber = true;
			} else if (o instanceof java.lang.Boolean) {
				cls[i] = java.lang.Boolean.class;
				isNum = true;
			}

			msl = realMsl;
			realMsl = 0;

			for (int j = 0; j < msl; j++)
			{
				java.lang.Class[] allcls = ms[j].getParameterTypes();
				if (i < allcls.length)
				{
					if (!  ((isNum && allcls[i].isPrimitive()) || allcls[i].isAssignableFrom(cls[i])) )
					{
						ms[j] = null;
					} else {
						ms[realMsl] = ms[j];
						if (realMsl != j)
							ms[j] = null;
						realMsl++;
					}
				}
			}

		}

		java.lang.reflect.Method found;
		if (ms.length == 0 || (found = ms[0]) == null)
			throw (java.lang.RuntimeException)haxe.Exception.thrown("No compatible method found for: " + field);

		if (hasNumber)
		{
			java.lang.Class[] allcls = found.getParameterTypes();

			for (int i = 0; i < len; i++)
			{
				java.lang.Object o = objs[i];
				if (o instanceof java.lang.Number)
				{
					java.lang.Class curCls = null;
					if (i < allcls.length)
					{
						curCls = allcls[i];
						if (!curCls.isAssignableFrom(o.getClass()))
						{
							String name = curCls.getName();
							if (name.equals("double") || name.equals("java.lang.Double"))
							{
								objs[i] = ((java.lang.Number)o).doubleValue();
							} else if (name.equals("int") || name.equals("java.lang.Integer"))
							{
								objs[i] = ((java.lang.Number)o).intValue();
							} else if (name.equals("float") || name.equals("java.lang.Float"))
							{
								objs[i] = ((java.lang.Number)o).floatValue();
							} else if (name.equals("byte") || name.equals("java.lang.Byte"))
							{
								objs[i] = ((java.lang.Number)o).byteValue();
							} else if (name.equals("short") || name.equals("java.lang.Short"))
							{
								objs[i] = ((java.lang.Number)o).shortValue();
							} else if (name.equals("long") || name.equals("java.lang.Long"))
							{
								objs[i] = ((java.lang.Number)o).longValue();
							}
						}
					} //else varargs not handled TODO
				}
			}
		}

		try {
			found.setAccessible(true);
			return found.invoke(obj, objs);
		}

		catch (java.lang.reflect.InvocationTargetException e)
		{
			throw (java.lang.RuntimeException)haxe.Exception.thrown(e.getCause());
		}

		catch (Throwable t)
		{
			throw (java.lang.RuntimeException)haxe.Exception.thrown(t);
		}
	
	}
	
	
	public static java.lang.Object callField(java.lang.Object obj, java.lang.String field, java.lang.Object[] args)
	{
		
		if (obj instanceof haxe.lang.IHxObject)
		{
			return ((haxe.lang.IHxObject) obj).__hx_invokeField(field, args);
		}

		return slowCallField(obj, field, args);
	
	}
	
	
	public static java.lang.Object getField(java.lang.Object obj, java.lang.String field, boolean throwErrors)
	{
		

		if (obj instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) obj).__hx_getField(field, throwErrors, false, false);

		return slowGetField(obj, field, throwErrors);

	
	}
	
	
	public static double getField_f(java.lang.Object obj, java.lang.String field, boolean throwErrors)
	{
		

		if (obj instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) obj).__hx_getField_f(field, throwErrors, false);

		return toDouble(slowGetField(obj, field, throwErrors));

	
	}
	
	
	public static java.lang.Object setField(java.lang.Object obj, java.lang.String field, java.lang.Object value)
	{
		

		if (obj instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) obj).__hx_setField(field, value, false);

		return slowSetField(obj, field, value);

	
	}
	
	
	public static double setField_f(java.lang.Object obj, java.lang.String field, double value)
	{
		

		if (obj instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) obj).__hx_setField_f(field, value, false);

		return toDouble(slowSetField(obj, field, value));

	
	}
	
	
	public static java.lang.String toString(java.lang.Object obj)
	{
		//line 547 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( obj == null )) 
		{
			//line 548 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		
		//line 550 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( ( ( obj instanceof java.lang.Number ) &&  ! (( obj instanceof java.lang.Integer ))  ) && haxe.lang.Runtime.isInt(((java.lang.Number) (obj) )) )) 
		{
			//line 551 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return java.lang.Integer.toString(((int) (haxe.lang.Runtime.toInt(obj)) ));
		}
		
		//line 552 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		return obj.toString();
	}
	
	
	public static boolean isFinite(double v)
	{
		//line 556 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( v == v )) 
		{
			//line 556 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return  ! (java.lang.Double.isInfinite(((double) (v) ))) ;
		}
		else
		{
			//line 556 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return false;
		}
		
	}
	
	
	public static int getIntFromNumber(java.lang.Number n)
	{
		//line 560 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( n == null )) 
		{
			//line 560 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return 0;
		}
		else
		{
			//line 560 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return n.intValue();
		}
		
	}
	
	
	public static double getFloatFromNumber(java.lang.Number n)
	{
		//line 564 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( n == null )) 
		{
			//line 564 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return 0.0;
		}
		else
		{
			//line 564 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return n.doubleValue();
		}
		
	}
	
	
	public static long getInt64FromNumber(java.lang.Number n)
	{
		//line 568 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( n == null )) 
		{
			//line 568 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return ((long) (0.0) );
		}
		else
		{
			//line 568 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return n.longValue();
		}
		
	}
	
	
	public static java.lang.Integer numToInteger(java.lang.Number num)
	{
		//line 572 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 572 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 572 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Integer.class)) 
			{
				//line 572 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Integer) (num) );
			}
			else
			{
				//line 572 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Integer.valueOf(((int) (num.intValue()) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Double numToDouble(java.lang.Number num)
	{
		//line 576 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 576 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 576 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Double.class)) 
			{
				//line 576 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Double) (num) );
			}
			else
			{
				//line 576 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Double.valueOf(((double) (num.doubleValue()) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Float numToFloat(java.lang.Number num)
	{
		//line 580 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 580 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 580 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Float.class)) 
			{
				//line 580 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Float) (num) );
			}
			else
			{
				//line 580 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Float.valueOf(((float) (num.floatValue()) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Byte numToByte(java.lang.Number num)
	{
		//line 584 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 584 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 584 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Byte.class)) 
			{
				//line 584 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Byte) (num) );
			}
			else
			{
				//line 584 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Byte.valueOf(((byte) (num.byteValue()) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Long numToLong(java.lang.Number num)
	{
		//line 588 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 588 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 588 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Long.class)) 
			{
				//line 588 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Long) (num) );
			}
			else
			{
				//line 588 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Long.valueOf(((long) (num.longValue()) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Short numToShort(java.lang.Number num)
	{
		//line 592 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
		if (( num == null )) 
		{
			//line 592 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			return null;
		}
		else
		{
			//line 592 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
			if (haxe.root.Std.isOfType(num, java.lang.Short.class)) 
			{
				//line 592 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return ((java.lang.Short) (num) );
			}
			else
			{
				//line 592 "C:\\Users\\LAT6440\\AppData\\Roaming\\haxe\\versions\\64bbaab\\std\\java\\internal\\Runtime.hx"
				return java.lang.Short.valueOf(((short) (num.shortValue()) ));
			}
			
		}
		
	}
	
	
}


