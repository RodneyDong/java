package com.rodney.myproject;

import java.util.Scanner;

class rectangle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Width: ");
		int width = scanner.nextInt();
		
		System.out.print("length: ");	
		int length = scanner.nextInt();
		
		int area = width*length;
		int perimeter = width*2 + length*2;
		
		System.out.println("The area of rectange %s by %s is %s".formatted(width,length,area));
		System.out.println("The perimeter of rectange %s by %s is %s".formatted(width,length,perimeter));
	}

}
