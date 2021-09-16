package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * UserRegistration is a class to read user data and calls
 * methods to validate user data
 * user details are validated using regular expression
 */
public class UserRegistrationMain {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		UserValidation user = new UserValidation();

		System.out.println("Enter first name");
		Scanner scanner = new Scanner(System.in);

		String firstName = scanner.nextLine();
		System.out.println("Enter last name");
		String lastName = scanner.nextLine();

		System.out.println("Enter email id");
		String email = scanner.nextLine();

		System.out.println("Enter mobile number");
		String phone = scanner.nextLine();

		System.out.println("Enter password");
		String password = scanner.nextLine();

		Boolean firstNameCheck = user.validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");

		Boolean lastNameCheck = user.validateLastname(lastName);
		if (lastNameCheck) {
			System.out.println("Valid last name");
		} else
			System.out.println("Invalid last name");

		Boolean emailCheck = user.validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email id");
		} else
			System.out.println("Invalid email id");

		Boolean phoneCheck = user.validatePhone(phone);
		if (phoneCheck) {
			System.out.println("Valid phone number");
		} else
			System.out.println("Invalid phone number");

		Boolean passwordCheck = user.validatePassword(password);
		if (passwordCheck) {
			System.out.println("Valid passowrd");
		} else
			System.out.println("Invalid password");
	}
}
