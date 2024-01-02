package com.test;

import java.util.Scanner;

interface Mobile{
	public String getName();
}

class MI implements Mobile{

	@Override
	public String getName() {
		return "mi charger";
	}
	
}
class Samsung implements Mobile{

	@Override
	public String getName() {
		return "samsung charger";
	}
	
}

class IPhone implements Mobile{

	@Override
	public String getName() {
		return "iphone charger";
	}
	
}

interface Laptop{
	public String getName();
}

class Dell implements Laptop{

	@Override
	public String getName() {
		return "Dell charger";
	}
	
}
class HP implements Laptop{

	@Override
	public String getName() {
		return "HP charger";
	}
	
}
class Lenovo implements Laptop{

	@Override
	public String getName() {
		return "lenovo charger";
	}
	
}

abstract class AbstractFactory{
	public abstract Mobile mobileCharger(String req);
	public abstract Laptop laptopCharger(String req);
}


class MobileCharger extends AbstractFactory{

	public  Mobile mobileCharger(String req)
	{
		if(req.equalsIgnoreCase("MI")) {
			return new MI();
		}
		else if(req.equalsIgnoreCase("Iphone"))
			return new IPhone();
		else if(req.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else 
			return null;
		
	}

	@Override
	public Laptop laptopCharger(String req) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class LaptopCharger extends AbstractFactory{

	@Override
	public Mobile mobileCharger(String req) {
		// TODO Auto-generated method stub
		return null;
	}

	public  Laptop laptopCharger(String req) {
		if(req.equalsIgnoreCase("hp"))
			return new HP();
		else if(req.equalsIgnoreCase("Dell"))
			return new Dell();
		else if(req.equalsIgnoreCase("Lenovo"))
			return new Lenovo();
		else 
			return null;
		
	}
	
}

class ChargerFactory{
	
	public static AbstractFactory charger(String req) {
		if(req.equalsIgnoreCase("Mobile"))
			return new MobileCharger();
		else if(req.equalsIgnoreCase("laptop"))
			return new LaptopCharger();
		else
			return null;
	}
}

public class SecondExampleOfAbstractFactoryDP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Laptop charger or Mobile charger? :");
		String data=sc.nextLine();		
		AbstractFactory charger = ChargerFactory.charger(data);
		
		if(data!=null && data.equalsIgnoreCase("mobile")) {
			System.out.print("Enter mobile name :");
			data=sc.nextLine();	
			Mobile mobileCharger = charger.mobileCharger(data);
			System.out.println(mobileCharger.getName());
		}
		else if (data!=null && data.equalsIgnoreCase("laptop")) {
		    System.out.print("Enter Laptop name :");
		    data=sc.nextLine();	
		    Laptop laptopCharger = charger.laptopCharger(data);
		    System.out.println(laptopCharger.getName());
		} 
		else {
			System.out.println("Charger of "+data+" is not exist in our store ") ;
			return ;
		}
	}

}
