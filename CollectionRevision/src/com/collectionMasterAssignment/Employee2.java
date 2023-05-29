package com.collectionMasterAssignment;
//What will be output of above program:
//package com.org.tqpp;

import java.util.HashSet;

public class Employee2 {
	public String name;

	public int hashCode() {
		return 31;
	}

	public boolean equals(Object obj) {
		Employee2 e = (Employee2) obj;
		return this.name.equals(e.name);
	}

	public static void main(String args[]) {
		Employee2 employeeOne = new Employee2();
		Employee2 employeeTwo = new Employee2();
		employeeOne.name = "John";
		employeeTwo.name = "Martin";
		HashSet employeeSet = new HashSet();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);
		System.out.println(employeeSet.size());
// If size is 2 justify and if size is 1 justify
		// OUTPUT : 2
		// justification :  
		// Though hashcode for both obj is same i.e. 31,
		// equals methods returns different val for diff string
		//hashcode and equals methods are closely associated while adding value to
		// hashmap or hashset, as whilst adding value, it checks hashcode as well as 
		// equality. Because 2 obj can return similar hashcode due to poor logic
		// which this code represents the case.
	}
}