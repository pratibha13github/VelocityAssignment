package com.velocity;

public class Assignment6Q2 {
	public void multiplication(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + " - " + i * num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6Q2 ass = new Assignment6Q2();
		ass.multiplication(5);
	}

}
