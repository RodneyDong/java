package com.john.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddCheckBox implements ItemListener{
	JCheckBox cb1; // class level attribute so It can be used in other method in the class
	JCheckBox cb2;
	JFrame f; 
	public AddCheckBox(){
		f = new JFrame("Add a label");
		f.setSize(640, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl = new JLabel("Hello World.");
		lbl.setBounds(50, 20, 100, 30);
		f.add(lbl);
		
		cb1 = new JCheckBox("Java");
		cb1.setBounds(50, 50, 100, 30);
		cb1.addItemListener(this);
		f.add(cb1);
		cb2 = new JCheckBox("Python");
		cb2.setBounds(50, 80, 100, 30);
		cb2.addItemListener(this);
		
		f.add(cb2);
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(130, 100, 100, 40);
		
		btn.addActionListener(new ActionListener() { // anonymous class one time only
			boolean flag = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					lbl.setText("Hello, John.");
				}	
				else{
					lbl.setText("Hello, world.");
				};
				flag = !flag;
			} 
		});

		f.add(btn);

		f.setLayout(null); // default layout is FlowLayout
	}

	public static void main(String[] args) {
		AddCheckBox cb = new AddCheckBox();
		cb.f.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cb1) {
			if(e.getStateChange()==1) {
				System.out.println("Java is selected.");
			}else {
				System.out.println("Java is unselected.");				
			}
		}
		if(e.getSource()==cb2) {
			if(e.getStateChange()==1) {
				System.out.println("Python is selected.");
			}else {
				System.out.println("Python is unselected.");				
			}
		}
		
	}

}
