//package com.arrayPracticeQs;
//
//import java.util.Scanner;
//
///*
// * https://javaconceptoftheday.com/java-array-interview-programs/
// *  Write a Java program to find all pairs of elements in an integer array 
// *  whose sum is equal to a given number?
// */
//public class SumOfPairs {
//
//	static Scanner sc = new Scanner(System.in);
//	
//	static void makePairs(int arr[], int sum) {
//	    
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]+arr[j]==sum) {
//					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
//				}
//			}
//		}
//	}
//	static void input(int arr[]) {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//	}
//	public static void main(String[] args) {
//		
//		System.out.println("Size = ");
//		int size = sc.nextInt();
//		
//		int[] arr = new int[size];
//		System.out.println("Array = ");
//		input(arr);
//		
//		System.out.println("Sum = ");
//		int sum = sc.nextInt();
//		
//		makePairs(arr,sum);
//		
//		sc.close();
//	}
//
//}
