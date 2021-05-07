package com.santhoshkumar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookDetailsTest {
	/**
	 * This method test booking details
	 */

	@Test
	public void bookingDetailsTest1() {
		int passengers = 1;
		String countryName = "Dubai";
		String flightName = "Spicejet";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(true, bookingDetails);

	}

	@Test
	public void bookingDetailsTest2() {
		int passengers = 1;
		String countryName = "Maldives";
		String flightName = "Indigo";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(true, bookingDetails);

	}

	@Test
	public void bookingDetailsTest3() {
		int passengers = 1;
		String countryName = "";
		String flightName = "Spicejet";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(false, bookingDetails);

	}

	@Test
	public void bookingDetailsTest4() {
		int passengers = 1;
		String countryName = "Germany";
		String flightName = "";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(false, bookingDetails);

	}

	@Test
	public void bookingDetailsTest5() {
		int passengers = 1;
		String countryName = "Maldives";
		String flightName = "";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(false, bookingDetails);

	}

	@Test
	public void bookingDetailsTest6() {
		int passengers = 0;
		String countryName = "Maldives";
		String flightName = "Spicejet";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(false, bookingDetails);

	}

	@Test
	public void bookingDetailsTest7() {
		int passengers = 1;
		String countryName = "";
		String flightName = "";
		boolean bookingDetails = BookingDetails.bookPackage(countryName, flightName, passengers);
		assertEquals(false, bookingDetails);

	}

}
