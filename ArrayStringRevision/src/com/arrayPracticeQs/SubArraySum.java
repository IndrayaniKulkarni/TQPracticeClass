package com.arrayPracticeQs;

import java.util.Scanner;

/*
 * https://javaconceptoftheday.com/java-array-interview-programs/
 * 5) Write a Java program to find continuous sub array whose sum is 
 * equal to a given number?
 * REMARK - REVISIT
 */
public class SubArraySum {
	static Scanner sc = new Scanner(System.in);

	static void input(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	static void consecutivePairs(int arr[], int target) {

		int left = 0, right = 0;
	    int sum = 0;
	    while (right < arr.length) {
	        sum += arr[right];
	        while (sum > target && left <= right) {
	            sum -= arr[left];
	            left++;
	        }
	        if (sum == target) {
	            System.out.println("Subarray found from index " + left + " to " + right);
	            return;
	        }
	        right++;
	    }
	    System.out.println("Subarray not found");
	}

	public static void main(String[] args) {

		System.out.println("Size = ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Array = ");
		input(arr);

		System.out.println("Sum = ");
		int sum = sc.nextInt();

		consecutivePairs(arr, sum);

		sc.close();
	}

}
