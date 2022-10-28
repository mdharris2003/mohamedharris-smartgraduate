package javapartialbook;
import java.util.Scanner;
public class AverageWithInputValidation {
	public static void main(String[] args) {
		final int MAX_STUDENTS = 3;
		Scanner in = new Scanner(System.in);
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;
		for (int studentNo = 1; studentNo <= MAX_STUDENTS; studentNo++) {
			isValid = false;
			do {
				System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
				numberIn = in.nextInt();

				if (numberIn >= 0 && numberIn <= 100) {
					isValid = true;
				} else {
					System.out.println("Invalid input, try again...");
				}
			} while (!isValid);
			sum += numberIn;
		}
		average = (double) sum / MAX_STUDENTS;
		System.out.printf("The average is: %.2f", average);
	}
}