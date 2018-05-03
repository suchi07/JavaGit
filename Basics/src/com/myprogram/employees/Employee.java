package com.myprogram.employees;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String dept;
	String address;
	double salary;
	String empID;

	void show() {
		System.out.println(this.name + " " + this.age + " " + this.dept + " " + this.address + " " + this.salary + " "
				+ this.empID);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		e.name = s.nextLine();
		System.out.println("Enter your age ");
		e.age = s.nextInt();
		System.out.println("Enter your department");
		e.dept = s.next();
		s.nextLine();
		System.out.println("Enter your Address");
		e.address = s.nextLine();
		System.out.println("Enter your salary ");
		e.salary = s.nextDouble();
		System.out.println("Enter Emp ID ");
		e.empID = s.next();
		e.show();
	}

}
