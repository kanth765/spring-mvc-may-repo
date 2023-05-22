package com.ciq.user.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {

	@NotBlank(message = "Stree must be have a value")
	private String street;
	@Size(message = "State must be have a value with size 2")
	private String state;
	@NotNull(message = "Zip code is requried")
	private Integer zipcode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state, Integer zipcode) {
		this.street = street;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}
