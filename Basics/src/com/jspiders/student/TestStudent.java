package com.jspiders.student;

public class TestStudent {
	public static void main(String[] args) {

		Student s = new Student();
		Juice ju = new Juice();
		Coffee co = new Coffee();
		s.drink(co);
		s.drink(ju);
	}

}
