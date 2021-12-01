package com.john.swing;

import javax.swing.JTextField;

public class Calculator extends AbstractFrame {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setVisible(true);

	}

	@Override
	protected void init() {
		JTextField t1 = new JTextField();
		t1.setBounds(10, 10, 100, 30);
		add(t1);

		
	}

}
