package com.test;

import java.util.List;

public class Student2 {
	
    private String stdName;
    
	private List<String> phoneNumber ;

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student2 [stdName=" + stdName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
