package Middleware;

public class UserMiddleWare {
	public static String email;
	public static String password;
	public static int uid;
	public UserMiddleWare() {
		this.uid=0;
		this.email = "";
		this.password = "";
	}
	
	public UserMiddleWare(int uid,String email, String password) {
		this.uid=uid;
		this.email = email;
		this.password = password;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + ", uid=" + uid + "]";
	}
	
}