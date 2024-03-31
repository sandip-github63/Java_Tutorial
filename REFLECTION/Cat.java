package com.test;

public class Cat {
	
	private String name;
	
	private int age;
	
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cat(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	private void meow(int a) {
		System.out.println("meow");
	}
	
	
	private static void meowwithstatic() {
		System.out.println("I am static method ");
	}
	
	
	

}
