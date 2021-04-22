package org.howard.edu.lsp.exam.question40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class Test {

	@org.junit.jupiter.api.Test
	@DisplayName("Test cases for speak")
	void testSpeak() {
		Animal gooseTest= new Goose();
		Animal tigerTest = new Tiger();
		assertEquals("This Goose Speaks",gooseTest.speak());
		assertEquals("This Tiger Speaks", tigerTest.speak());
	}

	@org.junit.jupiter.api.Test
	@DisplayName("Test cases for move")
	void testMove() {
		Animal gooseTest= new Goose();
		Animal tigerTest = new Tiger();
		assertEquals("This Goose Moves Forward",gooseTest.move());
		assertEquals("This Tiger Moves Forward", tigerTest.move());
	}
	@org.junit.jupiter.api.Test
	@DisplayName("Test cases for fly")
	void testFly() {
		Flying gooseTest = new Goose();
		Flying airplaneTest = new Airplane();
		assertEquals("This Goose Flies",gooseTest.fly());
		assertEquals("This Airplane Flies", airplaneTest.fly());
	}

}
