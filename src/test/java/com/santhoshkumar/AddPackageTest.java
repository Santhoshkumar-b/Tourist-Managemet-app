package com.santhoshkumar;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class AddPackageTest {

	@Test
	public void addPackageTest() {
		TourPackageDetails packages=new TourPackageDetails();
		packages.packageName = "fran444ce";
		packages.packagePrice=15000;
		packages.numberOfDays=5;
		packages.startDate=LocalDate.of(2021, 04, 06);
		packages.endDate=LocalDate.of(2021, 05, 12);
		
		boolean isvalidPackage=Packages.addPackage(packages);
		Packages.displayPackages();
		assertEquals(false,isvalidPackage);
	}





}
