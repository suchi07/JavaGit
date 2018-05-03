package com.jspiders.calculatorapp;

public class Calculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.multiplication(2, 3, 5);
		c1.subtract(7, 2);
		c1.subtract(50, 22);
		c1.division(10, 2);
		c1.add(430, 56);
		// Calculator c2 = new Calculator();
	}

	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	void division(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}

	void multiplication(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println(result);
	}

	void subtract(int num1, int num2) {
		int subtract = num1 - num2;
		System.out.println(subtract);
	}
}
