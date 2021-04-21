package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck {
	int axels;
	int weight;

	public FordTruck(int a, int w) {
		axels = a;
		weight = w;
		
	}

	@Override
	public int getAxels() {
		return axels;
	}

	@Override
	public int getWeight() {
		return weight;
	}

}
