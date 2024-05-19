package StudentDatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Enter year: \n1 Freshman \n2 Sophmore \n3 Junior \n4 Senior: ");
		this.year = in.nextInt();
		
		setID();
		
	}
	
	private void setID() {
		id++;
		this.studentID =  year + "" + id;
	}
	
	public void enroll() {
		while(true) {
			System.out.println("Enter course to enroll (q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.next().toLowerCase();
			if(course.equals("q")){
				break;
			}
			courses += "\n" + course + "\n";
			tuitionBalance += costOfCourse;
		}
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment amount: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of " + payment);
	}
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance +
				"\nStudent ID: " + studentID +
				"\nGrade Level: " + year;
	}
}
