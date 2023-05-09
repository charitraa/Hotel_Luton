package JDBC;


import Middleware.UserMiddleWare;

public class Contollers {

	
private UserMiddleWare user;
	
	public Contollers() {
		this.user=new UserMiddleWare();
	}
	
	public Contollers(UserMiddleWare user) {
		this.user=user;
	}
	public UserMiddleWare getUser() {
		return user;
	}
	public void setUser(UserMiddleWare user) {
		this.user = user;
	}
	
	public void login() {
		this.user = new Jdbc().login(this.user);
	}
	public void login1() {
		this.user = new Jdbc().login1(this.user);
	}
	
}
