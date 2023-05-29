package com.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpDeptMap {
	
	public static void makeMap(ArrayList<Employee> empList) {
		
		HashMap<String, ArrayList<String>> deptEmpName= new HashMap<>();
		ArrayList<String> empNames;
		
		for(Employee e:empList) {
			
			if(deptEmpName.containsKey(e.getDept().getDeptName())) {
				empNames = deptEmpName.get(e.getDept().getDeptName());
				empNames.add(e.getEmpName());
			}
			else {
				empNames = new ArrayList<>();
				empNames.add(e.getEmpName());
			}
			deptEmpName.put(e.getDept().getDeptName(), empNames);
		}
		for(Map.Entry<String, ArrayList<String>> en:deptEmpName.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}

	public static void main(String[] args) {
		Department d1 = new Department(10,"HR");
		Department d2 = new Department(20,"Production");
		Department d3 = new Department(30,"R&D");
		
		Employee e1 = new Employee(101,"John",45000.0f,d1);
		Employee e2 = new Employee(151,"Jacklyn",55000.0f,d3);
		Employee e3 = new Employee(131,"Mitali",75000.0f,d2);
		Employee e4 = new Employee(141,"Jane",45000.0f,d1);
		Employee e5 = new Employee(151,"James",55000.0f,d3);
		Employee e6 = new Employee(171,"Mohan",75000.0f,d2);
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		makeMap(empList);
	}

}
