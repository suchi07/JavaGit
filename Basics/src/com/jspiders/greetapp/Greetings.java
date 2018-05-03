package com.jspiders.greetapp;

public class Greetings {
	void greet(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		Greetings g1 = new Greetings();
		g1.greet("suchitra");

	}
}
