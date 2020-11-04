package com.mkj.studentpro.ui;

import java.util.Scanner;

import com.mkj.studentpro.beans.Student;
import com.mkj.studentpro.dbwork.MyDatabase;

public class UserConsole {

	Scanner sc = new Scanner(System.in);
	MyDatabase oracle = new MyDatabase();

	public static void main(String[] args) {

		UserConsole app = new UserConsole();

		while (true) {
			System.out.println("\n\n **** Student App Menu ****");
			System.out.println("1. Create Student");
			System.out.println("2. Get Student By Roll Number");
			System.out.println("3. Get All Students");
			System.out.println("0. EXIT");

			int choice = new Scanner(System.in).nextInt();

			switch (choice) {
			case 1:
				app.createStudent();
				break;
			case 2:
				app.readStudentByRollNumber();
				break;
			case 3:
				app.displayAllStudents();
				break;
			case 0:
				System.exit(0);
				break;

			
			}//end switch

		}//end while

	}// end main

	public void createStudent() {
		// step 1: get details from user
		System.out.println("Enter Student Details");

		System.out.println("Enter RollNumber ");
		int rollNumber = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Name ");
		String name = sc.nextLine();

		System.out.println("Enter Marks ");
		int marks = Integer.parseInt(sc.nextLine());

		// step 2: pass data to database

		boolean result = oracle.insertStudent(rollNumber, name, marks);

		if (result)
			System.out.println(" *** Student " + rollNumber + " Inserted ");

	}

	public void readStudentByRollNumber() {

		System.out.println(" Enter Student Roll Number : - ");
		int searchedRollNumber = Integer.parseInt(sc.nextLine());

		Student student = oracle.getStudentByRollNumber(searchedRollNumber);

		if (student != null) {
			renderStudent(student);
		} else {
			System.out.println("Roll Number Not In The Database !!!");
		}
	}

	public void displayAllStudents() {
		Student arr[] = oracle.getAllStudents();
		int counter = oracle.getCounter();

		for (int i = 0; i < counter; i++) {
			renderStudent(arr[i]);
		}

	}

	public void renderStudent(Student student) {
		System.out.println(" ------ My Student App -------");
		System.out.println(" RollNumber " + student.getRollNumber());
		System.out.println(" Name " + student.getName());
		System.out.println(" Marks " + student.getMarks());
		System.out.println("\n");
	}

}// end class
