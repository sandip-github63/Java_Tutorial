package com.test2;

/*
 * Real life example : Iphone is only charging by iphone charger. but what if you dont have iphone charger. then you 
 *   can use Android charger to charge the iphone. But Iphone not support android charger then you can just
 *   purchase adapter that can provide functionality to charger Iphone by android charger this is called Adapter desing pattern 
 *   
 *   
 *  2) Adapter design pattern says that if an object require the functionality of another object but another object is not compatible with
 *     that object then you can use Interface by the help of interface you can make it compatible so that object1 is use 
 *     the functionality of object2 and do the needful.
 */

class AndroidCharger{
	
	public void charger() {
		System.out.println("mobile is charging using android charger");
	}
	
}

interface Adapter{
	public void connectorAndroidToIphoneCharger();
}

class Iphone implements Adapter{
	
	private AndroidCharger androidCharger;
	
	public Iphone(AndroidCharger androidCharger) {
		this.androidCharger=androidCharger;
		
	}

	@Override
	public void connectorAndroidToIphoneCharger() {
		
		this.androidCharger.charger();
	}	
	
	
}

public class AdapterDesingPattern {
	
	public static void main(String args[]) {
		 
		Iphone iphone = new Iphone(new AndroidCharger());
		iphone.connectorAndroidToIphoneCharger();	
		
	}

}
