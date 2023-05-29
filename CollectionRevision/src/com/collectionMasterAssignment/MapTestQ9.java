package com.collectionMasterAssignment;

import java.util.Iterator;
import java.util.TreeSet;

//What will be output of following program.
public class MapTestQ9 {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("Jan");
		map.add("Feb");
		map.add("Mar");
		map.add("Apr");
		map.add("May");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// OUTPUT : Apr Feb Jan Mar May 
	}
}