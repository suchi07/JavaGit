package com.mycompany.car;

public class Car {
	String color;
	String brand = "Honda";
	int price;
	int gear = 0;

	void moveForward() {
		System.out.println("move forwaard");
	}

	void disp() {
		System.out.println(this.color + " " + this.brand + " " + this.price);
	}

	void shiftGearUp() {
		if (this.gear < 5) {
			this.gear += 1;
		}
		System.out.println("car is running on Gear " + this.gear);
	}

	void shiftGeardown() {
		if (this.gear > 0) {
			this.gear -= 1;
		}
		System.out.println("car is running on Gear " + this.gear);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.disp();// null Honda 0
		c1.color = "Red";
		c1.price = 1500000;
		c1.disp();// Red Honda 1500000
		c1.moveForward();// move forward

		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGeardown();
		c1.shiftGeardown();
		c1.shiftGeardown();

		Car c2 = new Car();
		c2.disp();// null Honda 0
	}

}
