package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//Collection Assignment.pdf
public class BasicArrayListQs {

	public static void main(String[] args) {
		ArrayList<Integer> arrls = new ArrayList<>();
		arrls.add(10);
		arrls.add(11);
		arrls.add(42);
		arrls.add(37);
		arrls.add(20);
		arrls.add(30);
//		21. Write a Java program to remove the third element from a
//		array list
		System.out.println("Before remove : arrls = " + arrls);
		arrls.remove(3);
		System.out.println("After remove : arrls = " + arrls);
		System.out.println("-----------------------------------------------");
//		22. Write a Java program to search an element in a array list
		System.out.println(" arrls.contains(42) = " + arrls.contains(42));
		System.out.println("-----------------------------------------------");
//		23. Write a Java program to sort a given array list
		System.out.println("Before sort : arrls = " + arrls);
		Collections.sort(arrls);
		System.out.println("After sort : arrls = " + arrls);
		System.out.println("-----------------------------------------------");
//		24. Write a Java program to copy one array list into another
		// 1.
		ArrayList<Integer> arrlsCopy = new ArrayList<>(arrls);
		System.out.println("Original = " + arrls);
		System.out.println("Copy using constructor = " + arrlsCopy);
		// 2.
		ArrayList<Integer> arrlsClone = (ArrayList<Integer>) arrls.clone();
		System.out.println("Original = " + arrls);
		System.out.println("Copy clone = " + arrlsClone);
		System.out.println("-----------------------------------------------");
//		25. Write a Java program to shuffle elements in a array list
		System.out.println("Before shuffling =" + arrls);
		Collections.shuffle(arrls);
		System.out.println("After shuffling =" + arrls);
		System.out.println("-----------------------------------------------");
//		26. Write a Java program to reverse elements in a array list
		System.out.println("Before reverse =" + arrls);
		Collections.reverse(arrls);
		System.out.println("After reverse =" + arrls);
		System.out.println("-----------------------------------------------");
//		27. Write a Java program to extract a portion of a array list
		System.out.println("  arrls.subList(2, 5) =" + arrls.subList(2, 5));
		System.out.println("-----------------------------------------------");
//		28. Write a Java program to compare two array lists ***
		// compare arrls and arrlsCopy
		//System.out.println("arrls.containsAll(arrlsCopy) = "+arrls.containsAll(arrlsCopy));
		Collections.sort(arrls);
		Collections.sort(arrlsCopy);
		System.out.println("arrls = "+arrls);
		System.out.println("arrlsCopy = "+arrlsCopy);
		// equals affected by order of elements - hence sort is done before this 
		System.out.println("arrls.equals(arrlsCopy) = "+arrls.equals(arrlsCopy));
		System.out.println("-----------------------------------------------");
//		29. Write a Java program of swap two elements in an arraylist
		System.out.println("Before swap = " + arrls);
		Collections.swap(arrls,2,4);
		System.out.println("After swap = " + arrls);
		System.out.println("-----------------------------------------------");
//		30. Write a Java program to join two array lists ** addAll
		System.out.println("arrls before join with arrlsCopy = "+arrls);
		arrls.addAll(arrlsCopy);
		System.out.println("arrls after join with arrlsCopy = "+arrls);
		System.out.println("-----------------------------------------------");
//		31. Write a Java program to clone an array list to another array list
		ArrayList<Integer> arrlsClone2 = (ArrayList<Integer>) arrls.clone();
		System.out.println("Original = " + arrls);
		System.out.println("Copy clone = " + arrlsClone2);
		System.out.println("-----------------------------------------------");
//		32. Write a Java program to empty an array list OR
//		33. Write a Java program to test an array list is empty or not
		System.out.println("isEmpty arrls = "+arrls.isEmpty());
//		34. Write a Java program to trim the capacity of an array list
//		the current list size
		ArrayList<Integer> arr2 = new ArrayList<>(30);
		arr2.add(10);
		arr2.add(40);
		System.out.println("Arr2 size = "+arr2.size());
		arr2.trimToSize();
		System.out.println("Arr2 trim = "+arr2.size());
		System.out.println("-----------------------------------------------");
//		35. Write a Java program to increase the size of an array list
		System.out.println("Size of arrlsCopy = "+arrlsCopy.size());
		arrlsCopy.ensureCapacity(20);
		System.out.println("-----------------------------------------------");
//		36. Write a Java program to replace the second element of a ArrayList with the specified element
		System.out.println("Before replace element - arrls = "+arrls);
		arrls.add(2,100);
		System.out.println("After replace element - arrls = "+arrls);
		System.out.println("-----------------------------------------------");
//		37. Write a Java program to print all the elements of a ArrayList using the position of the elements

		System.out.println("arrls = ");
		for(int i=0; i<arrls.size(); i++) {
			System.out.println(i+" : "+arrls.get(i));
		}
		System.out.println("-----------------------------------------------");
	
	}

}
