package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Edit extends JFrame implements ActionListener {
	
	JButton edit , close;
	JLabel noOfGuest,checkIndate,checkOutDate,roomType,roomNumber,prize;
	public Edit() {
		setTitle("Update Booking");
		setResizable(false);
		setSize(400,500);
		setLayout(null);
		setLocationRelativeTo(null);
		
		checkIndate = new JLabel("Check in date:");
		checkIndate.setBounds(50,50,100,50);
		add(checkIndate);
		
		
		checkOutDate = new JLabel("Check out date:");
		checkOutDate.setBounds(50,100,100,50);
		add(checkOutDate);		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args) {
		new Edit();
	}
}
