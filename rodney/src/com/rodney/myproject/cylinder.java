package com.rodney.myproject;

import java.util.Scanner;

class cylinder {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("height: ");
		int height = scanner.nextInt();
		
		System.out.print("radius: ");	
		int radius = scanner.nextInt();
		
		double volume = Math.PI*radius*radius*height;
		double surfaceArea = 2*Math.PI*radius*height+2*Math.PI*radius*radius;
		
		System.out.println("The volume of cylinder h= %s r= %s is %s".formatted(height,radius, String.format("%.1f", volume)));
		System.out.println("The surface area of cylinder h= %s r= %s is %s".formatted(height,radius, String.format("%.1f", surfaceArea)));
	}

}
