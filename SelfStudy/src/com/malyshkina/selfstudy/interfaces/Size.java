package com.malyshkina.selfstudy.interfaces;

public enum Size {
	VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL"); 
	
	private String abbreviation;

	Size(String abbreviation) {
		this.abbreviation = abbreviation;
		
	}

	Size() {
		
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	
}
