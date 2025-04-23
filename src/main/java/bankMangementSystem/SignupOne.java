package bankMangementSystem;

import javax.swing.*;

import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

	long random;
	JTextField nameTextField, fnameTextField, emailTextField, AddressTextField, cityTextField, stateTextField,
			PinTextField;
	JDateChooser dateChooser;
	JButton next, reset;
	JRadioButton male, female, others, unmarried, married, maothers;
	


	SignupOne() {
		setLayout(null);

		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		
		

		JLabel formno = new JLabel("APPLICATION FROM NO" + " " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 0, 600, 40);
		add(formno);

		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);

		JLabel name = new JLabel("Name");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 130, 100, 30);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setBounds(300, 128, 350, 30);
		nameTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(nameTextField);

		JLabel fname = new JLabel("Father's Name");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);

		fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 190, 350, 30);
		fnameTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(fnameTextField);

		JLabel dob = new JLabel("Date Of Birth");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);

		dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Raleway", Font.BOLD, 15));
		dateChooser.setBounds(300, 240, 350, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Raleway", Font.BOLD, 15));
		male.setBackground(Color.WHITE);
		male.setBounds(300, 290, 60, 30);
		add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Raleway", Font.BOLD, 15));
		female.setBackground(Color.WHITE);
		female.setBounds(420, 290, 80, 30);
		add(female);

		others = new JRadioButton("Others");
		others.setFont(new Font("Raleway", Font.BOLD, 15));
		others.setBackground(Color.WHITE);
		others.setBounds(560, 290, 80, 30);
		add(others);

		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(others);

		JLabel Email = new JLabel("Email Address");
		Email.setFont(new Font("Raleway", Font.BOLD, 20));
		Email.setBounds(100, 340, 200, 30);
		add(Email);

		emailTextField = new JTextField();
		emailTextField.setBounds(300, 340, 350, 30);
		emailTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(emailTextField);

		JLabel Mstatus = new JLabel("Marital Status");
		Mstatus.setFont(new Font("Raleway", Font.BOLD, 20));
		Mstatus.setBounds(100, 390, 200, 30);
		add(Mstatus);

		married = new JRadioButton("Married");
		married.setFont(new Font("Raleway", Font.BOLD, 15));
		married.setBackground(Color.WHITE);
		married.setBounds(300, 390, 120, 30);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
		unmarried.setBackground(Color.WHITE);
		unmarried.setBounds(420, 390, 120, 30);
		add(unmarried);

		maothers = new JRadioButton("Others");
		maothers.setFont(new Font("Raleway", Font.BOLD, 15));
		maothers.setBackground(Color.WHITE);
		maothers.setBounds(560, 390, 80, 30);
		add(maothers);

		ButtonGroup Mstatusgroup = new ButtonGroup();
		Mstatusgroup.add(married);
		Mstatusgroup.add(unmarried);
		Mstatusgroup.add(maothers);

		JLabel Address = new JLabel("Address");
		Address.setFont(new Font("Raleway", Font.BOLD, 20));
		Address.setBounds(100, 440, 200, 30);
		add(Address);

		AddressTextField = new JTextField();
		AddressTextField.setBounds(300, 440, 350, 30);
		AddressTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(AddressTextField);

		JLabel city = new JLabel("City");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setBounds(300, 490, 350, 30);
		cityTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(cityTextField);

		JLabel State = new JLabel("State");
		State.setFont(new Font("Raleway", Font.BOLD, 20));
		State.setBounds(100, 540, 200, 30);
		add(State);

		stateTextField = new JTextField();
		stateTextField.setBounds(300, 540, 350, 30);
		stateTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(stateTextField);

		JLabel pincode = new JLabel("Pincode");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);

		PinTextField = new JTextField();
		PinTextField.setBounds(300, 590, 350, 30);
		PinTextField.setFont(new Font("Airel", Font.BOLD, 20));
		add(PinTextField);

		reset = new JButton("Reset");
		reset.setBounds(300, 650, 90, 30);
		reset.setBackground(Color.BLACK);
		reset.setForeground(Color.WHITE);
		reset.setFont(new Font("Raleway", Font.BOLD, 15));

		add(reset);

		next = new JButton("Next");
		next.setBounds(560, 650, 90, 30);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 15));
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(Color.WHITE);

		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String formno = ""+random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";

		} else if (female.isSelected()) {
			gender = "Female";
		} else if (others.isSelected()) {
			gender = "Others";
		}

		String email = emailTextField.getText();
		String Mstatus = null;
		if (married.isSelected()) {
			Mstatus = "Married";

		} else if (unmarried.isSelected()) {
			Mstatus = "Umarried";
		} else if (maothers.isSelected()) {
			Mstatus = "Others";
		}

		String Address = AddressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = PinTextField.getText();

		try {

			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			else if(fname.equals(""))JOptionPane.showMessageDialog(null, "Father's Name is Required");
			else if(dob.equals(""))JOptionPane.showMessageDialog(null, "Date Of Birth is Required");
			else if(gender.equals(""))JOptionPane.showMessageDialog(null, "Gender is Required");
			else if(Mstatus.equals(""))JOptionPane.showMessageDialog(null, "Marital Status is Required");
			else if(Address.equals(""))JOptionPane.showMessageDialog(null, "Address is Required");
			else if(city.equals(""))JOptionPane.showMessageDialog(null, "City is Required");
			else if(state.equals(""))JOptionPane.showMessageDialog(null, "State is Required");
			else if(pin.equals(""))JOptionPane.showMessageDialog(null, "Pincode is Required");

			else {
				Conn c = new Conn();
				String querry = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+Mstatus+"','"+Address+"','"+city+"','"+state+"','"+ pin+"')";
				c.s.executeUpdate(querry);
				
				
				new SignupTwo(formno).setVisible(true);
				setVisible(false);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		new SignupOne().setVisible(true);

	}

}
