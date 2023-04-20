package Middleware;

public class BookingMiddleWare {
	int bookingId;
	String checkInDate , checkOutdate,bookingStatus,numberOfGuest,room;
	
	public BookingMiddleWare() {
		super();
		this.bookingId = 0;
		this.numberOfGuest = "";
		this.checkInDate = "";
		this.checkOutdate = "";
		this.bookingStatus = "";
		this.room="";
	}
	public BookingMiddleWare(int bookingId, String numberOfGuest, String checkInDate, String checkOutdate,
			String bookingStatus,String room) {
		super();
		this.bookingId = bookingId;
		this.numberOfGuest = numberOfGuest;
		this.checkInDate = checkInDate;
		this.checkOutdate = checkOutdate;
		this.bookingStatus = bookingStatus;
		this.room=room;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutdate() {
		return checkOutdate;
	}
	public void setCheckOutdate(String checkOutdate) {
		this.checkOutdate = checkOutdate;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getNumberOfGuest() {
		return numberOfGuest;
	}
	public void setNumberOfGuest(String numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "BookingMiddleWare [bookingId=" + bookingId + ", checkInDate=" + checkInDate + ", checkOutdate="
				+ checkOutdate + ", bookingStatus=" + bookingStatus + ", numberOfGuest=" + numberOfGuest + ", room="
				+ room + "]";
	}
	
}