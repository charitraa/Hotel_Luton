package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import GUI.Booking;
import GUI.Login;
import Middleware.BookingMiddleWare;
import Middleware.CorporateMiddleWare;
import Middleware.UserMiddleWare;
import Middleware.NonCorporateMiddleWare;

public class Jdbc {
	public UserMiddleWare login(UserMiddleWare user) {
		
		String sql = "SELECT * FROM user WHERE email = ? AND password =?";
		try {
			//connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root","");
			
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, UserMiddleWare.getEmail());
			pstat.setString(2, UserMiddleWare.getPassword());
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
		public boolean register(CorporateMiddleWare corporate) {

			boolean result=false;
			String sql1 = "SELECT uid FROM user ";
			String sql = "INSERT INTO `corporate`(`Corporate_Id`, `Company_Name`, `Established_Date`, `Country`, `Address`, `Phone_Number`, `Credit_Card_No`, `Cvc`, `UserId`) VALUES (?,?,?,?,?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement select = conn.prepareStatement(sql1);
				ResultSet rs = select.executeQuery();
				PreparedStatement pstat=conn.prepareStatement(sql);
				while(rs.next()) {
					int id = rs.getInt("uid");
					pstat.setInt(9, id);
				}
				pstat.setInt(1, corporate.getCorporateId());
				pstat.setString(2, corporate.getName());
				pstat.setString(3, corporate.getDate());
				pstat.setString(4, corporate.getCountry());
				pstat.setString(5, corporate.getAddress());
				pstat.setString(6, corporate.getPhonenumber());
				pstat.setString(7, corporate.getCreditCard());
				pstat.setString(8, corporate.getCvc());
				
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
			String sql1 = "SELECT uid FROM user";
			String sql = "INSERT INTO `non_corporate`(`Non_Corporate_Id`, `First_Name`, `Middle_Name`, `Last_Name`, `Date_of_Birth`, `Country`, `Address`, `Phone_Number`, `Sex`, `Email`, `Password`, `UserId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement select = conn.prepareStatement(sql1);
				ResultSet rs = select.executeQuery();
				PreparedStatement pstat=conn.prepareStatement(sql);
				while(rs.next()) {
					int id = rs.getInt("uid");
					pstat.setInt(12, id);
				}
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
				pstat.setInt(1, UserMiddleWare.getUid());
				pstat.setString(2, UserMiddleWare.getEmail());
				pstat.setString(3, UserMiddleWare.getPassword());
				
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
		
		
		public boolean book(BookingMiddleWare reserve) {
			boolean result=false;
			String sql1 = "SELECT uid FROM user";
			String sql = "INSERT INTO booking (`Booking_Id`, `Check_in_date`, `check_out_date`, `Booking_Status`, `No_of_Guest`,`User_Id`,Room_No) VALUES(?,?,?,?,?,?,?)";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat=conn.prepareStatement(sql);
				PreparedStatement select = conn.prepareStatement(sql1);				
				
				ResultSet rs = select.executeQuery();
				while(rs.next()) {
					int id = rs.getInt("uid");
					pstat.setInt(6, id);	
			}
				pstat.setInt(1, reserve.getBookingId());
				pstat.setString(2, reserve.getCheckInDate());
				pstat.setString(3, reserve.getCheckOutdate());
				pstat.setString(4, reserve.getBookingStatus());
				pstat.setString(5, reserve.getNumberOfGuest());
				pstat.setString(7, reserve.getRoom());
				pstat.executeUpdate(); 
				pstat.close();
				rs.close();
				conn.close();
				result=true;
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
			return result;
		}
		public ArrayList getRoom() {
			String sql = "SELECT * FROM room WHERE Room_Type = ? AND Room_Status = ?";
			//aid, agegroup
			ArrayList room=new ArrayList();
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setString(1, "Twin");
				pstat.setString(2, "Not Book");
				ResultSet rs = pstat.executeQuery();
				
				while(rs.next()) {
					String rom = rs.getString("Room_No");
					room.add(rom);
				}
				rs.close();
				pstat.close();
				conn.close();
			}
			catch(Exception ex) {
				System.out.println("Error "+ ex.getMessage());
			}
			return room;
		}
		public ArrayList getRoom1() {
			String sql = "SELECT * FROM room WHERE Room_Type = ? AND Room_Status = ?";
			//aid, agegroup
			ArrayList room=new ArrayList();
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setString(1, "Single");
				pstat.setString(2, "Not Book");
				ResultSet rs = pstat.executeQuery();
				
				while(rs.next()) {
					String rom = rs.getString("Room_No");
					room.add(rom);
				}
				rs.close();
				pstat.close();
				conn.close();
			}
			catch(Exception ex) {
				System.out.println("Error "+ ex.getMessage());
			}
			return room;
		}
		public ArrayList getRoom2() {
			String sql = "SELECT * FROM room WHERE Room_Type = ? AND Room_Status = ?";
			//aid, agegroup
			ArrayList room=new ArrayList();
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root", "");
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setString(1, "Double");
				pstat.setString(2, "Not Book");
				ResultSet rs = pstat.executeQuery();
				
				while(rs.next()) {
					String rom = rs.getString("Room_No");
					room.add(rom);
				}
				rs.close();
				pstat.close();
				conn.close();
			}
			catch(Exception ex) {
				System.out.println("Error "+ ex.getMessage());
			}
			return room;
		}
//		public BookingMiddleWare notbook(BookingMiddleWare notbook) {
//			String sql = "UPDATE TABLE Room";
//			try {
//				//connect
//				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_luton", "root","");
//				
//				PreparedStatement pstat = conn.prepareStatement(sql);
//				pstat.setString(1, user.getEmail());
//				pstat.setString(2, user.getPassword());
//				//run sql statement
//				ResultSet rs = pstat.executeQuery();
//				while(rs.next()) {
//					user.setUid(rs.getInt("uid"));
//				
//				}
//			}
//			catch(Exception ex) {
//				System.out.println("Error : "+ex.getMessage());
//			}
//			
//			return notbook;
			
//		}
		
}
