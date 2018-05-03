package com.jspiders.minion;

public class Minion {
	String name = "Bob";
	String color = "yellow";
	byte noOfLegs = 2;
	byte noOfHands = 2;
	double height = 3;

	void speak() {
		System.out.println("speak");
	}

	void talk() {
		System.out.println("talk");

	}

	void walk() {
		System.out.println("waalk");
	}

	void sleep() {
		System.out.println("sleep");
	}

	public static void main(String[] args) {

		Minion m1 = new Minion();
		Minion m2 = new Minion();
		m2.name = "Stuart";
		m1.walk();
		m1.sleep();
		m1.talk();

		m2.height = 3.2;
		System.out.println(m2.name);//stuart
	}
}
