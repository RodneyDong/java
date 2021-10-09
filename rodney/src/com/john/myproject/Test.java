package com.john.myproject;

public class Test {
	static void printOccupation(Person p) {
		System.out.println(p.getOccuption());
	}

	public static void main(String[] args) {
//		Occupation ocp=new Occupation();
		Doctor d = new Doctor();
		printOccupation(d);
		Teacher t = new Teacher("John","Wang");
		printOccupation(t);
//		Loop l = new Loop();
//		printOccupation(l); // the object of Loop is not a Person
//		Person p = new Person();
//		System.out.println(p.getOccuption());
		Student s = new Student("John","Wang");
	}

}

