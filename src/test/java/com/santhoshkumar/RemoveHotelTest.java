package com.santhoshkumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveHotelTest {
	/**
	 * This method test hotel removal
	 */

	@Test
	public void removeHotelTest1() {

		HotelDetails hotels = new HotelDetails();
		hotels.countryName = "Malaysia";
		hotels.hotelName = "Berjaya Times Square Hotel";
		Hotels.addHotels(hotels);

		String hotelName = "Paradise Island Resort Maldives";
		boolean removeHotel = Hotels.removeHotels(hotelName);
		System.out.println(Hotels.hotelDetails);
		assertEquals(true, removeHotel);

	}

	@Test
	public void removeHotelTest2() {
		String hotelName = "Paradise Island Resort Maldives";
		boolean removeHotel = Hotels.removeHotels(hotelName);
		System.out.println(Hotels.hotelDetails);
		assertEquals(false, removeHotel);

	}

	@Test
	public void removeHotelTest3() {
		String hotelName = "Emirates Palace";
		boolean removeHotel = Hotels.removeHotels(hotelName);
		System.out.println(Hotels.hotelDetails);
		assertEquals(true, removeHotel);

	}

	@Test
	public void removeHotelTest4() {
		String hotelName = " ";
		boolean removeHotel = Hotels.removeHotels(hotelName);
		System.out.println(Hotels.hotelDetails);
		assertEquals(false, removeHotel);

	}

}
