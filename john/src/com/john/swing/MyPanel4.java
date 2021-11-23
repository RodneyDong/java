package com.john.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel4 extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DELAY = 40;
	private static final int MOVE_SIZE = 10;
	private static final int BOUNCE_WIDTH = BouncedImage.WIDTH-20;
	private static final int BOUNCE_HEIGHT = BouncedImage.HEIGHT-35;
	
	Toolkit t = Toolkit.getDefaultToolkit(); // get instance of Toolkit
	private Timer timer;
	private Image apple;
	private int x = 10;
	private int y = 10;
	private boolean xRight = true;
	private boolean yRight = true;
	private int imageWidth = 10;

	MyPanel4(){
		loadImage();
		timer = new Timer(DELAY, this);
		timer.start();
		
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.drawImage(apple, x, y, this); // "this" 是一个MyPanel实体类的个体（instance of class）。
	}

	private void loadImage() {
		URL iconUrl = this.getClass().getResource("resources/apple.png");
		apple = t.getImage(iconUrl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bounce();
		repaint();
	}

	private void bounce() {
		if (xRight ) {
			x += MOVE_SIZE;
		}else{
			x -= MOVE_SIZE;
		}
		if (yRight  ) {
			y += MOVE_SIZE;
		}else{
			y -= MOVE_SIZE;
		}
		// bounce
		if ( x > (BOUNCE_WIDTH - imageWidth )) {
			x -= MOVE_SIZE;
			xRight = false;
		}
		if ( y > (BOUNCE_HEIGHT - imageWidth )) {
			y -= MOVE_SIZE;
			yRight = false;
		}
		if ( x <0) {
			x += MOVE_SIZE;
			xRight = true;
		}
		if ( y <0) {
			y += MOVE_SIZE;
			yRight = true;
		}
	}
}
