package com.santhoshkumar;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class RemoveFlightTest {
	/**
	 * This method test package removal
	 */
	@Test 
	public void removePackageTest1()
	{
		int flightNumber=1001;
		boolean remove=Flights.removeFlight(flightNumber);
		assertEquals(true,remove);
		System.out.println(Flights.flightsByPackages);
	}
	@Test 
	public void removePackageTest2()
	{
		int flightNumber=1002;
		boolean remove=Flights.removeFlight(flightNumber);
		assertEquals(true,remove);
		System.out.println(Flights.flightsByPackages);
	}



}
