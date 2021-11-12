package com.john.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddButton {

	public static void main(String[] args) {
		MyAction a = new MyAction();
		a.actionPerformed(null);
		JFrame f = new JFrame("Add a button");
		f.setSize(640, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Click Me");
		btn.setBounds(130, 100, 100, 40);
		
//		MyAction action = new MyAction();// named object
//		btn.addActionListener(action); 
		btn.addActionListener(new ActionListener() { // anonymous class one time only
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("the button clicked...");
			} 
		});

		f.add(btn);
		f.setLayout(null); // default layout is FlowLayout
		f.setVisible(true);
	}

}

class MyAction implements ActionListener{ // named class which implements ActionListener

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("the button clicked...");
		
	}
	
}
