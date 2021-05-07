package com.santhoshkumar;

import java.time.LocalTime;

public class FlightDetails {
	/**
	 * This class contains flight details
	 */
	public String CountryName;
	public int flightNumber;
	public String flightName;
	public int flightPrice;
	public LocalTime flightTime;

	@Override
	public String toString() {
		return "FlightDetails [CountryName=" + CountryName + ", flightNumber=" + flightNumber + ", flightName="
				+ flightName + ", flightPrice=" + flightPrice + ", flightTime=" + flightTime + "]";
	}

}
