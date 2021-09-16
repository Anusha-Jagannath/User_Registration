package com.regex;

import java.util.regex.Pattern;

/*
 * UserValidation is a class contains methods to validate user data
 * user details are validated using regular expression
 */
public class UserValidation {

	/*
	 * method to validate last name of the user Last name starts with caps and has
	 * minimum 3 characters
	 * 
	 * @param lastName of the user
	 * 
	 * @return true if last name is valid else returns false
	 */
	public Boolean validateLastname(String lastName) {
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
	public Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}

	/*
	 * method to validate email id entered by the user
	 * 
	 * @param email id given as input by the user
	 * 
	 * @return true if email is valid else returns false
	 */
	public Boolean validateEmail(String email) {
		String emailMatcher = "^[a-zA-Z0-9+_.]+@[a-zA-Z]+\\.[a-z.-]+$";
		Boolean check = Pattern.matches(emailMatcher, email);
		return check;
	}

	/*
	 * method to validate phone number entered by the user
	 * 
	 * @param phone number given as input by the user
	 * 
	 * @return true if phone is valid else returns false
	 */
	public Boolean validatePhone(String phone) {
		String mobileNoMatcher = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
		Boolean check = Pattern.matches(mobileNoMatcher, phone);
		return check;
	}
}
