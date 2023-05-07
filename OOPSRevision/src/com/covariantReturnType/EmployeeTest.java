package com.covariantReturnType;
class Employee{
	private String name;
	private float salary;
	public Employee() {
		
	}
	 public Employee(String name, float salary) {
	        this.name = name;
	        this.salary = salary;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee getEmp() {
		return new Employee(name,salary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
class Manager extends Employee{
	
	private float bonus;

	public Manager() {}
	
    public Manager(String name, float salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public float getSalary() {
        return super.getSalary() + bonus;
    }

    public Manager getEmployee() {
        return new Manager(getName(), getSalary(), bonus);
    }

	@Override
	public String toString() {
		return "Manager ["+super.toString()+", bonus=" + bonus + "]";
	}
    
}
public class EmployeeTest {

	public static void main(String[] args) {
		Manager manager = new Manager("John Doe", 5000, 1000);
		Employee emp = manager.getEmployee();
		
		System.out.println(emp);
		
	}

}
