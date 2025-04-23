package bankMangementSystem;

import javax.swing.*;
import com.mysql.cj.protocol.Resultset;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	
	JButton login, signup, clear ;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login()
	{
		setTitle("AUTOMATED TRAILER MACHINE");
		
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel label=new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text=new JLabel("WELCOME TO ATM");
		add(text);
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40,450,40);
		
		JLabel cardno=new JLabel("Card No:");
		add(cardno);
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120,120,150,40);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300,125,250,30);
		cardTextField.setFont(new Font("Airel",Font.BOLD,20));
		add(cardTextField);
		
		
		JLabel pin=new JLabel("PIN:");
		add(pin);
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120,200,150,40);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300,210,250,30);
		pinTextField.setFont(new Font("Airel",Font.BOLD,25));
		add(pinTextField);
		
		login = new JButton("SIGN IN");
		login.setBounds(310,280,80,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		
		clear = new JButton("CLEAR");
		clear.setBounds(460,280,80,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		
		signup = new JButton("SIGN UP");
		signup.setBounds(300,350,250,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(800,500);
		setVisible(true);
		setLocation(350,200);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== clear)
		{
			cardTextField.setText("");
			pinTextField.setText("");
		}
		else if(ae.getSource()== login)
		{
			 Conn conn=new Conn();
			 String cardnumber = cardTextField.getText();
			 String pinnumber = pinTextField.getText();
			 String querry="select * from login where cardnumber = '"+cardnumber+"' and pin='"+pinnumber+"'";
			 try {
				ResultSet rs = conn.s.executeQuery(querry);
				if(rs.next())
				{
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
				}
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		}
		else if(ae.getSource() == signup)
		{
			setVisible(false);
			new SignupOne().setVisible(true);		
		}
	
	}

	public static void main(String[] args) {
		new Login();

	}

}
