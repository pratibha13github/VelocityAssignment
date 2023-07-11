package com.velocity;

public class Assignment4Q1 {

	// int a = 2;
//	int b = 5;
	// int c = a + b;
	// int d = a - b;

	public int add(int a, int b) {

		int c = a + b;
		return c;
	}

	public int sub(int d, int e) {
		int f = d - e;
		return f;
	}

	public static void main(String[] args) {
		Assignment4Q1 a4 = new Assignment4Q1();
		int sum = a4.add(2, 6);
		System.out.println(sum);
		int minus = a4.sub(6, 5);
		System.out.println(minus);

	}

}
