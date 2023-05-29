package com.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrLs = new ArrayList<>();
		arrLs.add(2);
		arrLs.add(30);
		arrLs.add(45);
		arrLs.add(100);
		
		Integer arr[] = new Integer[arrLs.size()];
		arr = arrLs.toArray(arr);
//		arr = (Integer[]) arrLs.toArray(); // Class cast exception
		
		System.out.println(Arrays.toString(arr));
		
	}

}
