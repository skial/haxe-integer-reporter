// Generated by Haxe 4.2.0-rc.1+e6d21742f
package haxe.iterators;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayIterator<T> extends haxe.lang.HxObject
{
	public ArrayIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayIterator(haxe.root.Array<T> array)
	{
		//line 35 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		haxe.iterators.ArrayIterator.__hx_ctor_haxe_iterators_ArrayIterator(((haxe.iterators.ArrayIterator<T>) (this) ), ((haxe.root.Array<T>) (array) ));
		//line 35 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_iterators_ArrayIterator(haxe.iterators.ArrayIterator<T_c> __hx_this, haxe.root.Array<T_c> array)
	{
		//line 30 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		__hx_this.current = 0;
		//line 37 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 37 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			__hx_this.array = array;
		}
		
	}
	
	
	public haxe.root.Array<T> array;
	
	public int current;
	
	public final boolean hasNext()
	{
		//line 45 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		return ( this.current < this.array.length );
	}
	
	
	public final T next()
	{
		//line 53 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		return this.array.__get(this.current++);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				switch (field.hashCode())
				{
					case 1126940025:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("current")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							this.current = ((int) (value) );
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return value;
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				switch (field.hashCode())
				{
					case 1126940025:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("current")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							this.current = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return value;
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
					case 93090393:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("array")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							this.array = ((haxe.root.Array<T>) (value) );
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return value;
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("next")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
					case 93090393:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("array")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return this.array;
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
					case 1126940025:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("current")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return this.current;
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				switch (field.hashCode())
				{
					case 1126940025:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("current")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return ((double) (this.current) );
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		{
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("next")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return this.next();
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
							return this.hasNext();
						}
						
						//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		baseArr.push("current");
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		baseArr.push("array");
		//line 28 "C:\\Users\\scape\\AppData\\Roaming\\haxe\\versions\\e6d2174\\std\\haxe\\iterators\\ArrayIterator.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

