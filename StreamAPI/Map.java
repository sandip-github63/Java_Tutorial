package com.test;

// If data is store one to one then Map is good for that 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {	
	public static void main(String args[]) {
		
		Student s1=new Student();
		s1.setStdName("sandip");
		s1.setPhoneNumber("70525563392");
		
		Student s2=new Student();
		s2.setStdName("Aman");
		s2.setPhoneNumber("9005011181");
		
	    List<Student> list=new ArrayList<Student>();
	    
	    list.add(s2);
	    list.add(s1);
	    
	    
	     //requirment is to get all student phone number
	     List<String> collect = list.stream().map(student->student.getPhoneNumber()).collect(Collectors.toList());
	    
	     System.out.println(collect);
	     
	    
		
		
		
	}
}
