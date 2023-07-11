package com.Assignment8;

import java.util.Scanner;

public class EmployeeInformation {

	public void getUserInput() {
		Employee em = new Employee();
		System.out.println("take a input from user");
		Scanner sc = new Scanner(System.in);
		System.out.println("first name");
		em.firstName = sc.nextLine();
		System.out.println("last name");
		em.lastName = sc.nextLine();
		System.out.println("city");
		em.city = sc.nextLine();
		System.out.println("mobile number");
		em.mobileNumber = sc.nextLong();
		// System.out.println("city");
		// em.city = sc.nextLine();
		// String con = sc.nextLine();
		// getEmployeeInformation(String Name, String lastName,long mobileNumber , null,
		// null);

	}

	public void getEmployeeInformation(String firstName, String lastName, long mobileNumber, String city,
			String country) {
		System.out.println("first name -" + firstName);
		System.out.println("last name -" + lastName);
		System.out.println("mobile number -" + mobileNumber);
		System.out.println("city name -" + city);
		System.out.println("country name -" + country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInformation ei = new EmployeeInformation();
		ei.getUserInput();
		ei.getEmployeeInformation(null, null, 0, null, null);
	}

}
