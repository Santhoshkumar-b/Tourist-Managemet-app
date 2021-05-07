package com.santhoshkumar;

public class CalculatePrice {
	/**
	 * This method calculate the total bill with gst
	 * 
	 * @param passengers
	 * @return
	 */
	public static double calculateTotalPrice(int passengers) {
		double totalPriceWithGst = 0.0;
		if (passengers > 0 && BookingDetails.flightPrice > 0) {
			int packagePrice = BookingDetails.packagePrice * passengers;
			int flightPrice = (BookingDetails.flightPrice * passengers) * 2;
			int totalPriceWithOutGst = packagePrice + flightPrice;
			totalPriceWithGst = totalPriceWithOutGst + ((totalPriceWithOutGst * 7) / 100.0);
			System.out.println("Your total price: " + totalPriceWithGst);
		} else {
			System.out.println("Select a valid number of passengers");
		}
		return totalPriceWithGst;

	}

}
