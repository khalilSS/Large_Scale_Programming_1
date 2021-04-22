package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Question41Test {

	@Test
	@DisplayName("Test case for removing zeros")
	void testRemoveZeros() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		test.add(0);
		test.add(7);
		test.add(2);
		test.add(0);
		test.add(0);
		test.add(4);
		test.add(0);
		answer.add(7);
		answer.add(2);
		answer.add(4);
		assertEquals(answer,Question41.removeZeros(test));
		
	}

}
