package com.john.myproject;

public class Teacher extends Person {

	public Teacher(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public Teacher() { // default contructor
		
	}
	
	@Override
	public String getOccuption() {
		// TODO Auto-generated method stub
		return "Teacher";
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public String toString() { // return a string represent this object
		return "Teacher [name=" + name + ", ssn=" + ssn + "]";
	}

	
	
}
