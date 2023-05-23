package com.ciq.pojo;

public class Customer {

	private int cid;
	private String firstName;
	private String lastName;
	private Phone phone;
	private Country country;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, Phone phone) {
		super();
		this.cid = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public Customer(int cid, String firstName, String lastName, Phone phone, Country country) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.country = country;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", country=" + country + "]";
	}

}
