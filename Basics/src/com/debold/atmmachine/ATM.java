package com.debold.atmmachine;

public class ATM {
	Paisa withDraw(Card c, int pin) {
		Paisa m = new Paisa();
		return m;
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		Card c = new Card();
		Paisa money = a.withDraw(c, 2311);
	}

}
