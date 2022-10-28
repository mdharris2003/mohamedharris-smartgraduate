package javapartialbook;
import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
		final int numStudents;
		int[] grades;
		int sum = 0, min, max;
		double average;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();
		grades = new int[numStudents];
		for (int studentNo = 0; studentNo < grades.length; studentNo++) {
			System.out.print("Enter the grade for student " + (studentNo + 1) + ": ");
			grades[studentNo] = in.nextInt();
		}
		min = grades[0];
		max = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < min) {
				min = grades[i];
			} 
			if (grades[i] > max) {
				max = grades[i];
			}
			sum += grades[i];
		}
		average = (double)sum / grades.length;
		System.out.printf("The average is: %.2f\n", average);
		System.out.printf("The minimum is: %d\n", min);
		System.out.printf("The maximum is: %d", max);
	}
}