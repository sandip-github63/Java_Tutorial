package com.test;

public class Student {
	
	private String stdName;
	
	private String phoneNumber;

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", phoneNumber=" + phoneNumber + "]";
	}

}
