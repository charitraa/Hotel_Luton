package Middleware;

public class roomMiddleWare {
	String roomtype;

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	@Override
	public String toString() {
		return "roomMiddleWare [roomtype=" + roomtype + "]";
	}
	
	
}
