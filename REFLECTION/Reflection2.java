package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sandip
 * 
 * How to create object using reflection by getting single method of that class.
 * 
 * 1) load class
 * 2) call static method of that class
 * 3) that static method is create the singleton object 
 *
 */
public class Reflection2 {
	
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		Class<AbstractValidator> c =(Class<AbstractValidator>) Class.forName("com.test.CurrencyValidator");
		
		Method m = c.getMethod("getInstance", new Class[] {});
		
		Validator interfaceType = (Validator)m.invoke(null,new Object[] {});
		
		System.out.println(interfaceType);
		
		
	}

}
