package com.john.danceticket;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RefundDialog extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	private MainFrame parent;
	private JTextField idTxt;
	
	RefundDialog(MainFrame parent){
		this.parent = parent;
		setSize(380, 150);
		setResizable(false);
		this.setLocationRelativeTo(parent);
		setTitle("Student Refund");
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		this.parent.setStatus("You could use this dialog window get your tickets refund.");

		JLabel idLbl = new JLabel("Student ID: ");
		idTxt = new JTextField(10);
		JButton findBtn = new JButton("Find");
		findBtn.addActionListener(this);

		add(idLbl, gbc);
		gbc.gridx = 1;
		add(idTxt, gbc);
		gbc.gridx = 2;
		add(findBtn, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
