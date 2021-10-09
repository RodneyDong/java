package com.john.myproject;

public class ExecutionControl {

	public static void main(String[] args) {
		System.out.println(getDays(4));

	}
	
	static String getDays(int i) {
		switch(i) {
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednsday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 7: return "Sunday";
		default:
			return "No such day.";
		}
	}

}
