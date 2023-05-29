package com.collectionMasterAssignment;

public class TrueOrFalseQ12 {
//	12. State True or False
//	1. Array List maintains insertion order. - TRUE
	
//	2. HashMap implements collection interface.
//	False. `HashMap` in Java implements the `Map` interface, not the `Collection` interface ².

//	3. LinkedHashMap is synchronized.
//	False. The implementation of LinkedHashMap is not synchronized. 
//	If multiple threads access a linked hash map concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally 

//	4. HashMap maintains insertion order. 
//	False - it stores key-val pair according hashcode generated using key in hashtable i.e dynamic arr
//	The statement is false. The HashMap class does not maintain the order of the elements. 
//	This means that it might not return the elements in the same order they were 
//	inserted into it1. If you need to maintain the insertion order of elements, 
//	you can use LinkedHashMap instead.
	
//	5. LinkedHashMap allows null values. TRUE
//	The statement is trueLinkedHashMap allows one null key and multiple null values
	
//	6. ConcurrentHashMap locks entire map. 
//	False. ConcurrentHashMap does not lock the entire map. 
//	Instead, it uses a multitude of locks (by default, 16 of them), 
//	each lock controlling one segment of the hash. 
//	When setting data in a particular segment, the lock for that segment 
//	is obtained. This means that two updates can still simultaneously 
//	execute safely if they each affect separate segments, thus minimizing 
//	lock contention and maximizing performance.
	
//	7. TreeMap does not allow null values. 
//	False, TreeMap does allow null values. However, it does not allow null keys 
//	by default. If you try to add a null key to a TreeMap, 
//	it will throw a NullPointerException. 
//	This is because the default natural ordering comparator throws the exception3. 
//	If you want to allow null keys, you can create the TreeMap with a comparator 
//	that allows nulls, such as Comparator.nullsFirst(Comparator.naturalOrder()) or Comparator.nullsLast(Comparator.naturalOrder())
	
//	8. HashSet allows duplicate values.
//	False. HashSet does not allow duplicate values. It implements the Set interface, 
//	which does not allow duplicate values. If you try to add a duplicate element in 
//	HashSet, the old value would be overwritten.
	
//	9. ArrayList allows multiple null values.
//	True,ArrayList allows multiple null values by design. 
//	It is a resizable-array implementation of the List interface and permits 
//	all elements, including null1.
	
//	10. LinkedHashMap allows null key.
//	True, LinkedHashMap allows null keys. It is an implementation of the Map 
//	interface and extends the HashMap class. It may have one null key and multiple 
//	null values
	
//	11. Duplicate values are not allowed in HashMap.
//	False,HashMap does not allow duplicate keys but it allows duplicate values. 
//	That means a single key can’t contain more than one value but more than one 
//	key can contain a single value
	
//	12. LinkedHashMap stores entries in ascending order.
//	False, LinkedHashMap maintains insertion-order of keys. 
//	If you want to sort it in ascending order of keys, 
//	you can pass LinkedHashMap entries as constructor-argument to TreeMap class inter-conversion constructor.
	
//	13. Insertion order is maintained in TreeMap.
//	False, TreeMap is kept sorted via a Comparator or the natural Comparable ordering of the keys. 
//	It does not maintain insertion order. If you want to maintain insertion order, 
//	you can use LinkedHashMap
	
//	14. Treemap performs better than HashMap and LinkedHashMap
//	True
//	It depends on the use caseHashMap offers 0(1) lookup and insertion1LinkedHashMap 
//	offers 0(1) lookup and insertion and maintains insertion order.
//	TreeMap offers O(log N) lookup and insertion and is kept sorted via a 
//	Comparator or the natural Comparable ordering of the keys1. 
//	TreeMap is slower than HashMap and LinkedHashMap, but it is useful if you need to iterate the elements in a sorted order
	
//	15. Vector maintains insertion order.
//	True. Vector maintains insertion order. It is a dynamic array that can grow or shrink in size as needed and elements are stored in the order they were inserted.
}
