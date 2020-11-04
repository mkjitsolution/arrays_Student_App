package com.mkj.studentpro.dbwork;
 ///---------------------- dao (data access object)

import com.mkj.studentpro.beans.Student;

// StudentDAOImpl
public class MyDatabase {
	
	Student arr[] = new Student[1000]; // replacement of Database , (Oracle.db2)
    int counter = 0; 
    
    //CURD Operations
    
    // SQL : insert into Student(....);
    public boolean insertStudent(int rollNumber,String name,int marks)
    {
    	boolean isInserted = false;
    	
    	arr[counter] = new Student(); // create Student 
    	                              // pass entry
    	arr[counter].setRollNumber(rollNumber);
    	arr[counter].setName(name);
    	arr[counter].setMarks(marks);
    	counter++;
    	// if JDBC code --> return int true / false
    	isInserted = true; // manual entry will be replaced in JDBC 
    	
    	return isInserted;
    }
	/*
	public Student getStudentByRollNumber(int searchRollNumber)
	{
		Student temp = null;
		
		for(int i=0;i<counter;i++)
		{
			if(arr[i].getRollNumber() == searchRollNumber)
			{
				return arr[i];
			}
		}
		
		return temp;
	}
	*/
    public Student getStudentByRollNumber(int searchRollNumber)
	{
		Student temp = null;
	
		
		for(int i=0;i<counter;i++)
		{
			if(arr[i].getRollNumber() == searchRollNumber)
			{
				temp = arr[i];
				break;
			}
		}
		
		return temp; //{rollNumber : 10, Name : Ashish , Marks : 40}
	}
   
    public Student[] getAllStudents() // select * from Student
    {
    	return arr;
    }
    
    public int getCounter()
    {
    	return counter;
    }
   
}//end class
