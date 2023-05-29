package com.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValues {

	public static HashMap<String,String> makeMap(ArrayList<Employee> empList){
		HashMap<String,String> deptEmpName = new HashMap<>();
		
		for(Employee e: empList) {
			deptEmpName.put(e.getEmpName(),e.getDept().getDeptName());
		}
		return deptEmpName;
	}
	public static void sortByEmpName(ArrayList<Employee> empList) {
		
		HashMap<String,String> deptEmpName = makeMap(empList);
		
		System.out.println("Before sorting = ");
		for(Map.Entry<String, String> en: deptEmpName.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		//List<Map.Entry<String,String>> deptEmpList = new ArrayList<>(deptEmpName.entrySet());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dept name key : emp name val
		
		Department d1 = new Department(10,"HR");
		Department d2 = new Department(20,"Production");
		Department d3 = new Department(30,"R&D");
		
		Employee e1 = new Employee(101,"John",45000.0f,d1);
		Employee e2 = new Employee(151,"Jacklyn",55000.0f,d3);
		Employee e3 = new Employee(131,"Mitali",75000.0f,d2);
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		sortByEmpName(empList);
		
		
	}

}
