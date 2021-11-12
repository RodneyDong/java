package com.john.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Display Image on JPanel by paint() and drawImage() method
 * 
 * 1. anonymous class (new ActionListener(){...}
   2. Named class (MyAction1)
   3. implements ActionListener
   
 * @author John
 *
 */
public class DisplayImage extends JFrame implements ActionListener, Comparable{ // Java allow class implements more than one interface

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyPanel p = new MyPanel("diamondK.gif");
	boolean flag = true;

	public DisplayImage() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Click");
		btn.addActionListener(new ActionListener() { // 1. only for this button
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setVisible(flag);
				repaint();
				flag = !flag;
			} //1.
		});
//		MyAction1 action = new MyAction1(p, this); //2.
//		btn.addActionListener(action);
//		btn.addActionListener(this); // 3.
		setLayout(new BorderLayout());
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(btn);
		add(btnPanel, BorderLayout.SOUTH);
		add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		DisplayImage di = new DisplayImage();
		di.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {  // can be used for more button actions
		p.setVisible(flag);
		repaint();
		flag = !flag;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class MyAction1 implements ActionListener {

	MyPanel panel;
	DisplayImage frame;

	MyAction1(MyPanel panel, DisplayImage frame) {
		this.panel = panel;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.p.setVisible(frame.flag);
		frame.repaint();
		frame.flag = !frame.flag;
	}

}
