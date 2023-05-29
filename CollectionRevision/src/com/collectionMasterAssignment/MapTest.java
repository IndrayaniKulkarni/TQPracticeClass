package com.collectionMasterAssignment;

import java.util.Iterator;
import java.util.TreeSet;

//3. What will be output of following program.
public class MapTest {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("C");
		map.add("Java");
		map.add("Collection");
		map.add("AngularJs");
		map.add("JQuery");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		//OUTPUT : AngularJs C Collection JQuery Java 
	} 
	// Justify
	// Iterator gives cursor over treeset 
	// treeset internally uses treemap
	// which stores the values by comparing them in this case string comparison
	// with ascii value difference, values are stored in sorted way in treeset
	// hence we get output string list in lexographical order
}