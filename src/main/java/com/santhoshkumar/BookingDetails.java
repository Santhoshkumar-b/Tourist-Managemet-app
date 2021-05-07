package com.santhoshkumar;

import java.util.Set;

public class BookingDetails {
	static int packagePrice = 0;
	static int numberOfDays = 0;
	static int flightPrice = 0;
	static String hotelNameByPackage = "";

	/**
	 * This method display the selected package and flight
	 * 
	 * @param countryName
	 * @param selectedflightName
	 * @return
	 */
	public static boolean bookPackage(String countryName, String selectedflightName, int passenger) {

		boolean isTotalPackage = false;
		boolean isHotel = false;
		boolean isFlight = false;
		if (passenger >= 1) {
			for (TourPackageDetails tourPackageList : Packages.packageList) {
				if (tourPackageList.packageName.equals(countryName)) {
					packagePrice = tourPackageList.packagePrice;
					numberOfDays = tourPackageList.numberOfDays;
					Set<String> selectedCountryName = Flights.flightsByPackages.keySet();
					for (String countryList : selectedCountryName) {
						FlightDetails flightDetails = Flights.flightsByPackages.get(countryList);
						if (flightDetails.CountryName.equals(countryName)
								&& flightDetails.flightName.equals(selectedflightName)) {
							flightPrice = flightDetails.flightPrice;
							isFlight = true;
						}

					}

				}
				for (HotelDetails hotelName : Hotels.hotelDetails) {
					if (hotelName.countryName.equals(countryName)) {
						hotelNameByPackage = hotelName.hotelName;
						isHotel = true;
					}
				}
				if (isFlight == true && isHotel == true) {

					System.out.println("Your journey country : " + tourPackageList.packageName + " \n"
							+ "Your package price : " + packagePrice + "\n" + "Number of days :" + numberOfDays);
					System.out.println("Number of passenger: " + passenger);
					System.out.println("Your Flight :" + selectedflightName + "\n" + "Flight Price :" + flightPrice);
					System.out.println("Your hotel name : " + hotelNameByPackage);
					break;
				}

			}
		}
		if (isHotel == true && isFlight == true) {
			isTotalPackage = true;
		}
		if (isHotel == false && isFlight == false || isHotel == false || isFlight == false) {
			System.out.println("Select a valid package");
		}
		return isTotalPackage;

	}

}
