package com.oopsTest;

public class StringSwap {

	public static void main(String[] args) {
		//Swap 2 string var without using third var. 

		String str1 = "Java";
		String str2 = "Python";
		
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		str1 = str1.concat(str2);
		
		//System.out.println(str1+" "+str2);
		
		str2 = str1.substring(0,4);
		str1 = str1.substring(4,str1.length());
		
		System.out.println("After swap ");
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		
	}

}
