package org.howard.edu.lsp.assignment2.test;

import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.TargetSum;
/**
 * TargetSum Runner
 * @author khalil
 *
 */
public class Driver {
	public static void main(String[] args) {
		//Test Case 1
		int testArray[] = {5,5,15,10};
		int testTarget = 15;
		System.out.println("Test Case 1: "+ Arrays.toString(testArray) + " Target: " + testTarget);
		System.out.println(TargetSum.combinations(testArray,testTarget));
		//Test Case 2
		int testArray1[] = {1,2,3,4,5,6};
		int testTarget1 = 6;
		System.out.println();
		System.out.println("Test Case 2: "+ Arrays.toString(testArray1)+ " Target: " +testTarget1);
		System.out.println(TargetSum.combinations(testArray1,testTarget1));
		//Test Case 3
		int testArray2[] = {1,2};
		int testTarget2 = 3;
		System.out.println();
		System.out.println("Test Case 3: " + Arrays.toString(testArray2)+ " Target: " +testTarget2);
		System.out.println(TargetSum.combinations(testArray2,testTarget2));
		//Test Case 4
		int testArray3[] = {5,7,-7,12};
		int testTarget3 = 12;
		System.out.println();
		System.out.println("Test Case 4: " + Arrays.toString(testArray3)+ " Target: " +testTarget3);
		System.out.println(TargetSum.combinations(testArray3,testTarget3));
		//Test Case 5
		int testArray4[] = {1,2,3,4,5,6,7,8,9,10};
		int testTarget4 = 10;
		System.out.println();
		System.out.println("Test Case 5: " + Arrays.toString(testArray4)+ " Target: " +testTarget4);
		System.out.println(TargetSum.combinations(testArray4,testTarget4));
		//Test Case 6
		int testArray5[] = {1,2,3,4,5,6,7,8,9,10};
		int testTarget5 = 30;
		System.out.println();
		System.out.println("Test Case 6: " + Arrays.toString(testArray5)+ " Target: " +testTarget5);
		System.out.println(TargetSum.combinations(testArray5,testTarget5));
		//Test Case 6
		int testArray6[] = {1,2,3,4,5,6,7,8,9,10};
		int testTarget6 = 55;
		System.out.println();
		System.out.println("Test Case 7: " + Arrays.toString(testArray6)+ " Target: " +testTarget6);
		System.out.println(TargetSum.combinations(testArray6,testTarget6));
	}
}
