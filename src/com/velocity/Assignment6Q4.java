package com.velocity;

public class Assignment6Q4 {

	public static void main(String[] args) {
		Assignment6Q4 ass = new Assignment6Q4();
		int x = ass.factorial(4);

		int y = 1;
		for (int i = 1; i <= x; i++) {
			y = y * i;
		}
		System.out.println(y);

	}

	public int factorial(int no) {
		return no;
	}

}
