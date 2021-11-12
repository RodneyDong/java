package com.john.swing;

import javax.swing.JFrame;

public class RandomMovingImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RandomMovingImage() {
		initFrame();
		init();
	}
	
	private void init() {
		MyPanel2 panel = new MyPanel2();
		add(panel);
	}

	private void initFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moving Image");
	}

	public static void main(String[] args) {
		RandomMovingImage frame = new RandomMovingImage();
		frame.setVisible(true);
	}

}
