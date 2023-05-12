package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
//Collection Assignment.pdf
public class BasicAndLogical {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		System.out.println("-------------------------------------");
//		11. WAP to print all elements of arrayList using iterator
		// Iterator
//		17. Write a Java program to iterate through all elements in a
//		array list
		System.out.println("Iterator - ");
		Iterator<Integer> itr = num.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// List Iterator
		System.out.println("List Iterator (forward direction) - ");
		ListIterator<Integer> itr2 = num.listIterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		// List Iterator
		System.out.println("List Iterator (backward direction) - ");
		ListIterator<Integer> bitr = num.listIterator(num.size());
		while (bitr.hasPrevious()) {
			System.out.print(bitr.previous()+ " ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
//		12.WAP to matches two collection
		ArrayList<Integer> num2 = new ArrayList<>();
		num2.add(1);
		num2.add(20);
		num2.add(3);
		Collections.sort(num);
		Collections.sort(num2);
		System.out.println();
		System.out.println("num and num2 equal = "+num.equals(num2));
		System.out.println("-------------------------------------");
		
//		13. WAP to checks if collection is empty
		System.out.println("empty? num = "+num.isEmpty());
		System.out.println("-------------------------------------");
		
//		14. WAP to converts collection into array
		Integer[] arr = new Integer[num.size()];
		arr = num.toArray(arr);
		System.out.println("Convert collection to array = "+Arrays.toString(arr));
		System.out.println("-------------------------------------");

//		15. WAP to add 1 to 50 numbers in arrayList and print only
//		even numbers (using iterator)
		ArrayList<Integer> nums50 = new ArrayList<>();
		Iterator<Integer> itr4 = nums50.iterator();
		System.out.println("Even numbers from num50 arraylist = ");
		while(itr4.hasNext()) {
			int i = itr.next();
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		

//		18. Write a Java program to insert an element into the array
//		list at the first position
		System.out.println("Before insert = "+num);
		num.add(3, 109);
		System.out.println("After insert = "+num);
		System.out.println("-------------------------------------");
		
//		19. Write a Java program to retrieve an element (at a
//		specified index) from a given array list
		System.out.println("value at 1st index in num = "+num.get(1));
		System.out.println("-------------------------------------");
		
//		20. Write a Java program to update specific array element by
//		given element
		System.out.println("Before update = "+num);
		num.remove(2);
		num.add(2, 1000);
		System.out.println("After update = "+num);
		System.out.println("-------------------------------------");
	}

}
