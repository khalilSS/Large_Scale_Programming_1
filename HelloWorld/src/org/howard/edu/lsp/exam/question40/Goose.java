package org.howard.edu.lsp.exam.question40;

public class Goose implements Animal,Flying{
	/**
	 * returns string for speak
	 */
	public String speak() {
		return "This Goose Speaks";
	}
	/**
	 * returns string for move
	 */
	public String move() {
		return "This Goose Moves Forward";
	}
	/**
	 * returns string for fly
	 */
	public String fly() {
		return "This Goose Flies";
	}
}
