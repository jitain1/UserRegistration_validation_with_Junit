package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	UserValidation userValidation = new UserValidation();

/* Test cases to validate First Name*/
	@Test
	public void givenFirstName_whenValid_shouldReturnTrue() {

		boolean result;
		try {
			result = userValidation.validateFirstName("Sourav");
			Assert.assertEquals(true, result);
		} catch (Exception e) {
		}

	}

	@Test
	public void givenFirstName_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateFirstName("sourav");
			Assert.assertEquals(false, result);
		} catch (Exception e) {
		}

	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldThrowUserValidationException(){
		try {
			userValidation.validateFirstName(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.NULL,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowUserValidationException(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidation.validateFirstName("  ");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.EMPTY,e.type);
		}
		
	}

/* Test cases to validate Last Name*/
	@Test
	public void givenLastName_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateLastName("Pal");
			Assert.assertEquals(true, result);
		} catch (UserValidationException e) {
		}

	}

	@Test
	public void givenLastName_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateLastName("pal");
			Assert.assertEquals(false, result);
		} catch (UserValidationException e) {
		}

	}
	
	@Test
	public void givenLastName_WhenNull_ShouldThrowUserValidationException(){
		try {
			userValidation.validateLastName(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.NULL,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowUserValidationException(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidation.validateLastName("  ");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.EMPTY,e.type);
		}
		
	}

/* Test cases to validate Email */
	
	@Test
	public void givenEmail_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateEmail("spalworks.vj@gmail.com.vj");
			Assert.assertEquals(true, result);
		} catch (UserValidationException e) {
		}

	}

	@Test
	public void givenEmail_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateEmail("spalworks.@gmail.com");
			Assert.assertEquals(false, result);
		} catch (UserValidationException e) {
		}

	}
	
	@Test
	public void givenEmail_WhenNull_ShouldThrowUserValidationException(){
		try {
			userValidation.validateEmail(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.NULL,e.type);
		}
		
	}
	
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowUserValidationException(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidation.validateEmail("  ");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.EMPTY,e.type);
		}
		
	}

/* Test cases to validate MobileNumber */
	
	@Test
	public void givenMobileNumber_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateMobileNumber("+91 9876543210");
			Assert.assertEquals(true, result);
		} catch (UserValidationException e) {
		}

	}

	@Test
	public void givenMobileNumber_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateMobileNumber("+919876543210");
			Assert.assertEquals(false, result);
		} catch (UserValidationException e) {
		}

	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldThrowUserValidationException(){
		try {
			userValidation.validateMobileNumber(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.NULL,e.type);
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldThrowUserValidationException(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidation.validateMobileNumber("  ");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.EMPTY,e.type);
		}
		
	}

/* Test cases to validate Password */
	@Test
	public void givenPassword_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validatePassword("AbA@cd123");
			Assert.assertEquals(true, result);
		} catch (UserValidationException e) {
		}

	}

	@Test
	public void givenPassword_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validatePassword("ab@cd123");
			Assert.assertEquals(false, result);
		} catch (UserValidationException e) {
		}

	}
	
	@Test
	public void givenPassword_WhenNull_ShouldThrowUserValidationException(){
		try {
			userValidation.validatePassword(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.NULL,e.type);
		}
		
	}
	
	@Test
	public void givePasswordr_WhenEmpty_ShouldThrowUserValidationException(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidation.validatePassword("  ");
		}
		catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.EMPTY,e.type);
		}
		
	}

}