

import java.util.Scanner;

class Pizza {
	
	public static void main(String[] args) {
		System.out.println("Calculate how many hours of cycle needed to burn the number of pizza you ate");
		Scanner scanner = new Scanner(System.in);
		
		int pizza = 355;
		int cycleOneHour = 550;
		
		System.out.print("Number of pizza you ate: ");
		int pizzaCount = scanner.nextInt();
		
		int hours = pizza*pizzaCount/cycleOneHour;
		double minutes = Math.round((pizza*pizzaCount%(double)cycleOneHour)/cycleOneHour*60.0); // remainder of total calories divided by 550 then divides by 550, at last times 60 to find the exact minute
		
		System.out.println("You need "+hours+" hours "+ (int)minutes+" minutes of cycling to burn the calories of "+pizzaCount+" pizzas.");
		scanner.close();
	}

}

