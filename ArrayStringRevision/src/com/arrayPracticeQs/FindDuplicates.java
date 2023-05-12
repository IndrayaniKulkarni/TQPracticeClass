package com.arrayPracticeQs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://javaconceptoftheday.com/java-array-interview-programs/
 * Write a Java program to find duplicate elements in an array?
 */
public class FindDuplicates {

	static Scanner sc = new Scanner(System.in);
	static void duplicates(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		System.out.println("Duplicates = ");
		for(Map.Entry<Integer,Integer> en: map.entrySet()) {
			if(en.getValue()>1) {
				System.out.print(en.getKey()+" ");
			}
		}
	}
	static void input(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Size = ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Array = ");
		input(arr);
		
		duplicates(arr);
		sc.close();
	}

}
