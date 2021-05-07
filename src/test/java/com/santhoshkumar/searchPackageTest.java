package com.santhoshkumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class searchPackageTest {
	/**
	 * This method test package by country name
	 */

	@Test
	public void searchPackageTest1() {
		String CountryName = "Dubai";
		boolean searchPackage = Packages.searchPackage(CountryName);
		assertEquals(true, searchPackage);
	}

	@Test
	public void searchPackageTest2() {
		String CountryName = "";
		boolean searchPackage = Packages.searchPackage(CountryName);
		assertEquals(false, searchPackage);
	}

	@Test
	public void searchPackageTest3() {
		String CountryName = "Maldives";
		boolean searchPackage = Packages.searchPackage(CountryName);
		assertEquals(true, searchPackage);
	}

	@Test
	public void searchPackageTest4() {
		String CountryName = "Germany";
		boolean searchPackage = Packages.searchPackage(CountryName);
		assertEquals(false, searchPackage);
	}

}
