package com.malyshkina.selfstudy.interfaces;

public class Fridge extends Electronics implements Deliverable, Orderable {

	public Fridge(int quantity, String model, double price, Size size) {
		super(quantity, model, price, size);
		
	}

	@Override
	public double calDeliveryPrice() {
		if (getPrice() > 500) {
			return 0;
		}
		else {
		return 20;	
		}
		
	}

	@Override
	public double calcOrderprice() {
		return getPrice()*getQuantity();
	}


	
	
	
	

	
	

}
