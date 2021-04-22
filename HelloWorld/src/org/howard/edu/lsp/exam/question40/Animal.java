package org.howard.edu.lsp.exam.question40;

public interface Animal {
	public default String speak() {return "This Animal Speaks";};
	
	public default String move() {return "This Animal Moves";};

}
