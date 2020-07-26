package com.malyshkina.selfstudy.interfaces;

public class Interfacerunner {
	

	public static void main(String[] args) {
		
		Deliverable pizza = new Pizza(10, 1, "Neopoletana", Size.VERY_BIG);
		Deliverable cellphone = new CellPhone(1, "Motorola", 100, Size.AVERAGE);
		Deliverable fridge = new Fridge(1, "LG", 500, Size.VERY_BIG);
		
		printDeliveryPrice(pizza);
		printDeliveryPrice(cellphone);
		printDeliveryPrice(fridge);
		
		
	}

	private static void printDeliveryPrice (Deliverable del) {
		System.out.println("Delivery price is: " +del.calDeliveryPrice());
	}

	}
