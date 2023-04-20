package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import com.toedter.calendar.JDateChooser;

import JDBC.Contollers;
import Middleware.UserMiddleWare;
import Middleware.NonCorporateMiddleWare;

public class Noncorporate extends JFrame implements ActionListener{
	//Declaration of Variable
	JLabel rgister, name, dobb, country ,address, gender, phoneNumber, email,pass;
	JTextField firsttxt, middletxt, lastname, countrytxt, phonetxt, addresstxt, emailtxt;
	JButton register, back;
	JRadioButton noCorporate , corporate, male , female ,other;
	JDateChooser dob;
	JPasswordField password;
	JMenu menus1;
	JMenu menus;
	JMenuBar menu;
	ButtonGroup group;
	
	public Noncorporate() {
		//make the whole Screen White
		getContentPane().setBackground(Color.WHITE);
//..................Add Frame......................
		setTitle("Register Page");
		setSize(500,600);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		
		//Add the Cursor to the Frame
		Cursor cus = new Cursor(Cursor.HAND_CURSOR);
		 
		
//...........Add Label......................
		rgister = new JLabel("REGISTER FORM");
		rgister.setBounds(120,40,300,50);
		rgister.setFont( new Font("serif", Font.BOLD,30));
		
//.............add RadioButton................................
		noCorporate = new JRadioButton("Non-Corporate");
		noCorporate.setBounds(120,120,150,30);
		noCorporate.setSelected(true);//make the button to me selected
//		noCorporate.setFocusable(false);
		noCorporate.setOpaque(false);
		noCorporate.setCursor(cus);
		
		corporate = new JRadioButton("Corporate");
		corporate.setBounds(280,120,150,30);
		corporate.setFocusable(false);
		corporate.setOpaque(false);
		corporate.addActionListener(this);
		corporate.setCursor(cus);
		
	
		name = new JLabel() ;
		name.setText("Full Name");
		name.setBounds(70,170,100,30);
		
		firsttxt = new JTextField();
		firsttxt.setBounds(70,200,100,30);
//		firsttxt.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(firsttxt.getText().isEmpty()) {
//					firsttxt.setText("First Name");
//				}
//				
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(firsttxt.getText().equals("First Name")) {
//					firsttxt.setText("");
//				}
//			}
//		});
		
		middletxt = new JTextField();
		middletxt.setBounds(185,200,100,30);
//		middletxt.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(middletxt.getText().isEmpty()) {
//					middletxt.setText("Middle Name");
//				}
//				
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(middletxt.getText().equals("")) {
//					middletxt.setText("");
//				}
//			}
//		});
		
		lastname = new JTextField();
		lastname.setBounds(300,200,100,30);
//		lastname.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(lastname.getText().isEmpty()) {
//					lastname.setText("Last Name");
//				}
//				
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(lastname.getText().equals("Last Name")) {
//					lastname.setText("");
//				}
//			}
//		});
		
		dobb = new JLabel("Date of Birth");
		dobb.setBounds(70,230,150,30);
		
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
		
		gender = new JLabel("  Sex :");
		gender.setBounds(71,358,100,30);
		
		male = new JRadioButton("Male");
		male.setBounds(130,360,100,30);
		male.setFocusable(false);
		male.setOpaque(false);
		male.setCursor(cus);
	
		female = new JRadioButton("Female");
		female.setBounds(220,360,100,30);
		female.setFocusable(false);
		female.setOpaque(false);
		female.setCursor(cus);
		
		other = new JRadioButton("Others");
		other.setBounds(320,360,100,30);
		other.setFocusable(false);
		other.setOpaque(false);
		other.setCursor(cus);
		
		group = new ButtonGroup();
		group.add(male);
		group.add(female);
		group.add(other);

		email = new JLabel("Email");
		email.setBounds(71,400,100,30);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(71,430,150,30);
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
		
		pass = new JLabel(" Create Password");
		pass.setBounds(250,400,100,30);
		
		password = new JPasswordField();
		password.setBounds(250,430,150,30);	
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
//		
		register = new  JButton("Continue");
		register.setBounds(71,490,150,30);
		register.addActionListener(this);
		register.setCursor(cus);
		register.setOpaque(false);
		
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
		add(male);
		add(female);
		add(other);
		add(gender);
		add(phonetxt);
		add(phoneNumber);
		add(addresstxt);
		add(address);
		add(countrytxt);
		add(country);
		add(dobb);
		add(corporate);
		add(rgister);
		add(firsttxt);
		add(name);
		add(lastname);
		add(dob);
		add(middletxt);
		add(noCorporate);
//		setJMenuBar(menu);
		
		setVisible(true);
	}
	
	
 public static void main (String[]args) {
	 new Noncorporate();
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==corporate) {
			this.dispose();
			Corporate cop = new Corporate();
			
		}
		if(e.getSource()==back) {
			this.dispose();
			
		}
		if(e.getSource()==register) {
			if(firsttxt.getText().length()==0 && lastname.getText().length()==0 && middletxt.getText().length()==0 &&
					((JTextField)dob.getDateEditor().getUiComponent()).getText().isEmpty()&& 
					countrytxt.getText().length()==0 && addresstxt.getText().length()==0 && phonetxt.getText().length()==0 && 
				 emailtxt.getText().length()==0 && male.getText().isEmpty() && female.getText().isEmpty() && other.getText().isEmpty() &&
					password.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Pls fill the registration form proberly");
			}
			else if(firsttxt.getText().length()==0 || lastname.getText().length()==0||
					((JTextField)dob.getDateEditor().getUiComponent()).getText().isEmpty()|| 
					countrytxt.getText().length()==0 || addresstxt.getText().length()==0 || phonetxt.getText().length()==0 || 
					 emailtxt.getText().length()==0 || male.getText().isEmpty() || female.getText().isEmpty() || other.getText().isEmpty()||
					password.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Pls fill the registration form proberly");
			}
			else {
			
			int customerId = 0;
			String firstname = firsttxt.getText();
			String secondname = middletxt.getText();
			String lastnam = lastname.getText();
			String date = ((JTextField)dob.getDateEditor().getUiComponent()).getText();
			String country = countrytxt.getText();
			String address = addresstxt.getText();
			String phone = phonetxt.getText();
			String sex = "";

			if (male.isSelected()) {

				sex = "Male";

			} else if (female.isSelected()) {

				sex = "Female";

			} else if (other.isSelected()) {

				sex = "Other";

			}
			String email = emailtxt.getText();
			String pass = password.getText();
			
			NonCorporateMiddleWare Noncorporate = new NonCorporateMiddleWare(customerId, firstname, secondname, lastnam, date, country, address, phone, sex, email,pass);
			boolean result = new Contollers().register1(Noncorporate);
			
			int uid = 0;
			String emaill = emailtxt.getText();
			String passs = password.getText();
			UserMiddleWare Login = new UserMiddleWare( uid,emaill,passs);
			boolean result1 = new Contollers().login(Login);
			if (result == true && result1 == true) {

			JOptionPane.showMessageDialog(null, "Register successfully");
			
			firsttxt.setText("");
			middletxt.setText("");
			lastname.setText("");
			dob.setToolTipText("");
			countrytxt.setText("");
			addresstxt.setText("");
			phonetxt.setText("");
			emailtxt.setText("");
			password.setText(""); 
			} else {

			JOptionPane.showMessageDialog(null, "Failed to Register");

			}

			}

			
	}
	}
	}
	

