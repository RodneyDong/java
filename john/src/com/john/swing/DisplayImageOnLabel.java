package com.john.swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayImageOnLabel extends JFrame{

	public DisplayImageOnLabel() {
		initFrame();
		init();
	}
	
	private void initFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Display Image on Label");
	}


	public static void main(String[] args) {
		DisplayImageOnLabel frame = new DisplayImageOnLabel();
		frame.setVisible(true);
	}

	
	private void init() {
		JPanel panel = new JPanel(); // 1.
		ImageIcon icon = new ImageIcon("/Users/12818/workspace/Rodney/java/john/bin/com/john/swing/diamondK.gif");
		JLabel label = new JLabel(icon);
		label.setText("SUBJECT");
//		panel.add(label);
//		add(panel);
//		add(label);  // 2.
		this.getContentPane().add(label); // 3.
	}
}
