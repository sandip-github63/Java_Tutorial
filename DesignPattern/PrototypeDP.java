package com.test;

interface Prototype{
	
	public Prototype getClone();
	
}
class Car implements Prototype{
	
	private Integer gear;
	
	public Car(Integer gear) {
		this.gear=gear;
	}

	public Integer getGear() {
		return gear;
	}

	public void setGear(Integer gear) {
		this.gear = gear;
	}

	@Override
	public Prototype getClone() {
		return new Car(this.gear);
	}
	
}

public class PrototypeDP {
	public static void main(String args[]) {
		
  		 Car car = new Car(5);
		 System.out.println(car.getGear());		 
		 Car car2=(Car)car.getClone();
		 System.out.println(car2.getGear());
		 
		 System.out.println(car.hashCode());
		 System.out.println(car2.hashCode());
	
	}

}
