package com.rodney.assignment1;
import java.util.Scanner;

class Levels {
	public static int calculateLevel(int grade) {
		int sections[] = { 50, 60, 70, 80, 90 };
		int count = 0;
		for (int i : sections) {
			count += 1;
			if (grade < i) {
				return (count - 1);
			}
			if (grade > 90) {
				return 4;
			}
		}
		return 0;
	}

	static int getLevel(int grade) {
		if (grade < 50)
			return 0;
		if (grade < 60)
			return 1;
		if (grade < 70)
			return 2;
		if (grade < 80)
			return 3;
		return 4;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your grade: ");
			int grade = scanner.nextInt();
			if ((grade <= 100) && (grade >= 0)) {
				System.out.println(grade + " is in level " + getLevel(grade));
				break;
			}
			System.out.println("Error: Grade has to be between 1 and 100 ");
		}
		scanner.close();
	}

}
