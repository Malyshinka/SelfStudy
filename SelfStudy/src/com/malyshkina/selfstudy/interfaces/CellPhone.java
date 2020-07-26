package com.malyshkina.selfstudy.interfaces;

public class CellPhone extends Electronics implements Deliverable, Orderable  {

	public CellPhone(int quantity, String model, double price, Size size) {
		super(quantity, model, price, size);
		
	}

	@Override
	public double calDeliveryPrice() {
		return 10;
		
	}

	@Override
	public double calcOrderprice() {
		return getPrice()*getQuantity();
	}




		
	}

	
		

