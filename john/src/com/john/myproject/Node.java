package com.john.myproject;

public class Node<T> { // generics data type
	T data; // data
	Node next; // link==node refernce to next node
	
	public Node(T type) {
		data = type;
		next = null;
	}

}
