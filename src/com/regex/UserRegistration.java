package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * UserRegistration is a class to validate user data
 * user details are validated using regular expression
 */
public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		System.out.println("Enter first name");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		Boolean check = validateFirstName(firstName);
		if (check) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");
	}

	/*
	 * method to validate first name of the user First name starts with caps and has
	 * minimum 3 characters
	 * 
	 * @param firstName of the user
	 * 
	 * @return true if first name is valid else returns false
	 */
	private static Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}
}
