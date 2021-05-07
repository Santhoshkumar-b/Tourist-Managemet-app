package com.santhoshkumar;

import java.time.LocalDate;

public class TourPackageDetails {
	/**
	 * This class has package details
	 */
	public String packageName;
	public int packagePrice;
	public int numberOfDays;
	public LocalDate startDate;
	public LocalDate endDate;

	@Override
	public String toString() {
		return "packageName=" + packageName + " \n" + "packagePrice=" + packagePrice + "\n" + "numberOfDays="
				+ numberOfDays + "\n" + "Journey start Date=" + startDate + "\n" + "Journey end date=" + endDate;
	}

}
