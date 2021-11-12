package com.john.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddTextField {

	public static void main(String[] args) {
		JFrame f = new JFrame("Add a label");
		f.setSize(640, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl = new JLabel("Hello World.");
		lbl.setBounds(50, 20, 100, 30);
		f.add(lbl);
		
		JTextField txt = new JTextField();
		txt.setBounds(50, 50, 100, 30);
		f.add(txt);
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(130, 100, 100, 40);
		
		btn.addActionListener(new ActionListener() { // anonymous class one time only
			boolean flag = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					txt.setText("Hello, John.");
				}	
				else{
					txt.setText("Hello, world.");
				};
				flag = !flag;
			} 
		});

		f.add(btn);

		f.setLayout(null); // default layout is FlowLayout
		f.setVisible(true);
	}

}
