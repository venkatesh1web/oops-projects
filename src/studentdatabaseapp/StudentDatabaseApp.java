package studentdatabaseapp;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentDatabase student = new StudentDatabase();
//		student.enroll();
//		student.payTuition();
//	    System.out.println(student.showInfo());	
//		
//		Ask how many new students we want to add
	    System.out.println("Enter number of new Students to enroll:");
	    Scanner scn = new Scanner(System.in);
	    int numOfStudents = scn.nextInt();
	    StudentDatabase[] students = new StudentDatabase[numOfStudents];
	    
//		create n number  of new students
	    for(int i=0;i<numOfStudents;i++) {
	    	 students[i] = new StudentDatabase();
	    	 students[i].enroll();
	    	 students[i].payTuition();
		    System.out.println(students[i].showInfo());	
		   
	    }
	    for(int i=0;i<numOfStudents;i++) {
	    	 System.out.println(students[i].toString());
	    }
        
	}
}
