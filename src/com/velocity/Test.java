package com.velocity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int five = 5;
		int two = 2;
		int total = five += (five > 6) ? ++two : --two;
		System.out.println(total);
	}

}
