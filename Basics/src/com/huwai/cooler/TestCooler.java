package com.huwai.cooler;

public class TestCooler {
	public static void main(String[] args) {
		System.out.println("Cooler is Present");
		Cooler c = new Cooler();
		System.out.println("Filling the Cooler with water");
		Air a = c.cool(new ColdWater());
		System.out.println("received air");
	}
}
