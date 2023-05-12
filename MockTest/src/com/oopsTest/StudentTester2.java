package com.oopsTest;
// first version

abstract class Student2{
    protected int id;
    protected String name;
    protected String subject;
    
    Student2(){
    	this.subject = "Science";
    }
    Student2(int id, String name){
    	this();
    	this.id = id;
    	this.name = name;
    }
    Student2(int id, String name, String subject){
    	this(id,name);
    	this.subject = subject;
    }
    abstract void display();
	
}
class CollegeStudent2 extends Student2{
	
	CollegeStudent2(){
		super();
	}
	CollegeStudent2(int id, String name){
		super(id,name);
	}
	CollegeStudent2(int id, String name, String subject){
		super(id, name, subject);
	}
	public void display() {
		System.out.println("id = "+id+", name = "+name+" , subject = "+subject+"");
	}
}
public class StudentTester2 {

	public static void main(String[] args) {
		
		CollegeStudent s = new CollegeStudent(101,"Henry");
		s.display();

	}

}
