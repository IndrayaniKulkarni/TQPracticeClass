package com.empSalary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeDeptSalary {

	public static void main(String[] args) {
		//hashcode and equ
		Department d1 = new Department(10,"Sales");
		Department d2 = new Department(20,"Production");
		Department d3 = new Department(30,"HR");
		
		Employee e1 = new Employee(101,"John",45000.0f,d1);
		Employee e2 = new Employee(102,"Jane",55000.0f,d2);
		Employee e3 = new Employee(103,"Harry",95000.0f,d1);
		Employee e4 = new Employee(105,"William",85000.0f,d3);
		Employee e5 = new Employee(104,"James",60000.0f,d2);
		
		HashMap<Employee,Department> mapEmp = new HashMap<>();
		mapEmp.put(e1,d1);
		mapEmp.put(e2,d2);
		mapEmp.put(e3,d1);
		mapEmp.put(e4,d3);
		mapEmp.put(e5,d1);
		
		System.out.println("Before sorting by salary = ");
		for(Map.Entry<Employee,Department> en: mapEmp.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		TreeMap<Employee,Department> empDeptLs = new TreeMap<>(new SalaryComparator());
		empDeptLs.putAll(mapEmp);
		
		System.out.println("After sorting by salary = ");
		for(Map.Entry<Employee,Department> en: empDeptLs.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
	}

}
