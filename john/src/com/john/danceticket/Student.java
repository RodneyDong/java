package com.john.danceticket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Student class used to store student information about the dance tickets.
 * 
 * @author John
 *
 */
public class Student implements Comparable<Student>{
	public static final String filename = "tickets.csv";
	private int id;
	private String name;
	private int earlyBirdTickets;
	/**
	 * number of door price tickets.
	 */
	private int doorTickets;
	static BinaryTree students = new BinaryTree();
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	
	public int getEarlyBirdTickets() {
		return earlyBirdTickets;
	}

	public void setEarlyBirdTickets(int earlyBirdTickets) {
		this.earlyBirdTickets = earlyBirdTickets;
	}

	/**
	 * this is a getter method for class attribute doorTicket.
	 * 
	 * @return return private attribute doorTickets for number of door price tickets.
	 */
	public int getDoorTickets() {
		return doorTickets;
	}

	public void setDoorTickets(int doorTickets) {
		this.doorTickets = doorTickets;
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return id==other.getId();
		}else
		return false;
	}

	@Override
	public int hashCode() {
		return Integer.valueOf(id).hashCode();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	@Override
	public int compareTo(Student other) {
		Integer myId = Integer.valueOf(id);
		return myId.compareTo(other.getId());
	}

	/**
	 * save() method save one student to storage file: ticket.csv
	 */
	public void save() {
		try {
			String output = id+","+name+","+earlyBirdTickets+","+this.doorTickets+"\n";
			FileWriter writer = new FileWriter(filename, true);
			writer.write(output);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Save all students information from BinaryTree to storage file named ticket.csv.
	 */
	public static void saveAll() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
			bw.write("id,name,early bird,door price\n");
			saveAll(students.root, bw);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Recursive function output students in the order of student id.
	 * 
	 * @param current is current node
	 * @param bw is output file BufferedWriter.
	 */
	private static void saveAll(Node<Student> current, BufferedWriter bw) {
		if (current != null) {
			saveAll(current.left, bw);
			Student s = current.student;
			try {
				bw.write(s.getId() + "," + s.getName() + "," + s.getEarlyBirdTickets() + "," + s.getDoorTickets()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			saveAll(current.right, bw);
		}		
	}
	
	public String getName() {
		return this.name;
	}

	public static void loadAll() {
		students = new BinaryTree();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			List<Student> studentList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			br.close();
			Collections.sort(studentList);
			Student student = studentList.get(studentList.size()/2);
			students.add(student);
			for(Student s : studentList) {
				students.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Function<String, Student> mapToItem = (line) -> {
		String[] items = line.split(",");
		int id = Integer.parseInt(items[0].trim());
		String name = items[1];
		int earlyBird = Integer.parseInt(items[2].trim());
		int doorPrice = Integer.parseInt(items[3].trim());
		Student student = new Student(id, name);
		student.setDoorTickets(doorPrice);
		student.setEarlyBirdTickets(earlyBird);
		return student;
	};
	
	
}
