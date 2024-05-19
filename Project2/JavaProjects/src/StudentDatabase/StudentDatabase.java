package StudentDatabase;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		System.out.println("How many students want to enroll: ");
		Scanner in = new Scanner(System.in);
		Student[] students = new Student[in.nextInt()];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
	}

}
