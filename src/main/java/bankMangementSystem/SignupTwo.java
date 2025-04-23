package bankMangementSystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

	
	JTextField pan,aadhar;
	JComboBox religion,category,income,education,occupation;
	JButton next, reset;
	JRadioButton Scyes,Scno,Eyes,Eno;
	String formno2;

	SignupTwo(String formno) {
		this.formno2=formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FROM-PAGE 2");
		

		JLabel AdditionalDetails= new JLabel("Page 2: Additional Details");
		AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		AdditionalDetails .setBounds(290, 80, 400, 30);
		add(AdditionalDetails);

		JLabel Religion = new JLabel("Religion");
		Religion.setFont(new Font("Raleway", Font.BOLD, 20));
		Religion.setBounds(100, 130, 100, 30);
		add(Religion);
		
		String ValReligion[]= {"Select Your Cast","Hindu","Muslim","Sikh","Christian","Others"};
		religion=new JComboBox(ValReligion);
		religion.setBounds(300, 128, 350, 30);
		religion.setBackground(Color.WHITE);
		add(religion);

		JLabel Category = new JLabel("Category");
		Category.setFont(new Font("Raleway", Font.BOLD, 20));
		Category.setBounds(100, 190, 200, 30);
		add(Category);

		String ValCategory[]= {"Select Your Category","General","SC","ST","OBC","Others"};
		category=new JComboBox(ValCategory);
		category.setBounds(300, 190, 350, 30);
		category.setBackground(Color.WHITE);
		add(category);
		

		JLabel Income = new JLabel("Income");
		Income.setFont(new Font("Raleway", Font.BOLD, 20));
		Income.setBounds(100, 240, 200, 30);
		add(Income);

		String ValIncome[]= {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000",">10,00,000"};
		income=new JComboBox(ValIncome);
		income.setBounds(300, 240, 350, 30);
		income.setBackground(Color.WHITE);
		add(income);

		JLabel Educational = new JLabel("Educational");
		Educational.setFont(new Font("Raleway", Font.BOLD, 20));
		Educational.setBounds(100, 290, 200, 30);
		add(Educational);
		
		String ValEducation[]= {"Non-Graduation","Graduation","Post-Graduation","Doctrate","Others"};
		education=new JComboBox(ValEducation);
		education.setBounds(300, 300, 350, 30);
		education.setBackground(Color.WHITE);
		add(education);


		JLabel Qualification = new JLabel("Qualification");
		Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		Qualification.setBounds(100, 320, 200, 30);
		add(Qualification);

		JLabel Occupation = new JLabel("Occupation");
		Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		Occupation.setBounds(100, 370, 200, 30);
		add(Occupation);
		
		String ValOccupation[]= {"Salaried","Self-Employed","Bussiness","Student","Others"};
		occupation=new JComboBox(ValOccupation);
		occupation.setBounds(300, 370, 350, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);

		JLabel PANNumber = new JLabel("PAN Number");
		PANNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		PANNumber.setBounds(100, 440, 200, 30);
		add(PANNumber);

		pan = new JTextField();
		pan.setBounds(300, 440, 350, 30);
		pan.setFont(new Font("Airel", Font.BOLD, 20));
		add(pan);

		JLabel AadharNumber = new JLabel("Aadhar Number");
		AadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		AadharNumber.setBounds(100, 490, 200, 30);
		add(AadharNumber);

		aadhar = new JTextField();
		aadhar.setBounds(300, 490, 350, 30);
		aadhar.setFont(new Font("Airel", Font.BOLD, 20));
		add(aadhar);

		JLabel SeniorCitizen = new JLabel("Senior Citizen");
		SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		SeniorCitizen.setBounds(100, 540, 200, 30);
		add(SeniorCitizen);
		
		Scyes = new JRadioButton("Yes");
		Scyes.setFont(new Font("Raleway", Font.BOLD, 15));
		Scyes.setBackground(Color.WHITE);
		Scyes.setBounds(300, 540, 120, 30);
		add(Scyes);

		Scno = new JRadioButton("No");
		Scno.setFont(new Font("Raleway", Font.BOLD, 15));
		Scno.setBackground(Color.WHITE);
		Scno.setBounds(420, 540, 120, 30);
		add(Scno);

		ButtonGroup seniorcitizen = new ButtonGroup();
		seniorcitizen.add(Scyes);
		seniorcitizen.add(Scno);
		

		JLabel ExisitingAccount = new JLabel("Exisiting Account");
		ExisitingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
		ExisitingAccount.setBounds(100, 590, 200, 30);
		add(ExisitingAccount);
		
		Eyes = new JRadioButton("Yes");
		Eyes.setFont(new Font("Raleway", Font.BOLD, 15));
		Eyes.setBackground(Color.WHITE);
		Eyes.setBounds(300, 590, 120, 30);
		add(Eyes);

		Eno = new JRadioButton("No");
		Eno.setFont(new Font("Raleway", Font.BOLD, 15));
		Eno.setBackground(Color.WHITE);
		Eno.setBounds(420, 590, 120, 30);
		add(Eno);

		ButtonGroup existingaccount = new ButtonGroup();
		existingaccount.add(Eyes);
		existingaccount.add(Eno);


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
		String formno = formno2;
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)income.getSelectedItem();
		String seducation = (String)education.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		String span = pan.getText();
		String saadhar = aadhar.getText();
		String seniorcitizen = null;
		if (Scyes.isSelected()) {
			seniorcitizen = "Yes";

		} else if(Scno.isSelected()) {
			seniorcitizen = "No";
		} 

		String existingaccount = null;
		if (Eyes.isSelected()) {
			existingaccount = "Yes";

		} else if (Eno.isSelected()) {
			existingaccount = "No";
		}

	

		try {
	
				Conn c = new Conn();
				String querry = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
				c.s.executeUpdate(querry);
				
				
				new SignupThree(formno).setVisible(true);
				setVisible(false);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		new SignupTwo("").setVisible(true);

	}

}

