package Middleware;

public class CorporateMiddleWare {
	public String name,date,country,address,phonenumber,creditCard,cvc,email,password;
	public int corporateId;
	public CorporateMiddleWare() {
		this.corporateId=0;
		this.name = "";
		this.date = "";
		this.country = "";
		this.address = "";
		this.phonenumber = "";
		this.creditCard = "";
		this.cvc = "";
		this.email = "";
		this.password = "";
	}
	public CorporateMiddleWare(int corporateId, String name, String date, String country, String address, String phonenumber, String creditCard,
			String cvc, String email, String password) {
		
		this.corporateId=corporateId;
		this.name = name;
		this.date = date;
		this.country = country;
		this.address = address;
		this.phonenumber = phonenumber;
		this.creditCard = creditCard;
		this.cvc = cvc;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getCvc() {
		return cvc;
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCoporateId() {
		return corporateId;
	}
	public void setCoporateId(int corporateId) {
		this.corporateId = corporateId;
	}
	@Override
	public String toString() {
		return "Corporate [name=" + name + ", date=" + date + ", country=" + country + ", address=" + address
				+ ", phonenumber=" + phonenumber + ", creditCard=" + creditCard + ", cvc=" + cvc + ", email=" + email
				+ ", password=" + password + ", corporateId=" + corporateId + "]";
	}
	
	
}
