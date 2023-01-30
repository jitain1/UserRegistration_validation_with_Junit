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
		boolean result = userValidation.validateFirstName("Sourav");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateFirstName("sourav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateLastName("Pal");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateLastName("pal");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateEmail("spalworks.vj@gmail.com.vj");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenEmail_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateEmail("spalworks.@gmail.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_whenValid_shouldReturnTrue() {
		boolean result = userValidation.validateMobileNumber("+91 9876543210");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_whenInvalid_shouldReturnFalse() {
		boolean result = userValidation.validateMobileNumber("+919876543210");
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
