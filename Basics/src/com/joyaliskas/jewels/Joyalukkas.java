package com.joyaliskas.jewels;

import java.util.Random;

public class Joyalukkas {
	Jewel luckDip() {
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		switch (x) {
		case 1:
			return new Ring();
		case 2:
			return new Chain();
		case 3:
			return new Bracelet();
		default:
			return null;

		}

	}

}
