package com.logicalString;

// 6) string anagram 
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

//	public static void sortChar(char ch[]) {
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = i + 1; j < ch.length; j++) {
//				char temp = ch[i];
//				ch[i] = ch[j];
//				ch[j] = temp;
//			}
//		}
//	}

	public static boolean isAnagram(String word1, String word2) {

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		char ch1[] = word1.toCharArray();
		char ch2[] = word2.toCharArray();

		if(ch1.length!=ch2.length) {
			return false;
		}
		if (ch1.length == ch2.length) {
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
//			System.out.println(Arrays.toString(ch1));
//			System.out.println(Arrays.toString(ch2));
			for(int i=0; i<ch1.length; i++) {
				if(ch1[i]!=ch2[i]) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		System.out.println(isAnagram(word1, word2)?"Yes, anagram..":"Not anagram..");
		sc.close();
	}

}
