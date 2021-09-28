

import java.util.Scanner;

class Rectangle {
	
	public static void main(String[] args) {
		System.out.println("Calculates area and perimeter of Rectangles");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Width: ");
		double width = scanner.nextDouble();
		
		System.out.print("length: ");	
		double length = scanner.nextDouble();
		
		double area = width*length;
		double perimeter = width*2 + length*2;
		
		System.out.printf("The area of rectange %s by %s is %s\n",width,length,area);
		System.out.printf("The perimeter of rectange %s by %s is %s\n",width,length,perimeter);
		
		scanner.close();
	}

}
