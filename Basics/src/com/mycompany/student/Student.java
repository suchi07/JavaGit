package com.mycompany.student;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		// System.out.println(this.id + " " + this.name);
	}

	Student() {
		this.id = 100;
		this.name = "dummy";
		// System.out.println(this.id + " " + this.name);
	}

	void disp() {
		System.out.println(this.id + "  " + this.name);
	}

	public static void main(String[] args) {

		Student s1 = new Student(23, "Ramesh");
		s1.disp();
		Student s2 = new Student(12, "Ram");
		Student s3 = new Student();
		s3.disp();

	}
}
