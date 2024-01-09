package com.test;

/*
 *  Decorator pattern says that add additional feature on the same object without modifying the object 
 */

interface Mobile{
	public Integer getPrice();
	public String getMobileName();
}

class RedMI implements Mobile {

	@Override
	public Integer getPrice() {
		
		return 12000;
	}

	@Override
	public String getMobileName() {
		
		return "Redmi note 12";
	}
	
	
}

abstract class Decorator implements Mobile{
	
	protected Mobile mobile;
	
	public Decorator(Mobile mobile) {
		this.mobile=mobile;
		
	}

	@Override
	public Integer getPrice() {
		
		return mobile.getPrice();
	}

	@Override
	public String getMobileName() {
		
		return mobile.getMobileName();
	}
}

class RedMIPro extends Decorator {

	public RedMIPro(Mobile mobile) {
		super(mobile);
		
	}
	

	@Override
	public Integer getPrice() {
		
		return mobile.getPrice()+1000;
	}

	@Override
	public String getMobileName() {
		
		return mobile.getMobileName()+" Pro";
	}
	
	
}


public class DecoratorDP {
	
	public static void main(String args[]) {
		
		RedMI redMI = new RedMI();
		System.out.println("Price :"+redMI.getPrice()+"  "+redMI.getMobileName());
		
		RedMIPro redMIPro = new RedMIPro(redMI); 
		
		System.out.println("Price :"+redMIPro.getPrice()+"  "+redMIPro.getMobileName());
		
		
	}

}
