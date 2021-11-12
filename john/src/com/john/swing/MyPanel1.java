package com.john.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Diagonal moving image
 * 
 * @author John
 *
 */
public class MyPanel1 extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int DELAY = 100;
	private Image card;
	private int x = 10;
	private int y = 10;
	private Timer timer;
	Toolkit t = Toolkit.getDefaultToolkit(); // get instance of Toolkit
	
	public MyPanel1() {
		URL iconUrl = this.getClass().getResource("diamondK.gif"); // 125x170
		card = t.getImage(iconUrl);
		System.out.println(card.getClass().getName());
		
//		timer = new Timer(DELAY, new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				x +=5;
//				y +=5;	
//				repaint();
//			}
//		});
		timer = new Timer(DELAY, this);
		timer.start();
	}
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.drawImage(card, x, y,this); // "this" 是一个MyPanel实体类的个体（instance of class）。
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		x +=5;
		y +=5;	
		repaint();
	}
}
