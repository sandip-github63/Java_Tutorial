package com.test;

/*  Facade Design pattern says that provide a simple interface to a set of interface
 *  in a subsystem, making it easier for client to interact with the system by 
 *  hiding its complexity behind it.
 *  
 *  Facade pattern provide an interface by which client interact so that client 
 *  don't need to headache about its subprocess client can use it easily because
 *  Facade's interface internally call the subsystem of that related task.
 *  
 *  
 *  Real Life example of Facade Design Pattern
 *  *****************************************************************************
 *  Amazon Website provides the interface where we can purchase the various product.
 *  suppose you are purchasing the mobile then you simple order it by amazon.
 *  but it is not a completed task to purchase although the amazon internall call 
 *  the subsystem to purchase any mobile like first it call from which store the mobile
 *  should be taken MI store , Samsung Store ..etc . and Which Delivery client to 
 *  assign the particular mobile for delivery and which payment should be accepted ..
 *  these all are the subsystem . Think that if amazon share these subsystem of client
 *  during order then client have headche hence it won't do like that for simplify 
 *  the order amazon just provide a simple interface to the client and hide the internal
 *  subsystem from the client and call it internally to achieve it .
 *  
 *  that process is called Facade design pattern.
 *  
 *  
 *  Hiding the internal subsystem and providing the simplify interface to the client.
 *  and internal subsystem is called by simplify interface interface .
 *  
 *  
 *  To perform complex task then we need many subsystem so we just call subsystem internally 
 *  and provide the simple interface to the user or client .
 *  
 *  
 */

class Mobile {
	
	public void mobileName() {
       System.out.println("Mobile is Ordering");		
	}
}

class DeliveyAgent{
	
     public void deliveryAgent() {
    	 System.out.println("Assinging to the DeliveryAgent");
     }
	
}

class Payment{
	
	
	
	public void payment() {
        System.out.println("Payment is accepting");	
	}
	
}

class Amazon{
	
	private Mobile mobile;
	private DeliveyAgent deliveyAgent;
	private Payment payment;
	
	public Amazon() {
		this.mobile=new Mobile();
		this.deliveyAgent=new DeliveyAgent();
		this.payment=new Payment();
	}
	
	public void purchaseMobile() {
		
		this.mobile.mobileName();
		this.payment.payment();
		this.deliveyAgent.deliveryAgent();
		
	}
}

public class FacadeDP {
	
	public static void main(String args[]) {
	  
	  Amazon amazon = new Amazon();
	  amazon.purchaseMobile();
		 
	}

}
