package com.nescafe.cooffemchine;

public class TestCoffeeMachine {
	public static void main(String[] args) {
		System.out.println("CoffeeMachine is present");
		CoffeeMachine cm = new CoffeeMachine();
		System.out.println("Water is pouring");
		Water w = new Water();
		System.out.println("CoffeeBean is mixed");
		CoffeeBean cb = new CoffeeBean();
		System.out.println("espresso is prepared");
		Coffee espresso = cm.prepareCoffee(w, cb);
	}

}
