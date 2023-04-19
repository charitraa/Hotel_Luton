package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import JDBC.Contollers;
import Middleware.*;

public class Corporate extends JFrame implements ActionListener{
	JLabel rgister, cname, doe, country ,address, creditCard, phoneNumber, email,pass,cvc ;
	JTextField companytxt, creditCardNo, cvcNo, countrytxt, phonetxt, addresstxt, emailtxt;
	JButton register, back;
	JRadioButton noCorporate , corporate;
	JDateChooser dob;
	JPasswordField password;
	ButtonGroup group;
	public Corporate() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Register Page");
		setSize(500,600);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		Cursor cus = new Cursor(Cursor.HAND_CURSOR);
		setUndecorated(true);
		
		rgister = new JLabel("REGISTER FORM");
		rgister.setBounds(120,40,300,50);
		rgister.setFont( new Font("serif", Font.BOLD,30));
		
		noCorporate = new JRadioButton("Non-Corporate");
		noCorporate.setBounds(120,120,150,30);
		noCorporate.addActionListener(this);
		noCorporate.setFocusable(false);
		noCorporate.setOpaque(false);
		noCorporate.setCursor(cus);
		
		corporate = new JRadioButton("Corporate");
		corporate.setBounds(280,120,150,30);
		corporate.setFocusable(false);
		corporate.setOpaque(false);
		corporate.setSelected(true);
		corporate.setCursor(cus);

		
		group = new ButtonGroup();
		group.add(noCorporate);
		group.add(corporate);
		
		cname = new JLabel() ;
		cname.setText("Company Name");
		cname.setBounds(70,170,100,30);
		
		companytxt = new JTextField();
		companytxt.setBounds(70,200,180,30);
		companytxt.setToolTipText("enter your company name");
		
		doe = new JLabel("Establish Date");
		doe.setBounds(70,230,150,30);
		
		dob= new JDateChooser();
		dob.setBounds(70,260,150,30);
		
		country = new JLabel("Country");
		country.setBounds(250,230,100,30);
		
		countrytxt = new JTextField();
		countrytxt.setBounds(250,260,150,30);
		
		address = new JLabel("Address");
		address.setBounds(71,290,150,30);
		
		addresstxt = new JTextField();
		addresstxt.setBounds(71,320,150,30);
		
		phoneNumber = new JLabel("Phone Number");
		phoneNumber.setBounds(250,290,150,30);
		
		phonetxt = new JTextField();
		phonetxt.setBounds(250,320,150,30);
		
		creditCard = new JLabel("Credit Card No");
		creditCard.setBounds(71,350,100,30);
		
		creditCardNo = new JTextField();
		creditCardNo.setBounds(71,380,150,30);
		
		cvc = new JLabel("CVC");
		cvc.setBounds(250,350,100,30);
		
		cvcNo = new JTextField();
		cvcNo.setBounds(250,380,150,30);

		email = new JLabel("Email");
		email.setBounds(71,410,100,30);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(71,440,150,30);
//		emailtxt.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(emailtxt.getText().isEmpty()) {
//					emailtxt.setText("Email");
//				}
//				
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(emailtxt.getText().equals("Email")) {
//					emailtxt.setText("");
//				}
//			}
//		});
		
		
		
		pass = new JLabel("Create a Password");
		pass.setBounds(250,410,150,30);
		
		password = new JPasswordField();
		password.setBounds(250,440,150,30);
//		password.setEchoChar((char) 0);
//		password.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(new String(password.getPassword()).isEmpty() ){
//					password.setText("Create a password");
//					password.setEchoChar((char)0);
//				}
//				
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(new String(password.getPassword()).equals("Create a password")) {
//					password.setText("");
//					password.setEchoChar('*');
//				}
//			}
//		});
		
		register = new  JButton("Continue");
		register.setBounds(71,490,150,30);
		register.addActionListener(this);
		register.setOpaque(false);
		register.setCursor(cus);

		
		back = new JButton("Back");
		back.setBounds(250,490, 150,30);
		back.addActionListener(this);
		back.setOpaque(false);
		back.setCursor(cus);

		add(back);
		add(register);
		add(password);
		add(pass);
		add(emailtxt);
		add(email);
		add(cvc);
		add(creditCard);
		add(phonetxt);
		add(phoneNumber);
		add(addresstxt);
		add(address);
		add(countrytxt);
		add(country);
		add(doe);
		add(corporate);
		add(rgister);
		add(companytxt);
		add(cname);
		add(creditCardNo);
		add(dob);
		add(cvcNo);
		add(noCorporate);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==noCorporate) {
			this.dispose();
			Noncorporate Noncorporate = new Noncorporate();
			
		}
		if(e.getSource()==back) {
			this.dispose();
		
		}
		if(e.getSource()==register) {
			
			if(companytxt.getText().length()==0 && ((JTextField)dob.getDateEditor().getUiComponent()).getText().isEmpty()&& 
					countrytxt.getText().length()==0 && addresstxt.getText().length()==0 && phonetxt.getText().length()==0 && 
					creditCardNo.getText().length()==0 && cvcNo.getText().length()==0 && emailtxt.getText().length()==0 && 
					password.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Pls fill the registration form proberly");
			}
			else if(companytxt.getText().length()==0 || ((JTextField)dob.getDateEditor().getUiComponent()).getText().isEmpty()|| 
					countrytxt.getText().length()==0 || addresstxt.getText().length()==0 || phonetxt.getText().length()==0 || 
					creditCardNo.getText().length()==0 || cvcNo.getText().length()==0 || emailtxt.getText().length()==0 && 
					password.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Pls fill the registration form proberly");
			}
			else if(phonetxt.getText().length() <10 && phonetxt.getText().length() !=0 ) {
		 		JOptionPane.showMessageDialog(null, "phone number should include 10 digits");
		 	}
				 
			else if (creditCardNo.getText().length()<16 && creditCardNo.getText().length() !=0) {
				JOptionPane.showMessageDialog(null, "credit card no should include 16 digits");
			}
		 
			else if(cvcNo.getText().length()<3 && cvcNo.getText().length()!=0 ) {
				JOptionPane.showMessageDialog(null, "cvc should include 3 digit");
			}
			else if(password.getText().length()<8 && password.getText().length()!=0 ) {
				JOptionPane.showMessageDialog(null, "password length should include 8 or more character");
			}
			else if(!(password.getText().contains("@")|| password.getText().contains("#")
		              || password.getText().contains("!") || password.getText().contains("~")
		              || password.getText().contains("$") || password.getText().contains("%")
		              || password.getText().contains("^") || password.getText().contains("&")
		              || password.getText().contains("*") || password.getText().contains("(")
		              || password.getText().contains(")") || password.getText().contains("-")
		              || password.getText().contains("+") || password.getText().contains("/")
		              || password.getText().contains(":") || password.getText().contains(".")
		              || password.getText().contains(",") || password.getText().contains("<")
		              || password.getText().contains(">") || password.getText().contains("?")
		              || password.getText().contains("|"))) {
				
				JOptionPane.showMessageDialog(null, "Password should contain at least one special character");
			}
			else if (password.getText().contains(" ")) {
				JOptionPane.showMessageDialog(null, "Password should not contain any space");
			}
																																																																																																																																																																																																																																																									
			else  {
			int corporateId = 0;
			String name = companytxt.getText();
			String date = ((JTextField)dob.getDateEditor().getUiComponent()).getText();
			String country = countrytxt.getText();
			String address = addresstxt.getText();
			String phone = phonetxt.getText();
			String creditNo = creditCardNo.getText();
			String cvc = cvcNo.getText();
			String email = emailtxt.getText();
			String pass = password.getText();
			CorporateMiddleWare corporate = new CorporateMiddleWare(corporateId,name,date,country,address,phone,creditNo,cvc,email,pass);
			boolean result = new Contollers().register(corporate);
			
			int uid = 0;
			String emaill = emailtxt.getText();
			String passs = password.getText();
			UserMiddleWare Login = new UserMiddleWare( uid,emaill,passs);
			boolean result1 = new Contollers().login(Login);
			
			
			
			if (result1 == true && result ==true) {

			JOptionPane.showMessageDialog(null, "Register successfully");
			Booking book = new Booking();
			companytxt.setText("");
			dob.setToolTipText("");
			countrytxt.setText("");
			addresstxt.setText("");
			phonetxt.setText("");
			creditCardNo.setText("");
			emailtxt.setText("");
			password.setText(""); 
			} else {

			JOptionPane.showMessageDialog(null, "Failed to Register");

			}

			}
		}
	}
	public static void main(String[]args) {
		new Corporate();
	}
	
}