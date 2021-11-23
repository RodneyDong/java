package com.john.swing;

import javax.swing.JFrame;

public class DisplayBufferedImage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	public DisplayBufferedImage() {
		initFrame();
		init();
	}
	
	private void init() {
		MyPanel5 panel = new MyPanel5();
		add(panel);
	}

	private void initFrame() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moving Image");
	}

	public static void main(String[] args) {
		DisplayBufferedImage frame = new DisplayBufferedImage();
		frame.setVisible(true);
	}

}
