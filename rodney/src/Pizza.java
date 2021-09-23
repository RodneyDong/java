import java.util.Scanner;

class Pizza {
	
	public static void main(String[] args) {
		int pizza = 355;
		int cycleOneHour = 550;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of pizza you ate: ");
		int pizzaCount = scanner.nextInt();
		
		int hours = pizza*pizzaCount/cycleOneHour;
		double minutes = Math.round((pizza*pizzaCount%550.0)/550.0*60.0);
		
		System.out.println("You need "+hours+" hours "+ (int)minutes+" minues to burn the calories of "+3+" pizzas.");
		scanner.close();
	}

}

