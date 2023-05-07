package com.logicalArray;

import java.util.Arrays;

/*
 * 1) Replace negative numbers in array with immediate left square
     ar1={2,3,-5,6,-7}
     o/P ={2,3,9,6,36} 
 */
public class ReplaceNegatives {

	public static void replaceNegativeNum(int arr[]) {
		if(arr[0]<0) {
			arr[0]= arr[arr.length-1]*arr[arr.length-1];
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<0) {
				arr[i] = arr[i-1]*arr[i-1];
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {2,3,-5,6,-7};
		
		replaceNegativeNum(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
