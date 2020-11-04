package com.mkj.studentpro.beans;
//             insteads of beans dto(data transfer object)...


public class Student {

	private int rollNumber;
	private String name;
	private int marks;
	
	public Student() {
		
	}
	
		
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
