package com.minipanda.bracket.util;


public class ReflectUtils {

	public static Class getClass(Object o){
		if(o == null){
			throw new IllegalArgumentException("������Ϊ��null��");
		}
		return o.getClass();
	}
	
	
	
}
