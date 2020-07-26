package com.malyshkina.selfstudy.interfaces;

public abstract class Electronics implements Deliverable, Orderable  {
	
	private int quantity;
	private String model;
	private double price;
	private Size size;
	
	public Electronics(int quantity, String model, double price, Size size) {
		super();
		this.quantity = quantity;
		this.model = model;
		this.price = price;
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
	
	
	


}
