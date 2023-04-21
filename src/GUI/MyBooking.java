package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import Middleware.UserMiddleWare;


public class MyBooking extends JFrame implements ActionListener {
	JButton edit , cancel, back;
	JTable datas ;
	public MyBooking() {
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(null);
//		setResizable(false);
		
		
		edit = new JButton("Edit");
		edit.setBounds(80,40,150,30);
		edit.setFocusable(false);
		edit.addActionListener(this);
		add(edit);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(320,40,150,30);
		cancel.setFocusable(false);
		cancel.addActionListener(this);
		add(cancel);
		
		back = new JButton("Back");
		back.setBounds(560,40,150,30);
		back.setFocusable(false);
		back.addActionListener(this);
		add(back);
		
	
		String column[]= {"Check_in_date","check_out_date","Room_type","No_of_guest","Booking_Status","Room_No"};
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		datas = new JTable(model);
//		datas.setBounds(80,300,100,100);
		JScrollPane sp =  new JScrollPane(datas);
		sp.setBounds(80,120,635,400);
		add(sp);
		String sql1 = "SELECT uid FROM user WHERE email = ? AND password = ?";
		String sql = "SELECT booking.Check_in_date, booking.check_out_date,room.Room_Type, booking.No_of_Guest,booking.Booking_Status,room.Room_No\r\n"
				+ "FROM user\r\n"
				+ "JOIN booking\r\n"
				+ "ON booking.User_Id = user.uid\r\n"
				+ "JOIN room\r\n"
				+ "ON booking.Room_No =room.Room_No\r\n"
				+ "WHERE user.uid = ? ";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
			PreparedStatement select = conn.prepareStatement(sql1);
			PreparedStatement pstat = conn.prepareStatement(sql);
//			PreparedStatement pst = conn.prepareStatement(sql);
			select.setString(1, UserMiddleWare.getEmail());
			select.setString(2, UserMiddleWare.getPassword());
			ResultSet rss = select.executeQuery();
			while(rss.next()) {
				int id = rss.getInt("uid");
				pstat.setInt(1, id);
			}
			
			ResultSet rs = pstat.executeQuery();
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int n = rsmd.getColumnCount();
			model.setRowCount(0);
			while (rs.next()) {
				
				Vector v = new Vector();
				for(int i =1;i<=n;i++) {
					v.add(rs.getString("Check_in_date"));
					v.add(rs.getString("check_out_date"));
					v.add(rs.getString("Room_type"));
					v.add(rs.getString("No_of_guest"));
					v.add(rs.getString("Booking_Status"));
					v.add(rs.getString("Room_No"));
				}
				model.addRow(v);
			}rss.close();
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error "+ ex.getMessage());
		}
		
		setVisible(true);
		validate();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyBooking();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			this.dispose();
			Booking book = new Booking();
			
		}
		
		if(e.getSource()==cancel) {
			
		}
	}

}
