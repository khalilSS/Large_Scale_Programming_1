package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck {
	int axels;
	int weight;
	
	/**
	 * Creates a ford truck object
	 * @param a
	 * @param w
	 */
	public FordTruck(int a, int w) {
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
	 * returns weight
	 */
	@Override
	public int getWeight() {
		return weight;
	}

}
