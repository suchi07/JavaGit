package com.generaisation.roullette;

import java.util.Random;

public class Roullette {
	Money spin() {
		Random r = new Random();
		int x = r.nextInt(1201);
		if (x >= 0 && x >= 10)
			return new Money(10);
		else if (x > 10 && x <= 100) {
			return new Money(100);
		} else if (x > 100 && x <= 1000) {
			return new Money(1000);
		} else
			return null;

	}

}
