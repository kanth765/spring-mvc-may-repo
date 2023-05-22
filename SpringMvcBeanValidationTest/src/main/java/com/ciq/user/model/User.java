package com.ciq.user.model;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class User {

	@Size(min = 2 , max = 30 , message = "size of the name must be between 2 and 30")
	private String name;
	@Email(message = "Email must follow the Formatter:****@***")
	@NotBlank(message = "email must be a value")
	private String email;
	@Min(value = 18, message = "must be greater than or equal to 18")
	@NotNull(message = "age is required field")
	private Integer age;
	@NotNull(message = "birthday is required field")
	@DateTimeFormat(pattern = "mm-DD-yyyy")
	private LocalDate birthday;
	@NotBlank(message = "Role must be have a value")
	private String role;
//    private MultipartFile profileImage;
	@Valid
	private Address address;	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, Integer age, LocalDate birthday, String role, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", age=" + age + ", birthday=" + birthday + ", role=" + role
				+ ", address=" + address + "]";
	}

}
