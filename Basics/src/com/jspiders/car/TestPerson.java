package com.jspiders.car;

public class TestPerson {
	public static void main(String[] args) {
		Car c = new Car();
		Diesel di = new Diesel();
		c.fill(di);
		ElectricCharge ec = new ElectricCharge();
		c.fill(ec);
	}
}
