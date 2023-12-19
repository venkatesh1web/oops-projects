package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10; 
	private String alternateEmail;
	private String companySuffix = "company.com";
	
//	constructor to recieve firstname and lastname
	public Email(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for "+this.firstName+ " "+this.lastName);
		
//		call a method for the department -return department 
		this.department = setDepartment();
		System.out.println("Department " + this.department);
		
//		call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
//		combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is: "+email);
	}
	
//	ask for department
	private String setDepartment() {
		System.out.println("department codes \n1 for sales \n2 for Development \n3 for Accounting \n0 for none \nenter dept codes:");
		Scanner scn = new Scanner(System.in);
		int depChoice = scn.nextInt();
		if(depChoice == 1) {
			return "Sales";
		}else if(depChoice ==2 ) {
			return "Dev";
		}else if(depChoice == 3) {
			return "acct";
		}else {
			return "";
		}
	}
	
//	generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
//	set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
//	set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
//	change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxcapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return ("DISPLAY NAME: "+ firstName + " " + lastName +
				"\nCPMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity +"mb");
	}

}
