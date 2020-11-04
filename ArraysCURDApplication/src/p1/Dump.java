package p1;

import com.mkj.studentpro.beans.Student;

public class Dump {

	public static void main(String[] args) {
		
		Student arr[] = new Student[3];
		arr[1] = new Student();
		arr[1].setRollNumber(101);
		arr[1].setName("ashish");
		arr[1].setMarks(40);
		
		System.out.println(arr[1].getName());
		
		
	}
}
