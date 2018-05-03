package com.jspiders.currencyexchange;

public class Exchange {
	/*
	 * void exchangeToINR(double dollar) { double rateOfDollar = 64.91; double inr =
	 * dollar * rateOfDollar; inr = inr * 0.98; System.out.println(inr); }
	 */
	double convertUsdtoInr(double dollar) {
		double inr = dollar * 0.98 * 64.91;
		return inr;
	}

	public static void main(String[] args) {
		Exchange e1 = new Exchange();
		double inr = e1.convertUsdtoInr(10);
		System.out.println((int)inr);// to display in whole number used int
	}

}
