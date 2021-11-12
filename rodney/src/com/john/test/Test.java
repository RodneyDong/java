package com.john.test;

import com.john.myproject.*;

public class Test {

	public static void main(String[] args) {
		Doctor d = new Doctor("John");
		System.out.println(d.getOccuption());
		double d1 = d.add(1.1, 2.2);
		System.out.println(d1);
		int i = d.add(3, 4);
		System.out.println(i);
		Teacher t = new Teacher("John", "111-22-3333");
		d1 = t.add(1.1, 2.2);
		System.out.println(d1);
		i = t.add(3, 4);
		System.out.println(i);
		System.out.println(t);
		com.john.myproject.Test.printOccupation(d);
	}

}
