package com.santhoshkumar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatePriceTest {
	/**
	 * This method test total price calculation
	 */

	@Test
	public void calculatePriceTest1() {
		int passengers = 2;
		String countryName = "Dubai";
		String flightName = "Spicejet";
		BookingDetails.bookPackage(countryName, flightName, passengers);
		double totalPrice = CalculatePrice.calculateTotalPrice(passengers);
		assertEquals(72760.0, totalPrice, 0);

	}

	@Test
	public void calculatePriceTest2() {
		int passengers = 1;
		String countryName = "Dubai";
		String flightName = "Spicejet";
		BookingDetails.bookPackage(countryName, flightName, passengers);
		double totalPrice = CalculatePrice.calculateTotalPrice(passengers);
		assertEquals(36380.0, totalPrice, 0);

	}

	@Test
	public void calculatePriceTest3() {
		int passengers = 1;
		String countryName = "Maldives";
		String flightName = "Spicejet";
		BookingDetails.bookPackage(countryName, flightName, passengers);
		double totalPrice = CalculatePrice.calculateTotalPrice(passengers);
		assertEquals(41730.0, totalPrice, 0);

	}

	@Test
	public void calculatePriceTest4() {
		int passengers = -1;
		String countryName = "Maldives";
		String flightName = "Spicejet";
		BookingDetails.bookPackage(countryName, flightName, passengers);
		double totalPrice = CalculatePrice.calculateTotalPrice(passengers);
		assertEquals(0.0, totalPrice, 0);

	}

	@Test
	public void calculatePriceTest7() {
		int passengers = -10;
		String countryName = "Maldives";
		String flightName = "Spicejet";
		BookingDetails.bookPackage(countryName, flightName, passengers);
		double totalPrice = CalculatePrice.calculateTotalPrice(passengers);
		assertEquals(0.0, totalPrice, 0);
	}

}
