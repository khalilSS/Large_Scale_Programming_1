package org.howard.edu.lsp.exam.question40;

public interface Animal {
	/**
	 * returns default string for speak
	 * @return
	 */
	public default String speak() {return "This Animal Speaks";};
	
	/**
	 * returns default string for move
	 * @return
	 */
	public default String move() {return "This Animal Moves";};

}
