package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;	

/**
 * 
 * @author khalil
 *IntegerSet Runner
 */
public class Driver {
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		IntegerSet testArray = new IntegerSet();
		//Add
		System.out.print("Array Before Add: "+ testArray.toString());
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		System.out.print(" Array After Add: " + testArray.toString());
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		System.out.println(" Array After Adding Duplicates: " + testArray.toString());
		System.out.println();
		
		//Length
		System.out.println("Array Length: "+ testArray.length());
		System.out.println();
		
		//Remove
		System.out.print("Array Before Remove: " + testArray.toString());
		testArray.remove(4);
		System.out.println(" Array After Remove: " + testArray.toString());
		System.out.println();
		
		//Contains
		System.out.println("Array: " + testArray.toString() + " Contains 3: " + testArray.contains(3) + " Contains 4: " + testArray.contains(4));
		System.out.println();
		
		
		//Equals
		IntegerSet testArray2 = new IntegerSet();
		testArray2.add(1);
		testArray2.add(4);
		testArray2.add(3);
		testArray2.add(2);
		System.out.print("Array 1: " + testArray + "Array 2: " + testArray2);
		System.out.println(" is Equal: "+ testArray.equals(testArray2));
		testArray2.remove(4);
		System.out.print("Array 1: " + testArray + "Array 2: " + testArray2);
		System.out.println(" is Equal: "+ testArray.equals(testArray2));
		System.out.println();
		
		//Union
		System.out.print("Array 1: " + testArray + "Array 2: " + testArray2);
		testArray.union(testArray2);
		System.out.println("Union Array: " + testArray);
		System.out.println();
		
		//Empty
		System.out.print("Is Empty Before: " + testArray.isEmpty());
		System.out.println();
		
		//Clear
		System.out.print("Array before clear: " + testArray.toString());
		testArray.clear();
		System.out.println(" Array after clear: " + testArray.toString());
		System.out.println();
		
		//Empty
		System.out.println("Is Empty After: " + testArray.isEmpty());
		System.out.println();
		
		//Difference 
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(5);
		System.out.print("Array 1: " + testArray + "Array 2: " + testArray2);
		testArray.diff(testArray2);
		System.out.print(" Array1 After Diffeence: "+ testArray);
		System.out.println();
		
		//Intersection 
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		System.out.print("Array 1: " + testArray + "Array 2: " + testArray2);
		testArray.intersect(testArray2);
		System.out.println(" Array 1 After Intersection: " + testArray);
		System.out.println();
		
		System.out.println("Array 1: " + testArray);
		//Min
		try {
			System.out.println("Array1 Min:" + testArray.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		//Max
		try {
			System.out.println("Array1 Max:" + testArray.largest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}	
			
	}

}
