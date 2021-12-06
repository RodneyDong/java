package com.john.danceticket;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import com.john.danceticket.MainFrame.TicketType;

/**
 * This dialog window is used to sell tickets to student. Student need to
 * provide his/her id, name, and number of tickets want to buy.
 * 
 * @author John
 *
 */
public class TicketDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final String EARLY_BIRD_PRICE = "early.bird.price";
	private static final String DOOR_PRICE = "door.price";

	private JTextField idTxt, nameTxt;
	private JSpinner quantitySpi;
	private TicketType type;
	private MainFrame parent;

	public TicketDialog(TicketType type, MainFrame parent) {
		this.type = type;
		this.parent = parent;
		setSize(300, 150);
		setResizable(false);
		this.setLocationRelativeTo(parent);
		String earlyBirdPrice = parent.getProp().getProperty(EARLY_BIRD_PRICE);
		String doorPrice = parent.getProp().getProperty(DOOR_PRICE);
		String title = "Early Bird Tickets $" + earlyBirdPrice + " each";
		if (type == TicketType.DOOR) {
			title = "Door Price Tickets $" + doorPrice + " each";
		}
		setTitle(title);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		JLabel idLbl = new JLabel("ID");
		idTxt = new JTextField(10);
		JLabel nameLbl = new JLabel("Name");
		nameTxt = new JTextField(10);
		JLabel quantityLbl = new JLabel("Quantity");
		quantitySpi = new JSpinner();
		quantitySpi.setValue(1);

		JButton buyBtn = new JButton("Buy Ticket");
		buyBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buyTickets();
			}

		});
		JButton closeBtn = new JButton("Close");
		closeBtn.addActionListener(this);
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(idLbl, gbc);
		gbc.gridx = 1;
		add(idTxt, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(nameLbl, gbc);
		gbc.gridx = 1;
		add(nameTxt, gbc);
		gbc.gridy = 2;
		gbc.gridx = 0;
		add(quantityLbl, gbc);
		gbc.gridx = 1;
		add(quantitySpi, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(buyBtn, gbc);
		gbc.gridx = 1;
		add(closeBtn, gbc);
	}

	private void buyTickets() {
		//TODO - need to check if the student already bought some tickets
		String id = idTxt.getText();
		String name = nameTxt.getText();
		int quantity = (int) quantitySpi.getValue();
		if (id != null && id.length() > 0) {
			int studentId = Integer.parseInt(id);
			Student s = new Student(studentId, name);
			if (type == TicketType.EARLY_BIRD) {
				s.setEarlyBirdTickets(quantity);
			}
			if (type == TicketType.DOOR) {
				s.setDoorTickets(quantity);
			}
			save(s);
			parent.setStatus("Dance tickets has been sold successfully.");
		}
		idTxt.setText("");
		nameTxt.setText("");
		quantitySpi.setValue(1);
	}

	private void save(Student student) {
		student.save();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "Close":
			this.dispose();
		}

	}
}
