package com.logicalString;

/*
 * 5) sum of the digits in a string
 */
public class SumOfIntInString {

	static int sumOfDigits(String str) {
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (Character.isDigit(s)) {
				sum += (s - '0');
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		String str = "12345";

		System.out.println("sum =" + sumOfDigits(str));

	}

}
