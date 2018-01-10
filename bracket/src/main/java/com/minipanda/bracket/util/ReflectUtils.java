package com.minipanda.bracket.util;


public class ReflectUtils {

	public static Class getClass(Object o){
		if(o == null){
			throw new IllegalArgumentException("对象不能为空null！");
		}
		return o.getClass();
	}
	
	
	
}
