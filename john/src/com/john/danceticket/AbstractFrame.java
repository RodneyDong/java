package com.john.danceticket;

import javax.swing.JFrame;

/**
 * abstract frame class extends from JFrame, it include all basic setting for open a Window,
 * and leave init() method as an abstract method for subclass to override.
 * 
 * @author John
 *
 */
public abstract class AbstractFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	String title = "Dance Ticket";

	public AbstractFrame() {
		setSize(510, 570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle(title);
//		setLayout(null);
		init();
	}
	protected abstract void init(); // agreement

}
