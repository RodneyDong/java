package com.john.swing;

import javax.swing.JFrame;

public class MovingImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovingImage() {
		initFrame();
		init();
	}
	
	private void init() {
		MyPanel1 panel = new MyPanel1();
		add(panel);
	}

	private void initFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moving Image");
	}

	public static void main(String[] args) {
		MovingImage frame = new MovingImage();
		frame.setVisible(true);
	}

}
