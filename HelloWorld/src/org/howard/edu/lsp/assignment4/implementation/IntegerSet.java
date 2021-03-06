package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * IntegerSet Class
 * @author khalil
 *
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 *  Returns the length of the set
	 * @return
	 */
	public int length() {
		return set.size();
	}; 
	
	
	/**
	 *  Returns true if the 2 sets are equal, false otherwise; Two sets are equal if they contain all of the same values in ANY order.
	 * @param b
	 * @return
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> b2 = b.getSet();
		return new HashSet<>(set).equals(new HashSet<>(b2));
	}; 
	
	 
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		if (set.contains(value)) {
			return true;
		}
		return false;
	};    
	
	 
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0 ) {
			throw new IntegerSetException("Error Message");
		}
		else {
			return Collections.max(set);
		}
	}; 

	
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0 ) {
			throw new IntegerSetException("Error Message");
		}
		else {
			return Collections.min(set);
	}
	}
	
	
	/**
	 * Adds an item to the set or does nothing it already there
	 * @param item
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}; 
	
	
	/**
	 * Removes an item from the set or does nothing if not there
	 * @param item
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(new Integer (item));
		}
	}; 
	
	/**
	 *  Set union
	 * @param intSetb
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b2 = intSetb.getSet();
		set.addAll(b2);
		};
	
	
	/**
	 * Set intersection
	 * @param intSetb
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> b2 = intSetb.getSet();
		set.retainAll(b2);
	}; 

	
	/**
	 * Set difference, i.e., s1 –s2
	 * @param intSetb
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> b2 = intSetb.getSet();
		set.removeAll(b2);
	}

	
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return
	 */
	public boolean isEmpty() {
		if (set.size() == 0) {
			return true;
		}
		return false;
	}

	
	/**
	 *Return String representation of your set 
	 */
	public String toString() {
		return (set.toString());
	};	
	
	/**
	 * get ArrayList value of IntegerSet
	 * @return
	 */
	public ArrayList<Integer> getSet() {
		return (ArrayList<Integer>) this.set;
	}
}



