package com.rodney.myproject;

import java.util.Scanner;

import java.util.Arrays;

class levels {
	public static int calculateLevel(int grade) {
		int sections[] = {50, 60, 70, 80, 90};
		int count = 0;
		for ( int i: sections) {
			count += 1;
			if (grade < i){
				return (count-1);
			}
			if (grade>90) {
				return 4;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your grade: ");
			int grade = scanner.nextInt();
			if ((grade > 100) && (grade < 1)){
				System.out.print("Error: Grade has to be between 1 and 100 ");
				continue;
			}
			System.out.println(grade + " is in level " + calculateLevel(grade) );
			break;
			}
	}	

}

