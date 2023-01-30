package com.bridgelabz;


public class UserValidationException extends Exception{
	
	enum ExceptionType {
		NULL, EMPTY
	}

	ExceptionType type;
	String message;

	public UserValidationException(ExceptionType type, String message) {
		this.type = type;
		this.message = message;
	}
}