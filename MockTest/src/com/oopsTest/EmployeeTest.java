package com.oopsTest;
class Employee{
	private int empId;
	private String empName;
	private float salary;
	
	Employee(){
	}
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	Employee(int empId, String empName, float salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int id) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return ("Employee [empId ="+empId+", empName = "+empName+", salary ="+salary+"]");
	}
}
class Manager extends Employee{
	
	int exper;
	
	Manager(){
		super();
	}
	Manager(int empId, String empName, float salary, int exper){
		super(empId, empName);
		super.setSalary(salary);
		this.exper = exper;
	}
	
	public float managerSalary() {
		return (float)(super.getSalary()+super.getSalary()*0.15);
	}
	
	public void setSalary(float salary) {
		super.setSalary(managerSalary());
	}
	
	public String toString() {
		return("Manger ["+super.toString()+", exper =  "+exper+"]");
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(101,"John Doe",60000.0f,5);
		m1.setSalary(60000.0f);
		System.out.println(m1.toString());
		

	}

}
