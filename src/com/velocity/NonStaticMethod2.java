package com.velocity;

public class NonStaticMethod2 {

	public void printNonStatic() {
		System.out.println("print this is a nonstatic method");
	}

	public static void main(String[] args) {
		StaticMethod1.show();

	}

}
