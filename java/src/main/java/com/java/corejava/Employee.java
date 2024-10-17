package com.java.corejava;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String email;
	private String address;
	private transient float salary;
//	transient variable value it will not store permanently where ever we write
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
