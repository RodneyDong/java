package com.john.myproject;

public class LinkedList {
	Node head; //
	Node tail; 
	
	public void add(Node node) {
		if(head==null) {
			this.head = node;
			this.tail = node;
		}else {
			tail.next = node;
			node.next = null;
		}
	}
	
	public void insert(Node node, Node newNode) { // insert a new node before node : homework1 implement this method
		
	}
	
	public Node next(Node node) {
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(); // StringBuilder()
		Node current = head;
		while (current.next!=null) {
			result.append(current.data);
			current = current.next; // feature of linked list 
		}
		result.append(current.data);
		return result.toString();
	}


	public static void main(String[] args) {
		Node<Person> node = new Node<Person>(new Teacher("John"));
		LinkedList list = new LinkedList();
		list.add(node);
		node = new Node(new Teacher("Rodney"));
		list.add(node);
		
		list.insert(node, new Node(new Teacher("Charles"))); // John, Charles, Rodney
		
		System.out.println(list);
		
		
	}

}
