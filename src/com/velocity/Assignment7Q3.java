package com.velocity;

public class Assignment7Q3 {

	public void printFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		// return num;
	}

	public static void main(String[] args) {

		Assignment7Q3 ass = new Assignment7Q3();
		ass.printFactors(6);
	}

}
