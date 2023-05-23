package com.ciq.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

public class Employee {

//	@UniqueElements
	@NumberFormat(pattern = "##########")
	private int id;
	@Size(min = 2 , max = 30, message = "please enter at least 3 characters")
	private String name;
	private double salary;
	private long mobileNumber;
//	@DateTimeFormat
	private Date dob;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, long mobileNumber, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date date) {
		this.dob = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobileNumber=" + mobileNumber
				+ ", dob=" + dob + "]";
	}

}
