package com.santhoshkumar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchPackageByPriceTest {
	/**
	 * This method test package by name
	 */
	@Test
	public void searchPackageByPriceTest1() {
		int packagePrice = 1000;
		boolean searchPackageByPrice = Packages.searchPackageByPrice(packagePrice);
		assertEquals(false, searchPackageByPrice);
	}

	@Test
	public void searchPackageByPriceTest2() {
		int packagePrice = 15000;
		boolean searchPackageByPrice = Packages.searchPackageByPrice(packagePrice);
		assertEquals(true, searchPackageByPrice);
	}

	@Test
	public void searchPackageByPriceTest3() {
		int packagePrice = 10000;
		boolean searchPackageByPrice = Packages.searchPackageByPrice(packagePrice);
		assertEquals(true, searchPackageByPrice);
	}

}
