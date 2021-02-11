package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class for the method that returns an ArrayList of combinations given certain parameters
 * @author khalil
 *
 */
public class TargetSum {
	/**
	 * Returns ArrayList of all possible combinations that add up to target in array
	 * 
	 * @param array of numbers
	 * @param target sum of combinations
	 * @return ArrayList of combinations
	 */
	public static ArrayList<String> combinations(int[] array, int target ) {
		int carry = 0;
		String temp = "";
		ArrayList<String> returnArray = new ArrayList<String>();
		//Scan through array looking for combinations
		for(int i = 0; i< array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if ((array[i] +array[j]+carry) == target && i != j && temp != "") {
					returnArray.add("[" + i +  temp +","+ j + "]");
				}
				else if (array[i]+array[j] == target && i != j) {
					returnArray.add("[" + i + ","+ j + "]");
				}
				else if (array[i] == target && (i != j || i == array.length-1)) {
					returnArray.add("[" + i + "]");
				}
				else if (array[i] + array[j] + carry < target && i != j) {
					carry = array[j] + carry;
					temp = (temp +  "," + String.valueOf(j));
				}
				else if (array[i] + array[j] + carry > target && i != j) {
					carry = 0;
					temp = "";
				}
			}
			carry = 0;
			temp = "";
		}
		return(returnArray);
	}
}
