package com.collectionMasterAssignment;

import java.util.HashSet;

class Country {
	private String name;

	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class CollClient {
	public static void main(String[] str) {
		HashSet myMap = new HashSet();
		String s1 = new String("India");
		String s2 = new String("India");
		Country s3 = new Country("France");
		Country s4 = new Country("France");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);
		System.out.println(myMap);
		// OUTPUT : [France, France, India]
        // hashset consist of unique values and internally it backsup as hashmap
		// Country - custom made class hasn't its internal implementation on hashcode and equals()s
		// String has its internal implementation on hashcode and equals()s
		// hashset or hashmap find objects or elements uniqueness based on hashcode() and 
		//equals() methods
		// Hence, country doesn't have hashcode and equals methods it can't distinguish 
		// France s3, s4 as same val obj but rather different. - that's why added twice
		//Where as String is not.
	}

}
