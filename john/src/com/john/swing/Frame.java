package com.john.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame { 
	private static final long serialVersionUID = 1L;
	
// everything defined in JFrame as public or protected can be used directly, Frame is a JFrame, is relationship
	String title = "My Frame";
	public Frame() {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		JButton btn = new JButton("Click");
		add(btn);
		btn.setBounds(130, 100, 100, 40);
		setLayout(null);
	}
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true);  

	}

}
