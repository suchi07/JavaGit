package com.jspiders.bottle;

public class TestBottle {
	public static void main(String[] args) {

		Bottle b = new Bottle();
		Water wa = new Water();
		Juice ju = new Juice();
		Oil oi = new Oil();
		b.store(wa);
		b.store(ju);
		b.store(oi);
	}
}
