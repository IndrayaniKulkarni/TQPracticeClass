package com.arrayList;

import java.util.ArrayList;
//Collection Assignment.pdf
public class BasicArrayListOperations {

	public static void main(String[] args) {
	    
		ArrayList<Integer> ls = new ArrayList<>();
//		1. WAP to use add operation of ArrayList
		ls.add(10);
		ls.add(100);
		System.out.println("ls = "+ls);
		System.out.println("-------------------------------------");
//		2. Write a Java program to create a new array list, add some colors
//		(string) and print out the collection.
//		16. Write a Java program to create a new array list, add
//		some colors (string) and print out the collection
		ArrayList<String> colours = new ArrayList<>();
		colours.add("blue");
		colours.add("red");
		colours.add("mustard");
		System.out.println("colours = "+colours);
		System.out.println("-------------------------------------");
//		3. WAP to use add all elements to arrayList
		ArrayList<String> colours2 = new ArrayList<>();
		colours2.add("cyan");
		colours2.add("magenta");
		colours2.add("yellow");
		colours.addAll(colours2);
		System.out.println("colours = "+colours);
		System.out.println("-------------------------------------");
//		4. WAP to remove element from arraylist
		colours.remove(4);
		System.out.println("colours = "+colours);
		System.out.println("-------------------------------------");
//		5. WAP to remove all elements from arraylist
		System.out.println("Before remove colours2 = "+colours2);
		colours2.clear();
		System.out.println("After remove colours2 = "+colours2);
		System.out.println("-------------------------------------");
//		6. WAP to retain all elements from arraylist
		colours2.add("cyan");
		colours2.add("magenta");
		colours2.add("mustard");
		System.out.println("colours = "+colours);
		System.out.println("colours2 = "+colours);
		colours.retainAll(colours2);
		System.out.println("colours.retaineAll(colours2) = "+colours);
		System.out.println("-------------------------------------");
//		7. WAP to know how many elements in ArrayList
		System.out.println("No. of elements in colours arraylist = "+colours.size());
		System.out.println("-------------------------------------");
//		8. WAP to empty arraylist
		System.out.println("Before empty - ls = "+ls);
		ls.clear();
		System.out.println("After empty - ls = "+ls);
		System.out.println("-------------------------------------");
//		9. WAP to search an element from arrayList
		colours.add("blue");
		System.out.println("colours = "+colours);
		System.out.println("colours.contains(\"blue\") = "+colours.contains("blue"));
		System.out.println("-------------------------------------");
//		10.WAP to search the specified collection in this collection
		colours.add("magenta");
		colours2.remove(2);
		System.out.println("colours = "+colours+" \ncolours2 = "+colours2);
		System.out.println("colours.contains(colours2) = "+colours.contains(colours2));
		System.out.println("-------------------------------------");
		
	}

}
