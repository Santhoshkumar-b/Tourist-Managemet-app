package com.santhoshkumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {
	/**
	 * This method test the login credentials
	 */

	@Test
	public void validateMobileNumberTestCase1() {
		boolean mobileNumberValidation = Login.validateMobileNumber(9865930407l);
		assertEquals(true, mobileNumberValidation);

	}

	@Test
	public void validateMobileNumberTestCase2() {
		boolean mobileNumberValidation = Login.validateMobileNumber(2865930407l);
		assertEquals(false, mobileNumberValidation);
	}

	@Test
	public void validatePasswordTestCase3() {
		boolean passwordValidation = Login.isValidatePassword("Santhosh");
		assertEquals(true, passwordValidation);

	}

	@Test
	public void validateMobileNumberTestCase4() {
		boolean mobileNumberValidation = Login.validateMobileNumber(1065930407l);
		assertEquals(false, mobileNumberValidation);
	}

}
