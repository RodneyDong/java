package com.rodney.myproject;

public class OOP {

	public static void main(String[] args) {
		Student s1 = new Student ("John","Wang");
		s1.add(12.3, 5.4);
		s1.sayHello();
	}

}

class Student{
	private String firstName;
	private String lastName;
	private int grade;
	
	Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public void sayHello() {
		String firstName = "Rodney";
		System.out.println("Hi, I am" +firstName);
		System.out.println("Hi, I am" +this.firstName);

	}
}
