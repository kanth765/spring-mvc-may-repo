package com.ciq.user.pojo;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Size(min = 2, max = 30)
	private String name;
	@Email(message = "Email must follow the Formatter:****@***")
	@NotBlank(message = "email must be a value")
	private String email;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "birthday is required field")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate birthday;
	@Min(value = 18, message = "must be greater than or equal to 18")
	@NotNull(message = "must be applied")
	private Integer age;
	@NotBlank(message = "Role must be have a value")
	private String role;
	@Valid
	private Address address;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, LocalDate birthday, Integer age, String role, Address address) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.age = age;
		this.role = role;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", birthday=" + birthday + ", age=" + age + ", role=" + role
				+ ", address=" + address + "]";
	}
	
	

}
