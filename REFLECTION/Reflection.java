package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author sandip
 * 
 * Reading Reflection API in depth 
 *
 */


public class Reflection {
	
	public static void main(String args[]) throws Exception{
		
		Cat cat = new Cat("Cat1",20,"Nepal");		
	
		//getting fields of the class 
		
		Field[] fields = cat.getClass().getDeclaredFields();
		
		
		for(Field f :fields) {
			if(f.getName().equals("name")) {
				f.setAccessible(true);
				f.set(cat,"Bilariya");
			}
		}
		
	    
	    //calling method type 
	    //m.invoke(object1);  calling instance member method with no argument
	    // m.invoke(object1,20); calling instance member method with 1 argument
	    // m.invoke(null) calling static memeber method with no args
	    // m.invoke(null,2) calling static memeber method with 1 argument
		

	
		
		Method[] methods = cat.getClass().getDeclaredMethods();
		
		for(Method method:methods) {
			
			if(method.getName().equals("meow")) {
			  method.setAccessible(true);
			  method.invoke(cat,2); //access instance memeber method with 1 args
			 
			}
		}	
		
		
	    Method[] methodss = cat.getClass().getDeclaredMethods();
	    
	    for(Method m:methodss) {
	        if(m.getName().equals("meowwithstatic")) {
	        	m.setAccessible(true);
	        	m.invoke(null);//calling static member method with no argument
	        }
	    }
	    
	    
	    System.out.println("_____________________________________________________________________");
	   
	    // how to create a class object at run time by using reflection in java
	    
	    try {
	    	Class<?> myClass = Class.forName("com.test.Cat");
	    	
	    	 // Step 2: Create an instance using the default constructor
	    	Object obj1 = myClass.newInstance();
	    	
	    	 // Alternatively, if the class has a parameterized constructor:
	    	
	    	Constructor<?> constructor = myClass.getConstructor(String.class,int.class,String.class);
	    	Object obj2 = constructor.newInstance("name",20,"address");
	    	
	    	System.out.println(obj1);
	    	System.out.println(obj2);
	    	
	    	
	    	 
	    }catch(Exception e) {
	    	
	    }
	}

}
