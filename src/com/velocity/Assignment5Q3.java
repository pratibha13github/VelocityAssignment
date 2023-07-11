package com.velocity;

public class Assignment5Q3 {

	public static void main(String[] args) {
		int a = -24;
		int b = -15;
		int c = -5;
		if (a > b && a > c) {

			System.out.println("a is maximum");
		} else if (b > a && b > c) {
			System.out.println("b is maximum");
		} else if (c > a && c > b) {
			System.out.println("c is maximum");
		} else {
			System.out.println(" not valid");
		}

	}

}
