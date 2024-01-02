/*
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
  class HDFC implements Bank {
  
  	@Override
  	public String getName() {
  		return "HDFC Bank";
  	}
  
  	
  }
  class ICICI implements Bank{
  
  	@Override
  	public String getName() {
  		return "ICICI Bank";
  	}
  
  	
  }
  
  class FactoryClass{
   
  	public static Bank factoryMethod(String req) {
  	
  		 if(req.equalsIgnoreCase("HDFC")) 
  			 return new HDFC();
  		 else if(req.equalsIgnoreCase("YesBank"))
  			 return new YesBank();
  		 else if (req.equalsIgnoreCase("ICICI"))
  			 return new ICICI();
  		 else
  			 return null;
  	}
  }
  
  public class FactoryDP {
  	public static void main(String args[]) {
  		
  		 Scanner s1= new Scanner(System.in);
  		 String data = s1.nextLine();
  	
  		 Bank b = FactoryClass.factoryMethod(data);		 
  		 
  		 System.out.println(b.getName());
  		
  	}
  }
*/