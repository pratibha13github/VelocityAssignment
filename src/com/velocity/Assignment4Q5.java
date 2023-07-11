package com.velocity;

public class Assignment4Q5 {

	public int add(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		return sum;
	}

	public float average(float m) {

		float ave = (m / 4);
		return ave;
	}

	public static void main(String[] args) {
		Assignment4Q5 a5 = new Assignment4Q5();
		int s = a5.add(2, 4, 6, 9);
		System.out.println(s);
		float z = a5.average(s);
		System.out.println(z);
	}

}
