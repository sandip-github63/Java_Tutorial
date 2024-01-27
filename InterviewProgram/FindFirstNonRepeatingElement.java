package com.test;

//Find first non repeating element from string
public class FindFirstNonRepeatingElement {
	
	public static void main(String args[]) {
		
		String str="zsansdandeer";
		boolean flag;
		boolean result=false;
		char[] arr = str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			flag=false;
			if(arr[i]!='\u0000')
			for(int j=i+1;j<=arr.length-1;j++) {
				 if(arr[i]==arr[j]) {
					 arr[j]='\u0000';
					 flag=true;
				 }
				 
				 if(j==arr.length-1 && !flag) {
					 result=true;
					 break;
				 }
			}
			
			if(result) {
				System.out.print("The First non Repeating element is :"+arr[i]);
				break;
			}
			
			if(i==arr.length-1 && arr[i]!='\u0000') {
				System.out.print("The First non Repeating element is :"+arr[i]); 
			}
		}
		
	}

}
