package com.velocity;

//17may23
public class StaticMethod1 {

	public static void show() {
		System.out.println("print this is a static method");
	}

	public static void main(String[] args) {
		// call by class name
		StaticMethod1.show();

		// call directly
		show();

		// call by creating object
		StaticMethod1 sc = new StaticMethod1();
		sc.show();

	}

}
