package com.collectionMasterAssignment;

import java.util.ArrayList;
import java.util.Collections;

//1. Write the necessary code to sort employee objects by empId.
// public class Employee 
class Employee implements Comparable<Employee> {
	private int empId;
	private String name;

// your code goes here.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.getEmpId() - o.getEmpId());
	}

}

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		Employee e3 = new Employee(2, "Radhika");
		Employee e4 = new Employee(1, "Sameer");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);
		alEmp.add(e4);
// your code to call sort function goes here.
		System.out.println("Before sort by id =");
		for (Employee e : alEmp) {
			System.out.println(e);
		}
		Collections.sort(alEmp);
		System.out.println("After sort by id =");
		for (Employee e : alEmp) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------");
		/*
		 * 2. Complete following code to sort above employee object by name. 
		 * Employee object is from same earlier program. 
		 * public class EmpNameComparator implements Comparator<Employee>
		 * { // write function to compare here } 
		 * public static void main(String[] args) { 
		 * ArrayList<Employee> alEmp = new
		 * ArrayList<Employee>(); 
		 * Employee e1 = new Employee(3, "Ajit"); 
		 * Employee e2 =
		 * new Employee(4,"Suman") ; 
		 * alEmp.add(e1); 
		 * alEmp.add(e2); // code to call sort function here }
		 */
		System.out.println("Before sort by name =");
		for (Employee e : alEmp) {
			System.out.println(e);
		}
		Collections.sort(alEmp, new EmpNameComparator());
		System.out.println("After sort by name =");
		for (Employee e : alEmp) {
			System.out.println(e);
		}
	}
}