package com.sample.test.demo.pageobject;

public class PersonInfo {
	
	private String name;
	private String email;
	private String phone;
	private String pizza;
	private int quantity;
	private String payment;
	private double totalcost;

	public PersonInfo() {
		// perhaps add some defaults here
	}

	public void setName(String name) {
		this.name = name;	 
	}

	public void setEmail(String email) {
		this.email = email;	 
	}

	public void setPhone(String phone) {
		this.phone = phone;	 
	}
	
	public void setPizza(String pizza) {
		this.pizza = pizza;	 
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;	 
	}
	
	public void setPayment(String pMethod) {
		this.payment = pMethod;	 
	}
	
	public void setTotalCost(double cost) {
		this.totalcost= cost;	 
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;	 
	}

	public String getPhone() {
		return phone; 
	}
	
	public String getPizza() {
		return pizza; 
	}
	
	public int getQuantity() {
		return quantity;	 
	}
	
	public String getPayment() {
		return payment;	 
	}
	
	public double getTotalCost() {
		return totalcost; 
	}
	

}
