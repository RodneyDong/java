package com.john.test;

import com.john.myproject.InvalidValueException;
import com.john.myproject.SimpleMath;
import com.john.myproject.Teacher;

public class Test {
	static void simpleMathTest() {
		SimpleMath sm = new SimpleMath();
		try {
			double area = sm.circleArea(2.2);
			System.out.println(area);
			area = sm.circleArea(1.2);
			System.out.println(area);
			String a = "abc";
			String c = a.substring(4); // RuntimeException
			System.out.println(c);
		} catch (InvalidValueException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
	}

	static void swap(Teacher x1, Teacher x2) { // pass by reference
		Teacher tmp = x1;
		x1 = x2;
		x2 = tmp;	
		x1.setSsn("7777");
	}
	
	public static void main(String[] args){
		Teacher t1 = new Teacher("John", "1111");
		Teacher t2 = new Teacher("Rodney", "2222");
		swap(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Done.");
	}

}
