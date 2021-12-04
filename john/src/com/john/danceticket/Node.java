package com.john.danceticket;

public class Node {
	Student student;
	Node left;
	Node right;
	
	public Node(Student student) {
		this.student = student;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "Node [student=" + student + "]";
	}
	
}
