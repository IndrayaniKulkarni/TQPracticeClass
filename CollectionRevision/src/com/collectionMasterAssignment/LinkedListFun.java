package com.collectionMasterAssignment;
//What is the output of the program
//package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFun {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("Jan");
	ll.add("Feb");
	ll.add("Apr");
	ll.add("Jan");
	Collections.sort(ll);
	ListIterator<String> itr = ll.listIterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	ll.add(2,"August");
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}
/*
 * OUTPUT : 
Apr
Feb
Jan
Jan
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)
	at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)
	at CollectionRevision/com.collectionMasterAssignment.LinkedListFun.main(LinkedListFun.java:23)
-- ListIterator is fail fast which means modification can't be done while iterating through list.
-- As in listIterator or Iterator only returns cursor over original list and hence doesn't change list
 */
}