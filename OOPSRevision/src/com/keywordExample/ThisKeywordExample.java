package com.keywordExample;
class Emp{
	private int empId;
	private String empName;
	
	public Emp() {}
	public Emp(int empId, String empName) {
		this(); // USE 1: to call constructor 
		this.empId = empId; // USE 2 : to ref. current object instance variable
		this.empName = empName;
	}
	
	public void display() {
		System.out.println(this.toString());//USE 3: to call current class method
	}

	public Emp getEmpInstance() {
		// USE 4: returning current class instance
		return this;
	}
	
	public void displayEmpDetails(Emp e) {
		// USE 5: passing current object as an argument in the method
		System.out.println(this.getEmpInstance());
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		
		Emp e = new Emp(101,"Jane Doe");
		e.display();
		e.displayEmpDetails(e);
		
	}
}
