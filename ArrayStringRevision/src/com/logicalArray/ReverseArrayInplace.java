package com.logicalArray;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 2) Reverse the original array without creating temp array
 */
public class ReverseArrayInplace {

	static Scanner sc = new Scanner(System.in);
	static void reverseArr(int arr[]) {
		int temp;
		for(int i=0; i<arr.length/2-1; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] =temp;
		}
	}
	static void input(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("array =");
		input(arr);
		reverseArr(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
