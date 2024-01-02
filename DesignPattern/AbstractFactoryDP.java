package com.test;

import java.util.Scanner;

interface Bank{
	public String getName();
}
class YesBank implements Bank{

	@Override
	public String getName() {
		return "Yes Bank";
	}
	
}
class HDFC implements Bank{

	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
}
class Kotak implements Bank{

	@Override
	public String getName() {
		return "Kotak Bank";
	}
	
}

abstract class AbstractClass{
	
	abstract public Bank factoryMethod(String req);
}

class ChildAbstactFactory extends AbstractClass{

	@Override
	public Bank factoryMethod(String req) {
		
		if(req.equalsIgnoreCase("yesbank"))
			return new YesBank();
		else if(req.equalsIgnoreCase("HDFC"))
			return new HDFC();
		else if(req.equalsIgnoreCase("kotak"))
			return new Kotak();
		else 
			return null;
	}
	
}

class Factory{
	 public static AbstractClass getFactory() {
		 return new  ChildAbstactFactory();
		 
	 }
}


public class AbstractFactoryDP {

	public static void main(String args[]) {
		 
		 Scanner s=new Scanner(System.in);
		 String data=s.nextLine();
		 
		 AbstractClass factory = Factory.getFactory();
		 Bank bank = factory.factoryMethod(data);
		 data= bank.getName();
		 
		 
		 System.out.println(data);
	}
}

