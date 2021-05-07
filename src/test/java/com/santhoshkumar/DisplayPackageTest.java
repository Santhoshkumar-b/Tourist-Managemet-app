package com.santhoshkumar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DisplayPackageTest {
	/**
	 * This method display package
	 */

	@Test
	public void displayPackageTest1() {
		int number=1001;
		boolean displayPackage = Flights.removeFlight(number);
		assertEquals(true, displayPackage);
	}

}
