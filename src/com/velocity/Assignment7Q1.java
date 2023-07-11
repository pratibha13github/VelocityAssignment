package com.velocity;

public class Assignment7Q1 {
	public void character(char a) {
		if (a == 65 || a == 90 || a == 97 || a == 122) {
			System.out.println("char is digit");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7Q1 ass = new Assignment7Q1();
		ass.character('b');
	}

}
