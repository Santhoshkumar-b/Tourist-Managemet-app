package com.santhoshkumar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Flights {
	static Map<String, FlightDetails> flightsByPackages = new HashMap<String, FlightDetails>();

	static {
		FlightDetails flightDetails1 = new FlightDetails();
		flightDetails1.CountryName = "Dubai";
		flightDetails1.flightNumber = 1001;
		flightDetails1.flightName = "Spicejet";
		flightDetails1.flightPrice = 12000;
		flightDetails1.flightTime = LocalTime.of(18, 30);
		flightsByPackages.put(flightDetails1.CountryName, flightDetails1);

		FlightDetails flightDetails2 = new FlightDetails();
		flightDetails2.CountryName = "Maldives";
		flightDetails2.flightNumber = 1002;
		flightDetails2.flightName = "Indigo";
		flightDetails2.flightPrice = 13000;
		flightDetails2.flightTime = LocalTime.of(20, 30);
		flightsByPackages.put(flightDetails2.CountryName, flightDetails2);
	}

	/**
	 * This method add new flights
	 * 
	 * @param packages
	 * @return
	 */
	public static boolean addFlight(FlightDetails flights) {
		System.out.println(flightsByPackages);
		boolean isValidFlights = true;
		if (!Validation.stringValidation(flights.flightName)) {
			isValidFlights = false;
		}
		if (!Validation.timeValidation(flights.flightTime)) {
			isValidFlights = false;
		}
		if (isValidFlights) {
			flightsByPackages.put(flights.CountryName, flights);
		} else {
			System.out.println("Enter a valid flight details");
		}
		return isValidFlights;
	}

	/**
	 * This method remove flights
	 * 
	 * @param flightName
	 * @return
	 */

	public static boolean removeFlight(int flightNumber) {
		boolean isRemoved = false;
		String selectedCountry = null;
		Set<String> countryList = flightsByPackages.keySet();
		for (String countryName : countryList) {
			FlightDetails flightDetails = flightsByPackages.get(countryName);
			if (flightDetails.flightNumber == flightNumber) {
				selectedCountry = countryName;
				break;
			}
		}
		if (selectedCountry != null) {
			flightsByPackages.remove(selectedCountry);
			isRemoved = true;
		} else {

			System.out.println("Select a valid flight name to remove");
		}
		return isRemoved;
	}

	/**
	 * This method search packages by price
	 * 
	 * @param flightPrice
	 * @return
	 */

	public static boolean searchFlightByPrice(int flightPrice, String country) {
		boolean isSearched = false;
		Set<String> countryList = flightsByPackages.keySet();
		for (String countryName : countryList) {
			FlightDetails flightDetails = flightsByPackages.get(countryName);
			if (flightDetails.flightPrice == flightPrice && flightDetails.CountryName.equals(country)) {
				System.out.println(flightDetails.CountryName + " \n" + flightDetails.flightName);
				System.out.println(flightDetails.flightNumber + "\n" + flightDetails.flightPrice);
				isSearched = true;
			}
		}
		if (!isSearched) {
			System.out.println("No flights found");
		}
		return isSearched;
	}

	public static boolean displayFlightDetails() {
		boolean isValidDisplay = false;
		if (flightsByPackages.size() > 0) {

			for (Map.Entry<String, FlightDetails> map : flightsByPackages.entrySet()) {
				System.out.println(map.getKey());
				System.out.println(map.getValue());
				isValidDisplay = true;
			}
		}
		return isValidDisplay;
	}
}
