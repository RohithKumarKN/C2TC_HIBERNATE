package Arrays;

import java.util.Scanner;

public class ArraysForStudentMarks {

	public ArraysForStudentMarks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter the marks");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();

		}
		double avg = 0;
		for (int i = 0; i < n; i++) {
			avg += marks[i];

		}
		avg /= n;
		System.out.println("The average marks of class is " + avg + " CGPA");
	}

}
