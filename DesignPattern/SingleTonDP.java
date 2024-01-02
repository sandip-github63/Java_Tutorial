package com.test;

class A {
    private static A obj1;

    private A() {
    }

    public static A getA() {
       if(obj1==null) {
    	synchronized (A.class) {
    		 if (obj1 == null) {
    	            obj1 = new A();
    	        }			
		}
      }
       
        return obj1;
    }
}



public class SingleTonDP {
	public static void main(String args[]) {		
		
		
	}
}
