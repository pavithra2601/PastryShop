package com.entity;

public class  ItemDetails {
	private int Id;
	private String Name;
	private String password;
	private String email;
	private String phno;
	private String address;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	
	
	public ItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getemail() {
		return email;
		
	}
	public void setemail(String Email) {
		email=email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "ItemDetails [Id=" + Id + ", Name=" + Name + ", password=" + password + "Email="+email+", phno=" + phno + ", address="
				+ address + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
	
	
	
	
	
	

}
