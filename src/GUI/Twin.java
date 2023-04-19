package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import JDBC.Contollers;
import Middleware.BookingMiddleWare;

public class Twin extends JFrame implements ActionListener {
	JLabel booking, roomtype, checkin, checkout, room, number,prize;
	JDateChooser  checkindate , checkoutdate;
	JButton book , back;
	JTextField type,prise;
	JComboBox num;
	public Twin() {
		setTitle("Twin booking page");
		setSize(500,500);
		setLayout(null);
		setUndecorated(true);
		booking = new JLabel("Booking Page");
		booking.setBounds(180,20,150,50);
		booking.setFont( new Font("serif",Font.BOLD,20));
		add(booking);
		
		roomtype = new JLabel("Room Type:");
		roomtype.setBounds(80,100,100,30);
		add(roomtype);
		
		checkin = new JLabel("Check In Date:");
		checkin.setBounds(80,150,100,30);
		add(checkin);
		
		checkout = new JLabel("Check Out Date:");
		checkout.setBounds(80,200,150,30);
		add(checkout);
		
		room = new JLabel("Room:");
		room.setBounds(80,300,150,30);
		add(room);
		
		type = new JTextField("Twin");
		type.setBounds(160,100,100,30);
		type.setEnabled(false);
		add(type);
		
		checkindate = new JDateChooser();
		checkindate.setBounds(170,150,150,30);
		add(checkindate);
		
		
		checkoutdate = new JDateChooser();
		checkoutdate.setBounds(180,200,150,30);
		add(checkoutdate);
		
		String types[] = {}; 
		JComboBox room = new JComboBox(types);
		room.setBounds(130,300,120,30);
		add(room);
		
		book = new JButton("Book");
		book.setBounds(80,350,150,30);
		add(book);
		
		back = new JButton("Back");
		back.setBounds(260,350,150,30);
		add(back);
		
		number = new JLabel("Number of Guest:");
		number.setBounds(80,250,150,30);
		add(number);
		
		String typ[] = {"1","2","3","4","5"}; 
		num = new JComboBox(typ);
		num.setBounds(190,250,120,30);
		add(num);
		
		prize = new JLabel("Prize:");
		prize.setBounds(270, 300, 100 ,30);
		add(prize);
		
		prise = new JTextField(" 6000");
		prise.setEnabled(false);
		prise.setBounds(310,300,100,30);
		add(prise);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==book) {
			int bookingId = 0;
			String number = num.getSelectedItem().toString();
			String checkin = ((JTextField)checkindate.getDateEditor().getUiComponent()).getText();
			String checkout =((JTextField)checkoutdate.getDateEditor().getUiComponent()).getText();
			String bookingstatus = "pending";
			
			BookingMiddleWare booking = new BookingMiddleWare(bookingId,number,checkin,checkout,bookingstatus);
			boolean result = new Contollers().book(booking);
			
//			int uid = 0;
//			String emaill = emailtxt.getText();
//			String passs = password.getText();
//			UserMiddleWare Login = new UserMiddleWare( uid,emaill,passs);
//			boolean result1 = new Contollers().login(Login);
			
			
			
			if (result ==true) {

			JOptionPane.showMessageDialog(null, "Booking sucessfull");
	 
			} else {

			JOptionPane.showMessageDialog(null, "Failed to Register");

			}

			}
	}
	public static void main(String[]args) {
		new Twin();
	}

}