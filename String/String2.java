package com.test;

/* All Importance topic understand of String in Java
 * 
 * Type of String 
 * 1) Immutable --> not modifiable , String Literal
 * 2) mutable   --> modifiable    , StringBuffer , StringBuilder
 *    
 *    note : StringBuffer is a thread safe ie synchronized
 *           StringBuilder is not a thread safe 
 *           
 *   
 *  1) Let's Discuss about String class 
 *   - You can create object by Two using String class 
 *      a) String literal example : String str="Ram"
 *      b) By the new keyword  example String str=new String("Ram");
 *      
 *    What is the difference between both String literal and new 
 *    1) String literal object created on String constant pool (SCP)
 *    2) But New String() is created on Heap Memory
 *    
 *    1) If Two String literal value are same then only one object is created and only
 *       reference will return back to the reference variable
 *       
 *       example : String str="Ram";
 *                 String str2="Ram"; 
 *                 Here both are the equals hence only one object is created at SCP
 *                 and both are pointing to the same object 
 *                 
 *         But 
 *         
 *        String str="Ram";
 *        String str2=new String("Ram");
 *        In this case Two object is created with same hascode 
 *        
 *    Note : Hashcode for String Class
 *    --> In String class hascode is override from object class and made it so much
 *        Generallize ie , if content of String class's object is equals then they
 *        should have same hascode.
 *        
 *         
 *     Note: Hashcode for StringBuffered and StringBuilder Class
 *     
 *     --> In StringBuffer and StringBuilder have not hascode method is override 
 *         from object class hence it follow default hascode mechanism so it means that
 *         if you create object of two different object with same content then hascode will 
 *         be different for every object 
 *         
 *         Example : StringBuffer str= new StringBuffer("Ram");
 *                   StringBuffer str2=new StringBuffer("Ram");
 *                   hascode will be different here 
 *                        
 *    
 *     
 *    
 * 
 */

public class String2 {
	
	public static void main(String args[]) {
		StringBuffer str= new StringBuffer("Ram");
		StringBuffer str2=new StringBuffer("Ram");
		
		StringBuffer reverse = str.reverse();
		
		System.out.println(str.hashCode()+" "+str2.hashCode());
		
		System.out.println(reverse);
		
	}

}
