package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidationTest {

	public UserValidation userValidation;
	
	@Before
	public void initialize() {
		userValidation = new UserValidation();
	}
	@Test
	public void givenFirstName_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateFirstName("Jitain");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateFirstName("jitain");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateLastName("Singh");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateLastName("singh");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateEmail("singhjitainj.js@gmail.com.js");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenEmail_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateEmail("singhjitainj.@gmail.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateMobileNumber("+91 7982468895");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateMobileNumber("+917982468895");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validatePassword("AbA@cd123");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validatePassword("ab@cd123");
		Assert.assertEquals(false, result);
	}
	
	
	}