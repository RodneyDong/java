package com.rodney.myproject;

import java.util.Scanner;

class change_maker {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the total purchase: ");
		double purchase = scanner.nextDouble();
		
		System.out.print("Please enter the amount tendered: ");
		double tender = scanner.nextDouble();
		
		double change = tender-purchase;
		
		double values[] = {10.00,5.00,2.00,1.00,0.25,0.05,0.1};
		String names[] = {" ten-dollar bill"," five dollar bill"," two dollar bill"," lonnie"," quarter"," nickel"," pennie"};
		
		int index = 0;
		for (double i: values) {
			index += 1;
			if (change >= i) {
				double count = (int)(change/i);
				System.out.println((int)count+names[index-1]);
				change -= i*count;
			}
		}
	}

}
