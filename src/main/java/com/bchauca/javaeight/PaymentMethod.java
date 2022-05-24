package com.bchauca.javaeight;

public abstract class PaymentMethod {
	
	private int id;
	private String name;
	
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
	
	public void callOtherService() {
		System.out.println("Call Method Cash");
	}
}
