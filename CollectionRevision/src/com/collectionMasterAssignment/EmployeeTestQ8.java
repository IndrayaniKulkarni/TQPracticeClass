package com.collectionMasterAssignment;

import java.util.HashMap;
import java.util.Objects;

/*
 * Create a hashmap where employee is key and string is value.
Employee ( int emp_id , emp_name , emp_salary)
Implement hashcode and equals methd so that map 
should not allow duplicate entry of employees with same salary in the map
 */
class EmployeeQ8 {
	int emp_id; 
	String emp_name;
	float emp_salary;
	
	public EmployeeQ8() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeQ8(int emp_id, String emp_name, float emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "EmployeeQ8 [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_salary);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj ==null) {
			return false;
		}
		else if(this.getClass()!=obj.getClass()) {
			return false;
		}
		EmployeeQ8 other = (EmployeeQ8) obj;
		return (this.getEmp_salary()==other.getEmp_salary());
	}
	
}
public class EmployeeTestQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// hashmap where employee is key and string is value.
		// Though EmployeeQ8 is unconventional name for defining the class, 
		// it is merely used for this example and this package exercise
		EmployeeQ8 e1 = new EmployeeQ8(101,"Jacklyn",50000.0f);
		EmployeeQ8 e2 = new EmployeeQ8(102,"Danis",50000.0f);
		EmployeeQ8 e3 = new EmployeeQ8(101,"Jacklyn",60000.0f);
		EmployeeQ8 e4 = new EmployeeQ8(103,"Tapesh",58000.0f);
		HashMap<EmployeeQ8,String> empMap = new HashMap<>();
		empMap.put(e1,"e1");
		empMap.put(e2,"e2");
		empMap.put(e3,"e3");
		empMap.put(e4,"e4");
		System.out.println(empMap);
	}

}
