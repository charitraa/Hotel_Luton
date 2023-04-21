package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import JDBC.Contollers;
import JDBC.Jdbc;
import Middleware.BookingMiddleWare;

public class test extends JFrame implements ActionListener {
	JLabel booking, roomtype, checkin, checkout, room, number,prize;
	JDateChooser  checkindate , checkoutdate;
	JButton book , back;
	JTextField type,prise;
	JComboBox num , rooms ;
	public test() {
		JOptionPane.showMessageDialog(null,"Your code doesn't exist");
	}
	public void actionPerformed(ActionEvent e) {
	}
		public static void main(String[]args) {
		new	test(); 
		}
	
	
}
