package com.malyshkina.selfstudy.interfaces;

public class Pizza implements Deliverable, Orderable {
	
	private double price;
	private int quantity;
	private String name;
	private Size size;

	public Pizza(double price, int quantity, String name, Size size) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.name = name;
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double calDeliveryPrice() {
		if (quantity > 5) {
			return 0;
		}
		else {
			return 25;
		}
		
	}

	@Override
	public double calcOrderprice() {
		return price*quantity;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
	

}
