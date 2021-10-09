package com.john.myproject;

public abstract class Person extends Object{
	protected String name;
	protected String gender;
	protected String ssn;
	protected int age;
	
	public abstract int add(int x, int y); // define a method without implementation
	
	public abstract String getOccuption();
	
	public double add(double x, double y) { // define a method with implementation
		return x + y;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
