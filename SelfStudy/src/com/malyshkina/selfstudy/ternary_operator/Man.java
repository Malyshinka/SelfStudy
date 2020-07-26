package com.malyshkina.selfstudy.ternary_operator;

public class Man {

	private int age;

	public Man(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Man man = new Man(89);
		String securityAnswer;
		
		if (man.getAge()<=18) {
			securityAnswer = "Вам нельзя смотреть этот фильм";
		}
		else {
			securityAnswer = "Добро пожаловать на фильмы для взрослых";
		}
		
		System.out.println(securityAnswer);
		
	}
	
	
}
