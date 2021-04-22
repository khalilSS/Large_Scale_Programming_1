package org.howard.edu.lsp.assignment7.tollbooth;

public class NissanTruck implements Truck {
	int axels;
	int weight;
	/**
	 * Constructs a NissanTruck
	 * @param a
	 * @param w
	 */
	public NissanTruck(int a, int w) {
		axels = a;
		weight = w;
		
	}
	
	/**
	 * returns number of axles
	 */
	@Override
	public int getAxels() {
		return axels;
	}
	
	/**
	 * return weight of car
	 */
	@Override
	public int getWeight() {
		return weight;
	}
	
}
