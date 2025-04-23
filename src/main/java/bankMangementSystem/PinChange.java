package bankMangementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
	
	JPasswordField repinTextField,pinTextField;
	JButton change,back;
	String pinnumber;

	PinChange(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);  
		
		JLabel text = new JLabel("Change Your Pin");
		text.setBounds(250,280,500,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		
		JLabel pintext = new JLabel("New Pin");
		pintext.setBounds(165,320,180,25);
		pintext.setForeground(Color.WHITE);
		pintext.setFont(new Font("System",Font.BOLD,16));
		image.add(pintext);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(320, 320, 160, 25);
		pinTextField.setFont(new Font("Airel", Font.BOLD, 20));
		image.add(pinTextField);
		
		JLabel retext = new JLabel("Re-Enter New Pin");
		retext.setBounds(165,360,180,25);
		retext.setForeground(Color.WHITE);
		retext.setFont(new Font("System",Font.BOLD,16));
		image.add(retext);
		
		repinTextField = new JPasswordField();
		repinTextField.setBounds(320, 360, 160, 25);
		repinTextField.setFont(new Font("Airel", Font.BOLD, 20));
		image.add(repinTextField);
		
		change = new JButton("CHANGE");
		change.setBounds(375,460,120,28);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("BACK");
		back.setBounds(375,490,120,28);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==change)
		{
		try 
		{
			String npin=pinTextField.getText();
			String rpin=repinTextField.getText();
			
			if(!npin.equals(rpin))
			{
				JOptionPane.showMessageDialog(null,"Enter pin doesnt match");
				return;
			}
			
			if(npin.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Plaese enter PIN");
				return;
			}
			if(rpin.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Plaese renter PIN");
				return;
			}
			
			Conn conn = new Conn();
			String querry1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
			String querry2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
			String querry3="update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
			
			conn.s.executeUpdate(querry1);
			conn.s.executeUpdate(querry2);
			conn.s.executeUpdate(querry3);
			
			JOptionPane.showMessageDialog(null,"PIN changed successfully");
			
			setVisible(false);
			new Transactions(rpin).setVisible(true);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	  }
		else
		{
		  setVisible(false);
		  new Transactions(pinnumber).setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		new PinChange("").setVisible(true);

	}

}
