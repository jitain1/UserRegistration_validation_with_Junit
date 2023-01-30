package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public boolean validateFirstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateLastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateEmail(String mail) {
		String regex = "^[a-zA-Z]+[\\w]*[- . + _]?[\\w]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateMobileNumber(String mobNo) {
		String regex = "^[+]?(91)[\\s][0-9]{10}$"; // 91 {10digit}

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobNo);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validatePassword(String password) {
		String regex = "(?=.*[A-Z])(?=.*[\\d])(?=.*[\\W])[\\d \\w \\W]{8,}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		if (matcher.matches())
			return true;
		else
			return false;
	}

}
