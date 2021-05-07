package com.santhoshkumar;

import java.util.ArrayList;

public class Hotels {

	static ArrayList<HotelDetails> hotelDetails = new ArrayList<HotelDetails>();

	static {
		HotelDetails hotelDetails1 = new HotelDetails();
		hotelDetails1.countryName = "Maldives";
		hotelDetails1.hotelName = "Paradise Island Resort Maldives";
		hotelDetails.add(hotelDetails1);

		HotelDetails hotelDetails2 = new HotelDetails();
		hotelDetails2.countryName = "Dubai";
		hotelDetails2.hotelName = "Emirates Palace";
		hotelDetails.add(hotelDetails2);

	}

	/**
	 * This method adds hotels
	 * 
	 * @param hotels
	 */
	public static boolean addHotels(HotelDetails hotels) {
		boolean isValidHotel = true;
		if (!Validation.stringValidation(hotels.countryName)) {
			isValidHotel = false;
		}
		if (!Validation.stringValidation(hotels.hotelName)) {
			isValidHotel = false;
		}
		if (isValidHotel) {
			hotelDetails.add(hotels);
		} else {
			System.out.println("Enter a valid hotel name");
		}
		return isValidHotel;
	}

	/**
	 * This method remove hotels
	 * 
	 * @param selectedhotelName
	 * @return
	 */

	public static boolean removeHotels(String selectedhotelName) {
		boolean isRemoved = false;

		int index = 0;
		for (HotelDetails hotelList : hotelDetails) {
			if (hotelList.hotelName.equals(selectedhotelName)) {
				index = hotelList.hotelName.indexOf(selectedhotelName);
				isRemoved = true;
				break;
			}
			index++;
		}
		if (!isRemoved) {
			System.out.println("Select a valid hotel name to remove");
		} else {
			hotelDetails.remove(index);

		}
		return isRemoved;
	}
}
