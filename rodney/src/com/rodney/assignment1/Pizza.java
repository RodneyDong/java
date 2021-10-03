package com.rodney.assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Pizza { // can only be used within the same package
	private String name; // instance variable, or attribute
	double z = 4.3;
	
	public Pizza(String name){ // constructor is a special method, has same name as class name
		this.name = name;
	}
	
	@Override // originally defined in Object class
	public String toString() {
		return "Pizza [name=" + name + "]";
	}

	public void addTopping(String topping) { // instance level method
		double z = 5.6; // local scope
		System.out.println(z);
		System.out.println(this.z);
		System.out.println(name);
	}
	
	public static double add(double x, double y) { // class level method
//		System.out.println(name); // cannot use instance level variable
		return x + y;
	}

	public static void main(String[] args) { // static method is a class level method.
		int pizza = 355;
		int cycleOneHour = 550;
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		System.out.println(add(2,4)); // call static method inside a static method
		
		Pizza p = new Pizza("Macronine");
		p.addTopping("mashroom");
		System.out.println(Pizza.add(5, 4)); // call static method in static way (use class name to call)
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of pizza you ate: ");
		int pizzaCount = scanner.nextInt();
		
		int hours = pizza*pizzaCount/cycleOneHour;
		double minutes = Math.round((pizza*pizzaCount%550.0)/550.0*60.0);
		
		System.out.println("You need "+hours+" hours "+ (int)minutes+" minues to burn the calories of "+pizzaCount+" pizzas.");
		scanner.close();
	}

}

