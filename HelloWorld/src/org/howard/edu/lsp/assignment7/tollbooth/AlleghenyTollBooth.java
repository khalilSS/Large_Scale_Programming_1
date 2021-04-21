package org.howard.edu.lsp.assignment7.tollbooth;

public class AlleghenyTollBooth implements TollBooth {
	public int totalNumTrucks;
	public int totalReceipts;
	public AlleghenyTollBooth() {
		
	}

	@Override
	public int calculateToll(Truck t) {
		int truckTotal;
		truckTotal = (t.getAxels() * 5) + ((t.getWeight()/1000) * 10);
		totalNumTrucks = totalNumTrucks +1;
		totalReceipts = totalReceipts + truckTotal;
		System.out.println(truckTotal);
		return truckTotal;
	}

	@Override
	public int[] displayData() {
		System.out.println("Trucks: "+ totalNumTrucks + " Receipts: " + totalReceipts);
		int[] intArray = new int[2];
		intArray [0] = totalNumTrucks;
		intArray [1] = totalReceipts;
		return intArray;
		
	}

	@Override
	public int[] reset() {
		this.displayData();
		totalNumTrucks = 0;
		totalReceipts = 0;
		int[] intArray = new int[2];
		intArray [0] = totalNumTrucks;
		intArray [1] = totalReceipts;
		return intArray;
	}

}
