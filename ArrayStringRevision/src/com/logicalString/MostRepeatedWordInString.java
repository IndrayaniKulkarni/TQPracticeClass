package com.logicalString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//7) most repeated word in a string

public class MostRepeatedWordInString {

	static ArrayList<String> mostRepeated(String words[]){
		ArrayList<String> ans = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], (map.get(words[i])+1));
			}
			else {
				map.put(words[i], 1);
			}
		}
		for(Map.Entry<String,Integer> en:map.entrySet()) {
			String w = en.getKey();
			int val = en.getValue();
			if(val>1) {
				ans.add(w);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		String str = "Java is a programming langauge. Java is object oriented programming langauge.";
		str = str.replaceAll("\\.","");
		String words[] = str.split("\\s");
		
		//System.out.println("words = "+Arrays.toString(words));
		
		ArrayList<String> ans = mostRepeated(words);
		
		System.out.println(ans);
	}

}
