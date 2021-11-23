package com.john.swing;

import javax.swing.JFrame;

public class BouncedImage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 400;
	static final int HEIGHT = 400;
	
	public BouncedImage() {
		initFrame();
		init();
	}
	
	private void init() {
		MyPanel4 panel = new MyPanel4();
		add(panel);
	}

	private void initFrame() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moving Image");
	}

	public static void main(String[] args) {
		BouncedImage frame = new BouncedImage();
		frame.setVisible(true);
	}

}