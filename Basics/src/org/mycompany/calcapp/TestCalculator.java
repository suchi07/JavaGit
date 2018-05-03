package org.mycompany.calcapp;

public class TestCalculator {
	public static void main(String[] args) {

		Calculator ca = new Calculator();
		int r = ca.add(4, 25);
		System.out.println(r);
		int f = ca.add(1, 2, 3);
		System.out.println(f);
		double d = ca.add(24.6, 15.4);
		System.out.println(d);
	}
}
