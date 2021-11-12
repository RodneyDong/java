package com.john.swing;

import javax.swing.JFrame;

public class OpenWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame("My First Window");
		f.setSize(640, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
