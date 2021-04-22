package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class Question41 {
	
	public static ArrayList<Integer> removeZeros(ArrayList <Integer> a) {
		for (int i = 0; i< a.size(); i++ ) {
			if (a.get(i) == 0) {
				a.remove(i);
				i --;
			}
		}
		return a;
	}

}
