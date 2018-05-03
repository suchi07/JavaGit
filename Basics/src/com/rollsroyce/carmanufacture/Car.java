package com.rollsroyce.carmanufacture;

public class Car {
	String color;
	String model;
	String variant;
	String brand = "RollsRoyce";

	Car(String color) {
		this.color = color;
		this.model = "Ghost";
		this.variant = "Petrol";
		this.carDetail();
	}

	Car(String color, String model) {
		this.color = color;
		this.model = model;
		this.variant = "Diesel";
		this.carDetail();
	}

	Car(String color, String model, String variant) {
		this.color = color;
		this.model = model;
		this.variant = variant;
		this.carDetail();
	}

	void carDetail() {
		System.out.println("Color= " + this.color + "  Model= " + this.model + " variant= " + this.variant + "  Brand= "
				+ this.brand);
	}

	public static void main(String[] args) {
		Car c1 = new Car("Green");
		Car c2 = new Car("Red", "Phantom");
		Car c3 = new Car("White", "Wrath");
	}

}
