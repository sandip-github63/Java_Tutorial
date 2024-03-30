package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//sort object of student by name 
class Student{
	
	private Integer id;
	
	private String name;
	
        private String dept;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(Integer id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
    
}

public class SortObjectByName {
	
	public static void main(String args[]) {
	
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(1,"sandeep","IT"));
		list.add(new Student(1,"aman","HR"));
		list.add(new Student(1,"arijit","IT"));
		list.add(new Student(1,"modi","HR"));
		
		 // Sorting in natural order based on name
		Collections.sort(list,Comparator.comparing(Student::getName));
		
		// Sorting in descending order based on name
                Collections.sort(list, Comparator.comparing(Student::getName).reversed());

		
		list.forEach(e->System.out.println(e.getName()));
		
			
	}

}
