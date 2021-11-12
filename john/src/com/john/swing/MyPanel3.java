package com.john.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.JPanel;

public class MyPanel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	final int LEFT = 0;
	final int RIGHT = 1;
	final int UP = 2;
	final int DOWN = 3;
	final int MOVE_SIZE = 10;
	private Image card;
	private int x = 10;
	private int y = 10;
	private int direction = 0;

	Toolkit t = Toolkit.getDefaultToolkit(); // get instance of Toolkit

	public MyPanel3() {
		URL iconUrl = this.getClass().getResource("diamondK.gif");
		card = t.getImage(iconUrl);
		addKeyListener(new KeyControl());
		setFocusable(true); // very important, must be true for the panel listen the key board
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.drawImage(card, x, y, this); // "this" 是一个MyPanel实体类的个体（instance of class）。
	}

	public void move() {
		switch (direction) {
		case (LEFT):
			x -= MOVE_SIZE;
			break;
		case (RIGHT):
			x += MOVE_SIZE;
			break;
		case (UP):
			y -= MOVE_SIZE;
			break;
		case (DOWN):
			y += MOVE_SIZE;
			break;
		}
		repaint();
	}

	class KeyControl extends KeyAdapter { // inner class can use all attributes defined in outer class.

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				direction = LEFT;
				break;
			case KeyEvent.VK_RIGHT:
				direction = RIGHT;
				break;
			case KeyEvent.VK_UP:
				direction = UP;
				break;
			case KeyEvent.VK_DOWN:
				direction = DOWN;
				break;
			}
			move();
		}
	}
}
