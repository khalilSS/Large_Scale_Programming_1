package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollbooth.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnit {

	@Test
	@DisplayName("Test case for Calculate Toll")
	void testCalculateToll() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000); 
		int value = booth.calculateToll(ford);
		assertEquals(145,value);
	}

	@Test
	@DisplayName("Test case for Display Data")
	void testDisplayData() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000);
		Truck nissan = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		int[] value = booth.displayData();
		if (value[0] == 2 && value[1] == 205) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	@DisplayName("Test case for Reset")
	void testReset() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000);
		Truck nissan = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		int[] value = booth.reset();
		if (value[0] == 0 && value[1] == 0) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		
	}
	}

}
