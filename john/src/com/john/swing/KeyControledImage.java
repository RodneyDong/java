package com.john.swing;

import javax.swing.JFrame;

public class KeyControledImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KeyControledImage() {
		initFrame();
		init();
	}
	
	private void init() {
		MyPanel3 panel = new MyPanel3();
		add(panel);
	}

	private void initFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moving Image");
	}

	public static void main(String[] args) {
		KeyControledImage frame = new KeyControledImage();
		frame.setVisible(true);
	}

}
