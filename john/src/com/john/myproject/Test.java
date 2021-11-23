package com.john.myproject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
	
	public static void printOccupation(Person p) { // defibne printOccupation method before Person.getOccupation() implemented.
		System.out.println(p.getOccuption()); // it is an agreement only at this moment.
	}

	static void oop() {
//		Occupation ocp=new Occupation();
//		Doctor d = new Doctor();
//		printOccupation(d);
//		Teacher t = new Teacher("John","111-22-3333");
//		printOccupation(t);
//		System.out.println(t);
//		Loop l = new Loop();
//		printOccupation(l); // the object of Loop is not a Person
//		Person p = new Person();
//		System.out.println(p.getOccuption());
//		Student s = new Student("John","Wang");
//		t = new Teacher(); // original t goes to garbage collection
//		t.setName("Helen");
//		t.setSsn("12345");
//		System.out.println(t);
		List<Person> list = new ArrayList<>();
		Teacher t21 = new Teacher("John","111-22-3333");
		t21.setAge(21);
		list.add(t21);
		Teacher t11 = new Teacher("Charles","111-22-3333");
		t11.setAge(11);
		list.add(t11);
		Teacher t13 = new Teacher("Alen","111-22-3333");
		t13.setAge(13);
		list.add(t13);
		Teacher t34 = new Teacher("Martin","111-22-3333");
		t34.setAge(34);
		list.add(t34);
		System.out.println("40: "+list);
		System.out.println(t21.compareTo(t21));
		Collections.sort(list);
		System.out.println("43: "+list);
		ArrayList<Operator> oList = new ArrayList<>();
		Collections.sort(oList);
//		Test.printOccupation(t21);
//		BigDecimal bd = new BigDecimal(1.1+2.2);
//		System.out.println(bd);
//		bd = bd.setScale(1, RoundingMode.HALF_UP);
//		System.out.println(bd);
//		BigDecimal bd2 = new BigDecimal(4.5);
//		BigDecimal bd3 = bd.add(bd2);
//		System.out.println(bd3);
		
	}
	
	static void doMath(MathOperation op) {
		System.out.println(op.add(2.1, 3.2));
	}
	
	static void testMathOpertion() {
		doMath(new MathOperation() {

			public double add(double x, double y) {
				// TODO Auto-generated method stub
				double z = x+y;
				return z;
			}

			public double sub(double x, double y) {
				// TODO Auto-generated method stub
				return 0;
			}

			public double mul(double x, double y) {
				// TODO Auto-generated method stub
				return 0;
			}

			public double div(double x, double y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		// use LinkedList as Stack(last-in-first-out (LIFO)): push() and pop()
		// use LinkedList as Queue(FIFO (first-in-first-out)): add() and pop()
		LinkedList<Teacher> list = new LinkedList<>();
		Teacher t1 = new Teacher("Rodney","111"); // top of stack represent of the list, first in linked list
		Teacher t2 = new Teacher("John","111");
		Teacher t3 = new Teacher("Charles","111"); // bottom of the stack
//		System.out.println(list);
//		Teacher t = list.poll();
//		System.out.println(t);
//		Collections.sort(list);
//		System.out.println(list);
//		list.push(new Teacher("Bob","222"));
//		Teacher t = list.pop();
//		System.out.println(t);
		
		// Queue (FIFO)
		list.add(t1);
		list.add(t2);
		list.add(t3);
		Teacher t = list.pop();
		System.out.println(t);
		System.out.println(list);
		t = list.pop();
		System.out.println(t);
		System.out.println(list);
		
		// Statck (FILO)
		
	}

}

