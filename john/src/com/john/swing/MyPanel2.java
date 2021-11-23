package com.john.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Random moving image
 * 
 * @author John
 *
 */
public class MyPanel2 extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final int DELAY = 100;
	private Image card;
	private int x = 10;
	private int y = 10;
	private Timer timer;
	Toolkit t = Toolkit.getDefaultToolkit(); // get instance of Toolkit
	
	public MyPanel2() {
		URL iconUrl = this.getClass().getResource("diamondK.gif");
		card = t.getImage(iconUrl);
		timer = new Timer(DELAY, this);
		timer.start();
	}
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.drawImage(card, x, y,this); // "this" 是一个MyPanel实体类的个体（instance of class）。
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int r = (int)(Math.random()*10);
		Random rand = new Random();
		boolean dir = rand.nextBoolean();
		if(dir) {
			x += r;
		}else {
			x -= r;
		}
		dir = rand.nextBoolean();
		if(dir) {
			y += r;
		}else {
			y -= r;
		}
		repaint();
	}
}
