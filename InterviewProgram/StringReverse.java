package com.test;

//Reverse String 
public class StringReverse {
	
	public static void main(String args[]) {
		
	/*
		   String str="sandeep";
	
		   char[] arr = str.toCharArray();
		   
		   for(int i=0;i<str.length()/2;i++) {
			   char temp=arr[i];
			   arr[i]=arr[str.length()-1-i];
			   arr[str.length()-1-i]=temp;
		   }
		   
		   for(int i=0;i<=str.length()-1;i++) {
			   System.out.print(arr[i]);
		   }
	
	
	*/
		
	 //Second Apporach
		
	 StringBuilder s1=new StringBuilder("sandeep");
	 s1.reverse();
	 
	 String reverseString = s1.toString();
	 System.out.println(reverseString);
		
	
	
	}
}
