package com.rodney.assignment1;
import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		System.out.println("Squares and Cubes");
		System.out.print("Enter a positive integer less than 100: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.printf("%8s%10s%10s\n", "Number","Square","Cube");
		for(int i=1; i<=num; i++) {
			System.out.printf("%8d%10d%10d\n", i,i*i,i*i*i);
		}
		scanner.close();
	}
}
