

import java.util.Scanner;

class Cylinder {
	
	public static void main(String[] args) {
		System.out.print("Calculates Volume and Surface Area of Cylinders\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("height: ");
		double height = scanner.nextDouble();
		
		System.out.print("radius: ");	
		double radius = scanner.nextDouble();
		
		double volume = Math.PI*radius*radius*height;
		double surfaceArea = 2*Math.PI*radius*height+2*Math.PI*radius*radius;
		
		System.out.printf("The volume of cylinder is %.1f\n",volume);
		System.out.printf("The surface area of cylinder is %.1f\n",surfaceArea);
		
		scanner.close();
	}

}