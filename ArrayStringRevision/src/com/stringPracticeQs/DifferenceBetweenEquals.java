package com.stringPracticeQs;

public class DifferenceBetweenEquals {

	public static void main(String[] args) {
		//demonstrate difference between == and equals
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println("s1 == s2 ->"+(s1==s2));
		System.out.println("s1.equals(s2) ->"+s1.equals(s2));
	}

}
