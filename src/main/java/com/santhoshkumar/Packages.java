package com.santhoshkumar;

import java.time.LocalDate;
import java.util.ArrayList;

public class Packages {
	static ArrayList<TourPackageDetails> packageList = new ArrayList<TourPackageDetails>();

	static {
		TourPackageDetails tourPackageDetails1 = new TourPackageDetails();
		tourPackageDetails1.packageName = "Dubai";
		tourPackageDetails1.packagePrice = 10000;
		tourPackageDetails1.numberOfDays = 5;
		tourPackageDetails1.startDate = LocalDate.of(2021, 05, 13);
		tourPackageDetails1.endDate = LocalDate.of(2021, 05, 17);
		packageList.add(tourPackageDetails1);

		TourPackageDetails tourPackageDetails2 = new TourPackageDetails();
		tourPackageDetails2.packageName = "Maldives";
		tourPackageDetails2.packagePrice = 15000;
		tourPackageDetails2.numberOfDays = 5;
		tourPackageDetails2.startDate = LocalDate.of(2017, 1, 13);
		tourPackageDetails2.endDate = LocalDate.of(2021, 05, 17);
		tourPackageDetails2.endDate = LocalDate.of(2021, 05, 21);
		packageList.add(tourPackageDetails2);

	}

	/**
	 * This method adds Packages
	 * 
	 * @param packages
	 */

	public static boolean addPackage(TourPackageDetails packages) {
		boolean isValidPackage = true;
		if (!Validation.stringValidation(packages.packageName)) {
			isValidPackage = false;
		}
		if (!Validation.dateValidation(packages.startDate)) {
			isValidPackage = false;
		}
		if (!Validation.dateValidationEnd(packages.startDate, packages.endDate)) {
			isValidPackage = false;
		}
		if (packages.numberOfDays <= 0) {
			isValidPackage = false;
		}
		if (isValidPackage) {
			packageList.add(packages);
		} else {
			System.out.println("please enter all fields correctly");
		}
		return isValidPackage;
	}

	/**
	 * This method remove packages
	 * 
	 * @param countryName
	 * @return
	 */
	public static boolean removePackage(String countryName) {
		boolean isMatched = false;

		int index = 0;
		for (TourPackageDetails tourPackage : packageList) {

			if (tourPackage.packageName.equalsIgnoreCase(countryName)) {
				isMatched = true;
				break;

			}
			index++;

		}
		if (!isMatched) {
			System.out.println("Select a valid package name to remove");
		} else if (isMatched) {
			packageList.remove(index);
		}

		return isMatched;
	}

	/**
	 * This method search package using country name
	 * 
	 * @param countryName
	 * @return
	 */

	public static boolean searchPackage(String countryName) {
		boolean isFound = false;
		for (TourPackageDetails tourPackage : packageList)
			if (tourPackage.packageName.equalsIgnoreCase(countryName)) {
				System.out.println(
						tourPackage.packageName + "\n" + tourPackage.packagePrice + "\n" + tourPackage.numberOfDays);
				isFound = true;

			}
		if (!isFound) {
			System.out.println("No Packages found");
		}
		return isFound;
	}

	/**
	 * This method search package by price
	 * 
	 * @param packagePrice
	 * @return
	 */

	public static boolean searchPackageByPrice(int packagePrice) {
		boolean isFoundByPrice = false;
		for (TourPackageDetails tourPackage : packageList) {
			if (tourPackage.packagePrice == packagePrice) {
				System.out.println(
						tourPackage.packageName + "\n" + tourPackage.packagePrice + "\n" + tourPackage.numberOfDays);
				isFoundByPrice = true;
				break;
			}
		}
		if (!isFoundByPrice) {
			System.out.println("No Packages found");
		}
		return isFoundByPrice;

	}

	/**
	 * This method display all the packages
	 * 
	 * @return
	 */
	public static boolean displayPackages() {
		boolean isDisplay = false;
		if (packageList.size() > 0) {
			for (TourPackageDetails tourPackage : packageList) {
				System.out.println(tourPackage);
				isDisplay = true;
				System.out.println(" ");
			}
		}
		return isDisplay;
	}

}
