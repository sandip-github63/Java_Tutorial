package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Remove Duplicate element from string

public class RemoveDuplicateElement {
	
	public static void main(String args[]) {
		
		//Approach 1
		
		//input sandeep
		//output sandp

	/*	String str="sandeep";
		boolean flag;
		char[] arr = str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			flag=false;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					
					arr[j]='\u0000';
					flag=true;
					
				}
			}
			if(flag)
				arr[i]='\u0000';
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!='\u0000')
			System.out.print(arr[i]);
		}
		
	
	*/
	
	//Approach 2
	
	//input sandeep
	//output sandep	
		
	List<Character> list=new ArrayList<>();
	
	String str="sandeep";
	char[] arr = str.toCharArray();
	
	for(char ch:arr) {
		list.add(ch);
	}
	
	 List<Character> collect = list.stream().distinct().collect(Collectors.toList());
	 
	 collect.forEach(System.out::print);
	

	}
	
}
