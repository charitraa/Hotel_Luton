package Middleware;

public class NonCorporateMiddleWare {
	public int customerId;
	public String firstName, middleName,lastName,dob,country,address,number,sex,email,password;
	public NonCorporateMiddleWare() {
	
		this.customerId = 0;
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.dob = "";
		this.country = "";
		this.address = "";
		this.number = "";
		this.sex = "";
		this.email = "";
		this.password = "";
	}
	public NonCorporateMiddleWare(int customerId, String firstName, String middleName, String lastName, String dob,
			String country, String address, String number, String sex, String email, String password) {
		
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.country = country;
		this.address = address;
		this.number = number;
		this.sex = sex;
		this.email = email;
		this.password = password;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	@Override
	public String toString() {
		return "NonCorporateMiddleWare [customerId=" + customerId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", dob=" + dob + ", country=" + country + ", address="
				+ address + ", number=" + number + ", sex=" + sex + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
