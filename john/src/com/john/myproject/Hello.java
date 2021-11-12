package com.john.myproject;

import java.util.Arrays;

public class Hello {
	private String name; // class level variable
	
	public static double circleArea(double radius) { // pass by value
		double pi = 3.141593;   // isolated variable, method level variable
		// method can define a local variable which only visible within the method.
		radius += 1.0;
		return pi*Math.pow(radius, 2);
	}
	
//	public double circleCircumference(double radius) {
//		return 2.0 * pi * radius;
//	}
	
	static int sum(int[] a) { // pass by reference (address pointer)
		int sum = 0;
		a[1] = 10;            
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int[] x = {3,6,9};
		int sum = sum(x);
		System.out.println(sum);
		System.out.println(Arrays.toString(x));
		
		double r = 1.0;
		double area = circleArea(r);
		System.out.println(area);
		System.out.println(r);
	}

}
