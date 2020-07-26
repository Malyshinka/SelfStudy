package com.malyshkina.selfstudy.phraseOMatic;

public class BatyaSays {

	public static void main(String[] args) {

		String[] greeting = { "Holly crap!", "Howdy!", "Hey boo!", "Nice to meet you!", "Look who it is!", "Nooo way!",
				"Good to see you", "Hi there!" };
		String[] bodyMessage = { "I am", "You are" };
		String[] farewell = { "a cat", "a bat", "Antonio Banderas", "ugly", "a vegan", "fantastic" };

		int greetingLength = greeting.length;
		int bodyMessageLength = bodyMessage.length;
		int farewellLength = farewell.length;

		int rand1 = (int) (Math.random() * greetingLength);
		int rand2 = (int) (Math.random() * bodyMessageLength);
		int rand3 = (int) (Math.random() * farewellLength);

		String prediction = greeting[rand1] + " " + bodyMessage[rand2] + " " + farewell[rand3];

		System.out.println("Batya says: " + prediction);

	}

}
