//Builder Design Pattern means to create complex object of simple object 


//Builder Pattern some trick how to identify

// 1) There is an interface that is target any particular class
// 2) And inside the interface define abstract method of each member variable and getInstanceOf that class 
// 3) There is a child class of Interface 
// 4) child class provide implementation of interface (Builder)
// 5) There is a class called Director containing one method that method take argument of Builder, and all member variable of Class
// 6) And then Director class set all possible argument into Builder object to get object 
// 7) Now client follow the pattern to get the object 
// 8) you can see the below example very simple

package com.test2;

class A{
	
	private String a1;
	
	private String a2;

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	@Override
	public String toString() {
		return "A [a1=" + a1 + ", a2=" + a2 + "]";
	}
	
	
}

interface Builder{
	public void setA1(String a1);
	public void setA2(String a2);
	public A getA();
}

class Child1 implements Builder{
	
	A obj=new A();

	@Override
	public void setA1(String a1) {
		obj.setA1(a1);
		
	}

	@Override
	public void setA2(String a2) {
		
		this.obj.setA2(a2);
		
	}

	@Override
	public A getA() {
		
		return obj;
	}
	
}


//Director 

class Director{
	
	public void construct(Builder obj,String a1,String a2) {
		
		obj.setA1(a1);
		obj.setA2(a2);
		
	}
}



public class BuilderDP {
	
	public static void main(String args[]) {
		  Director director= new Director();
		  Builder builder=new Child1();
		  director.construct(builder, "first", "second");
		  
		  A a = builder.getA();
		  
		  System.out.println("object is created :"+a);
		  
	}

}
