package com.mr.generalisatiion.vehicle;

import java.util.Random;

public class Toll {
	Vehicle collectMoney() {
		
		Random r = new Random();
		int opt = r.nextInt(3) + 1;
		// int n=new Random().nextInt(3)+1;
		switch (opt) {
		case 1:
			return new Truck();

		case 2:
			return new Car();

		default:
			return new Bike();
		}
	}
	
}
