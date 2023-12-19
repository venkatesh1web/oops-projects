package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabase {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;
//	constructor: prompt user to enter student name and year	
	public StudentDatabase() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Student fisrt Name:");
		this.firstName = scn.nextLine();
		System.out.println("Enter Student last Name:");
		this.lastName = scn.nextLine();
		System.out.println("1 - freshman\n 2-sophmore\n 3-junior\n 4-senior\n Enter student class level");
		this.gradeYear = scn.nextInt();
		
		setStudentID();
		System.out.println(firstName +" "+lastName+" "+gradeYear+" "+studentId);
	
		
	}
	

	
//	generate an Id
	private void setStudentID() {
//		grade level + ID
		id++;
		this.studentId = gradeYear+""+id;
	}
	
//	Enroll in courses
	public void enroll() {
		do {
		System.out.println("enter the course to enroll(Q to quit)");
		Scanner scn = new Scanner(System.in);
		String course = scn.nextLine();
		if(!course.equals("Q")) {
			courses = courses +"\n"+course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}else {
			break;
		}
		}while(1 != 0);
		System.out.println("ENROLLED COURSES:"+ courses);
		System.out.println("TUITION BALANCE:"+ tuitionBalance);
		
	}
	
//	View balance 
	public void viewBalance() {
		System.out.println("Your balance is:"+tuitionBalance);
	}
	
//  Pay Tuition
	public void payTuition() {
		System.out.println("Enter your payment:");
		Scanner scn = new Scanner(System.in);
		int payment = scn.nextInt();
		tuitionBalance =tuitionBalance -payment;
		System.out.println("thank you for your payment of :"+ payment);
		viewBalance();
	}
	
//	Show status
	public String showInfo() {
		return "Name: " + firstName +
				"\nCourses enrolled: " + courses +
				"\nBalance: " + tuitionBalance ;
				
	}

}
