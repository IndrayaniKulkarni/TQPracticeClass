package com.logicalArray;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3) Half asc half desc
 */
public class HalfAscDesc {
	static Scanner sc = new Scanner(System.in);
	static void sortAsc(int arr[],int f, int l) {
		for(int i=f; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static void sortDec(int arr[],int f, int l) {
		for(int i=f; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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
		
		sortAsc(arr,0,(arr.length/2)+1);
		sortDec(arr,(arr.length/2)+1,arr.length);
		
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}
