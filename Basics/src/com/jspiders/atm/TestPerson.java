package com.jspiders.atm;

public class TestPerson {
	public static void main(String[] args) {

		Atm a = new Atm();
		Card cd = new Card();
		a.withDraw(cd);

	}
}