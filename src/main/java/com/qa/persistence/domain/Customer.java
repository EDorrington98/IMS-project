package com.qa.persistence.domain;

public class Customer{

	private int id;
	private String name;
	private String role;
	
	public Customer(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public Customer(int id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
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

	public String getRole() {
		return role;
	}

	public void setSurname(String role) {
		this.role = role;
	}
	
	public String toString() {
		return "id:" + id + " name:" + name + " role:" + role;
	}

}
