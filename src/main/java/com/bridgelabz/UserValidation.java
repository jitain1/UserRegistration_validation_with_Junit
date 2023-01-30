package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidation {

	public boolean validateFirstName(String firstName) throws UserValidationException  {
		if (firstName == null)
			throw new UserValidationException(UserValidationException.ExceptionType.NULL,"Invalid First name. First name cannot be null.");

		if (firstName.isBlank())
			throw new UserValidationException(UserValidationException.ExceptionType.EMPTY, "InValid First Name. First name cannot be Empty.");

		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateLastName(String lastName) throws UserValidationException {
		if (lastName == null)
			throw new UserValidationException(UserValidationException.ExceptionType.NULL,"InValid Last Name. Last name cannot be null.");

		if (lastName.isBlank())
			throw new UserValidationException(UserValidationException.ExceptionType.EMPTY, "Invalid Last name. Last name cannot be Empty.");

		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateEmail(String mail) throws UserValidationException {
		if (mail == null)
			throw new UserValidationException(UserValidationException.ExceptionType.NULL,"InValid Email. Email cannot be null.");

		if (mail.isBlank())
			throw new UserValidationException(UserValidationException.ExceptionType.EMPTY, "Invalid Email. Email cannot be Empty.");

		String regex = "^[a-zA-Z]+[\\w]*[- . + _]?[\\w]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validateMobileNumber(String mobNo) throws UserValidationException {
		if (mobNo == null)
			throw new UserValidationException(UserValidationException.ExceptionType.NULL,"InValid Mobile Number. Mobile Number cannot be null.");

		if (mobNo.isBlank())
			throw new UserValidationException(UserValidationException.ExceptionType.EMPTY, "Invalid Mobile Number. Mobile Number cannot be Empty.");

		String regex = "^[+]?(91)[\\s][0-9]{10}$"; // 91 {10digit}

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobNo);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public boolean validatePassword(String password) throws UserValidationException {
		if (password == null)
			throw new UserValidationException(UserValidationException.ExceptionType.NULL,"InValid password. Mobile Number cannot be null.");

		if (password.isBlank())
			throw new UserValidationException(UserValidationException.ExceptionType.EMPTY, "Invalid password. Mobile Number cannot be Empty.");

		String regex = "(?=.*[A-Z])(?=.*[\\d])(?=.*[\\W])[\\d \\w \\W]{8,}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		if (matcher.matches())
			return true;
		else
			return false;
	}

}