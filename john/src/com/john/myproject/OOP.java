package com.john.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP { // Object Oriented Programming (class: name, attribute/variable, method/function)

	public static void main(String[] args) {
		Student s1 = new Student("John", "Wang"); // s1 is an object/instance of Student
		System.out.println(s1.add(12.3, 5.4));
		s1.sayHello();    // 1. create instance; 2. call methods
		Student s2 = new Student("Rodney", "Dong"); // developer defined data type
		s2.sayHello();
		
		String s3 = new String("Rodney");
		String s4 = new String("Rodney");
		System.out.println(s3==s4);  // same value but different object

		s3 = "Rodney"; // "Rodney" is a constant string value
		s4 = "Rodney";
		System.out.println(s3==s4);
		
		Player player1 = new Player("John");
		Player player2 = new Player("Rodney");
		System.out.println(player1);
		System.out.println(player2);
		player1.addScore(10);
		player2.addScore(15);
		System.out.println(player1.toString() + ":"+ player1.getScore());
		System.out.println(player2.toString() + ":"+ player2.getScore());
		player1.addScore(11);
		player2.addScore(25);
		System.out.println(player1.toString() + ":"+ player1.getScore());
		System.out.println(player2.toString() + ":"+ player2.getScore());
		
		ArrayList<Player> playerList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter player name, n for terminate: ");
			String name = input.nextLine();
			if(name.equalsIgnoreCase("n")) break;
			Player p = new Player(name);
			playerList.add(p);
		}
		
		for(int i=0; i<playerList.size(); i++) {
			System.out.println(playerList.get(i));
		}
		input.close();
	}
}

class Card{ // Data type
	
}

class Player{ // design for same kind of object in the real world
	private int totalScore;
	private String name;
	private ArrayList<Card> hand;
	
	Player(String name){
		this.name = name;
	}
	public void addScore(int score) {
		this.totalScore += score;
	}
	
	public int getScore() {
		return totalScore;
	}
	@Override
	public String toString() { // return a string represent the object
		return "Player [name=" + name + "]";
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}

class Student{
	private String firstName; // self.__firstName (protected, cannot be accessed by)
	private String lastName; // attribute
	private int grade; // define a primitive data type
	private String gender; // define a Java defined data type
	private int id;
	
	Student(String firstName, String lastName){ // constructor is also a special method
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public double add(double x, double y) { // method
		return x + y;
	}
	
	public void sayHello() {
		System.out.println("Hi, I am " + this.firstName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}