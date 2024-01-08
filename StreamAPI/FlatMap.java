/* To Perform operation on that attribute whose having value many(List of Value stored)
 * then that case Map is not good for us because Map return List of List data
 * 
 * so we have FlatMap on that case 
 * 
 *  Scenario to use Map and FlatMap
 *  
 *  1) When you are going to perform some operation on Object's any attribute then firstly
 *     check that attribute type if attribute is storing single object(i.e one to one mapping ) then you can use 
 *     Map function easily
 *     
 *  2) But If that object's attribute is storing list of data ie (one to Mapping condition)
 *     then you have to use FlatMap because it do the operation with flattering 
 *     flattering means it convert List of List or Stream of Stream into single Stream
 *     or List    
 *  
 *    example : [[9005011181, 7052563392], [8989898989, 9811449747]]
 *         Here there is list of data and the output is without flattering means list of 
 *         list 
 *         
 *         After Flattering it looks like this 
 *         
 *         [9005011181, 7052563392, 8989898989, 9811449747]
 *         
 *         It means that List of List is flattered on Single List By the help of FlatMap
 */


package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String args[]) {
		
		List<Student2> list=new ArrayList<Student2>();
		
		  List<String> listNumber= new ArrayList<String>();
		  listNumber.add("9005011181");
		  listNumber.add("7052563392");
		  
		  List<String> secondlist= new ArrayList<String>();
		  secondlist.add("8989898989");
		  secondlist.add("9811449747");
		  
		
		  Student2 s1 = new Student2();
		  s1.setStdName("Sandip");
		  s1.setPhoneNumber(listNumber);
		  
		  Student2 s2 = new Student2();
		  s2.setStdName("Pradeep");
		  s2.setPhoneNumber(secondlist);
		  
		  
		  list.add(s1);
		  list.add(s2);
		  
		  
		 List<List<String>> collect2 = list.stream().map(student->student.getPhoneNumber()).collect(Collectors.toList());
		 
		 List<String> collect = list.stream().flatMap(student->student.getPhoneNumber().stream()).collect(Collectors.toList());
		
		 System.out.println(collect2);
		 System.out.println(collect);
		
	}
}
