package com.collectionMasterAssignment;

//package com.org.tqpp;
import java.util.HashSet;

public class Employee3 {
	public String name;

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String args[]) {
		Employee3 employeeOne = new Employee3();
		Employee3 employeeTwo = new Employee3();
		employeeOne.name = "John";
		employeeTwo.name = "Martin";
		HashSet employeeSet = new HashSet();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);
		System.out.println(employeeSet.size());
// If size is 2 justify and if size is 1 justify
		// OUTPUT: 1
		// justification :
		// Though hashcode for both obj is same i.e. 31,
		// equals methods returns true irrespective of equal or not
		// hashcode and equals methods are closely associated while adding value to
		// hashmap or hashset, as whilst adding value, it checks hashcode as well as
		// equality. Because 2 obj can return similar hashcode due to poor logic
		// which this code represents the case.
		// as hashcode and equals method indicate both obj are same though they aren't
		// only one obj is added in the hashset
	}
}