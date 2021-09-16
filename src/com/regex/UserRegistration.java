package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * UserRegistration is a class to read user data and calls
 * methods to validate user data
 * user details are validated using regular expression
 */
public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		System.out.println("Enter first name");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		System.out.println("Enter last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter email id");
		String email = scanner.nextLine();
		Boolean firstNameCheck = validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");

		Boolean lastNameCheck = validateLastname(lastName);
		if (lastNameCheck) {
			System.out.println("Valid last name");
		} else
			System.out.println("Invalid last name");

		Boolean emailCheck = validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email id");
		} else
			System.out.println("Invalid email id");

	}

	/*
	 * method to validate email id entered by the user
	 * 
	 * @param email id given as input by the user
	 * 
	 * @return true if email is valid else returns false
	 */
	private static Boolean validateEmail(String email) {
		String emailMatcher = "^[a-zA-Z0-9+_.]+@[a-zA-Z]+\\.[a-z.-]+$";
		Boolean check = Pattern.matches(emailMatcher, email);
		return check;
	}

	/*
	 * method to validate last name of the user Last name starts with caps and has
	 * minimum 3 characters
	 * 
	 * @param lastName of the user
	 * 
	 * @return true if last name is valid else returns false
	 */
	private static Boolean validateLastname(String lastName) {
		String lastNameMatcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(lastNameMatcher, lastName);
		return check;
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
