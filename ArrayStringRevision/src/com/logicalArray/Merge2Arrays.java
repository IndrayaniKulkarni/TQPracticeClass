package com.logicalArray;

import java.util.Arrays;

/*
 * 4) Merge 2 arrays
    ar1={4,5,6,7,9,1}
    ar2={10,20,30}
    o/p ={4,10,5,20,6,30,7,9,1}
 */
public class Merge2Arrays {

	static void merge(int arr1[], int arr2[]) {
		int ans[] = new int[arr1.length + arr2.length];
		int k = 0;
		int leastSize = (arr1.length < arr2.length) ? (arr1.length) : (arr2.length);
		int i, j;
		
		for (i = 0, j = 0; i < leastSize; i++, j++) {
			ans[k++] = arr1[i];
			ans[k++] = arr2[j];
		}
		
		while (i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		System.out.println("merged array =  "+Arrays.toString(ans));
	}

	public static void main(String[] args) {

		int[] arr1 = { 4, 5, 6, 7, 9, 1 };
		int[] arr2 = { 10, 20, 30 };

		merge(arr1, arr2);

	}

}
