package com.mycompany.gold;

public class Gold {
	double quantity;
	double price;

	Gold(int quantity) {
		this.quantity = quantity;
		this.price = quantity * 29355.54;
		this.detail();
	}

	void detail()// instance method
	{
		System.out.println("quantity  " + this.quantity + "    price of Gold  " + this.price);
	}

	public static void main(String[] args) {
		Gold g = new Gold(15);

	}

}
