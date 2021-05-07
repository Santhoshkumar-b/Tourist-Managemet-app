package com.santhoshkumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchFlightByPrice {
	/**
	 * This method test flight by price
	 */

	@Test
	public void searchFlightByPriceTest1() {
		int flightPrice = 12000;
		String country="Dubai";
		boolean searchFlightByPrice = Flights.searchFlightByPrice(flightPrice,country);
		assertEquals(true, searchFlightByPrice);
	}

	@Test
	public void searchFlightByPriceTest2() {
		int flightPrice = 13000;
		String country="Maldives";
		boolean searchFlightByPrice = Flights.searchFlightByPrice(flightPrice,country);
		assertEquals(true, searchFlightByPrice);
	}

	@Test
	public void searchFlightByPriceTest3() {
		int flightPrice = 10000;
		String country="dubai";
		boolean searchFlightByPrice = Flights.searchFlightByPrice(flightPrice,country);
		assertEquals(false, searchFlightByPrice);
	}

}
