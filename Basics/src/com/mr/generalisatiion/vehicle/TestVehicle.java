package com.mr.generalisatiion.vehicle;

public class TestVehicle {
	public static void main(String[] args) {
		Toll t = new Toll();
		Vehicle v = t.collectMoney();
		System.out.println(v);
	}
}
