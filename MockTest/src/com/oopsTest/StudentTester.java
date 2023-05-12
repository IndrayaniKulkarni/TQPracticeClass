package com.oopsTest;

abstract class Student{
   
    protected String subject;
    
    Student(){
    	this.subject = "Science";
    }
   
    abstract void display();
	
}
class CollegeStudent extends Student{
	
	private int id;
	private String name;
	CollegeStudent(){
		super();
	}
	CollegeStudent(int id, String name){
		this();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("id = "+id+", name = "+name+" , subject = "+subject+"");
	}
}
public class StudentTester {

	public static void main(String[] args) {
		
		CollegeStudent s = new CollegeStudent(101,"Henry");
		s.display();

	}

}
