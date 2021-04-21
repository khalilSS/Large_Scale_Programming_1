package org.howard.edu.lsp.assignment7.tollbooth;

public class NissanTruck implements Truck {
	int axels;
	int weight;

	public NissanTruck(int a, int w) {
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
