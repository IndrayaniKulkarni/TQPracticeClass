package com.collectionMasterAssignment;

import java.util.HashMap;

//What will be output of following program.
public class HashMapTest4 {
	public static void main(String[] args) {
		HashMap obj = new HashMap();
		// The constructor Integer(int) has been deprecated
		// since version 9 and marked for removal
//		obj.put("A", new Integer(1));
//		obj.put("B", new Integer(2));
//		obj.put("A", new Integer(4));
//		obj.put("C", new Integer(3));
		obj.put("A", 1);
		obj.put("B", 2);
		obj.put("A", 4);
		obj.put("C", 3);
		System.out.println(obj); // Justify

		// OUTPUT : {A=4, B=2, C=3}

		// letters are key and integers are values in this hashmap
		// when call method obj.put(key,val) which inturn calls putVal()
		// internally first checks
		// whether key is null or not
		// if key == null - means hashval 0
		// then check whether same val present or not
		// if val present then return old val and insert new val
		// else add new key value pair

		// if key !=null
		// then it calls hash() -> hashcode() which returns hashval of the key to
		// hash() and then we get bucket index
		// hashcode computation is done twice to make sure bucket index lies
		// in between 0 to 15
		// using bucket index check whether key present or not
		// if key present
		// then return and update old val
		// else add key val pair

		// due this process
		// 1.
		// A = 1
		// 2.
		// B = 2
		// 3.
		// A key exists hence replace
		// A = 4
		// 4.
		// C = 3
	}
}