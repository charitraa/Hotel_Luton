package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import GUI.Booking;
import GUI.Login;
import Middleware.BookingMiddleWare;
import Middleware.CorporateMiddleWare;
import Middleware.UserMiddleWare;
import Middleware.NonCorporateMiddleWare;

public class Jdbc {
		public boolean register(CorporateMiddleWare corporate) {

			boolean result=false;
			String sql = "INSERT INTO corporate VALUES(?,?,?,?,?,?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat=conn.prepareStatement(sql);
				pstat.setInt(1, corporate.getCoporateId());
				pstat.setString(2, corporate.getName());
				pstat.setString(3, corporate.getDate());
				pstat.setString(4, corporate.getCountry());
				pstat.setString(5, corporate.getAddress());
				pstat.setString(6, corporate.getPhonenumber());
				pstat.setString(7, corporate.getCreditCard());
				pstat.setString(8, corporate.getCvc());
				pstat.setString(9, corporate.getEmail());
				pstat.setString(10, corporate.getPassword());
				//to save 
				pstat.executeUpdate(); 
				pstat.close();
				conn.close();
				result=true;
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return result;
		}
		
		public boolean register1(NonCorporateMiddleWare Noncorporate) {

			boolean result=false;
			String sql = "INSERT INTO non_corporate VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat=conn.prepareStatement(sql);
				pstat.setInt(1, Noncorporate.getCustomerId());
				pstat.setString(2, Noncorporate.getFirstName());
				pstat.setString(3, Noncorporate.getMiddleName());
				pstat.setString(4, Noncorporate.getLastName());
				pstat.setString(5, Noncorporate.getDob());
				pstat.setString(6, Noncorporate.getCountry());
				pstat.setString(7, Noncorporate.getAddress());
				pstat.setString(8, Noncorporate.getNumber());
				pstat.setString(9, Noncorporate.getSex());
				pstat.setString(10, Noncorporate.getEmail());
				pstat.setString(11, Noncorporate.getPassword());
				//to save 
				pstat.executeUpdate(); 
				pstat.close();
				conn.close();
				result=true;
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return result;
		}
		
		public boolean logins(UserMiddleWare login ) {

			boolean result=false;
			String sql = "INSERT INTO user VALUES(?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat=conn.prepareStatement(sql);
				pstat.setInt(1, login.getUid());
				pstat.setString(2, login.getEmail());
				pstat.setString(3, login.getPassword());
				
				//to save 
				pstat.executeUpdate(); 
				pstat.close();
				conn.close();
				result=true;
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return result;
		}
		
		public UserMiddleWare login(UserMiddleWare user) {
			String sql = "SELECT * FROM user WHERE email = ? AND password =?";
			try {
				//connect
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root","");
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setString(1, user.getEmail());
				pstat.setString(2, user.getPassword());
				//run sql statement
				ResultSet rs = pstat.executeQuery();
				while(rs.next()) {
					user.setUid(rs.getInt("uid"));
				
				}
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return user;
		}
		public boolean book(BookingMiddleWare reserve) {
			boolean result=false;
			String sql = "INSERT INTO booking VALUES(?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat=conn.prepareStatement(sql);
				pstat.setInt(1, reserve.getBookingId());
				pstat.setString(2, reserve.getCheckInDate());
				pstat.setString(3, reserve.getCheckOutdate());
				pstat.setString(4, reserve.getNumberOfGuest());
				pstat.setString(5, reserve.getBookingStatus());

				
				pstat.executeUpdate(); 
				pstat.close();
				conn.close();
				result=true;
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return result;
		}
		
}
