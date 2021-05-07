package com.santhoshkumar;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class RemovePackageTest {
	/**
	 * This method test the package removal
	 */
	@Test
	public void removePackageTest1() {
		TourPackageDetails packages = new TourPackageDetails();
		packages.packageName = "France";
		packages.packagePrice = 20000;
		packages.numberOfDays = 5;
		packages.startDate = LocalDate.of(2021, 06, 23);
		packages.endDate = LocalDate.of(2021, 06, 27);
		Packages.addPackage(packages);

		String CountryName = "France";
		boolean removePackage = Packages.removePackage(CountryName);
		System.out.println(Packages.packageList);
		assertEquals(true, removePackage);
	}

	@Test
	public void removePackageTest2() {
		String CountryName = "Maldives";
		boolean removePackage = Packages.removePackage(CountryName);
		System.out.println(Packages.packageList);
		assertEquals(true, removePackage);
	}

	@Test
	public void removePackageTest3() {
		String CountryName = " ";
		boolean removePackage = Packages.removePackage(CountryName);
		System.out.println(Packages.packageList);
		assertEquals(false, removePackage);
	}

	@Test
	public void removePackageTest4() {
		String CountryName = "Malaysia";
		boolean removePackage = Packages.removePackage(CountryName);
		System.out.println(Packages.packageList);
		assertEquals(false, removePackage);
	}

}
