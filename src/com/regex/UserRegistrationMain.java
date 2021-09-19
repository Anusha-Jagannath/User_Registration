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

		String emailId[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc..2002@gmail.com", "abc@abc@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		UserValidation user = new UserValidation();

		System.out.println("Welcome to user registration problem");

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
			System.out.println("Valid password\n");
		} else
			System.out.println("Invalid password\n");

		System.out.println("Validating all possible emails");
		for (String string : emailId) {
			Boolean emailAllCheck = user.validateEmail(string);
			if (emailAllCheck) {
				System.out.println("valid email");
			} else
				System.out.println("Invalid email");
		}
	}
}
