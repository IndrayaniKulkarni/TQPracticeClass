package com.empSalary;

public class Department {

	private int did;
	private String dName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dName) {
		super();
		this.did = did;
		this.dName = dName;
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dName=" + dName + "]";
	}
	
}
