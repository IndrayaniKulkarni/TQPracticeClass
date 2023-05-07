package com.logicalString;
// 11) Remove extra spaces from a string
public class RemoveExtraSpace {

	public static void main(String[] args) {
		
		String input = "Java is object  oriented  Programming     langauge.";

		String output = input.trim().replaceAll("\\s+", " ");

		System.out.println(output);
	}

}
