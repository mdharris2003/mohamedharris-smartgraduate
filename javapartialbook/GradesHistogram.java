package javapartialbook;
import java.util.Scanner;
public class GradesHistogram {
	public static int[] grades;
	public static void main(String[] args) {
		readGrades();
		System.out.println("The grades are: ");
		print(grades);
		verticalHistogram(grades);
		System.out.println();
		horizontalHistogram(grades);
	}
	public static int[] calculateHistogram(int[] array) {
		int[] histogramData = new int[10];
		int currentData;
		for (int i = 0; i < array.length; i++) {
			currentData = array[i] / 10;
			if (currentData < 9) {
				histogramData[currentData]++;
			} else {
				histogramData[9]++;
			}
		}
		return histogramData;
	}
	public static void verticalHistogram(int[] array) {
		int[] data = calculateHistogram(grades);
		int upperbound, lowerbound;
		for (int i = 0; i < data.length; i++) {
			lowerbound = i * 10;
			upperbound = (i == data.length - 1)? (i * 10 + 10) : (i * 10 + 10) - 1;
			System.out.printf("%3d - %3d: ", lowerbound, upperbound);
			for (int star = 1; star <= data[i]; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void horizontalHistogram(int[] array) {
		int[] data = calculateHistogram(array);
		int maxData = max(data);
		int lowerbound, upperbound;
		for (int i = maxData; i >= 1; i--) {
			for (int j = 0; j < data.length; j++) {
				if (i == data[j]) {
					System.out.printf("%4c  ", '*');
					--data[j];
				} else {
					System.out.printf("%4c  ", ' ');
				}
			}
			System.out.println();
		}
		for (int i = 0; i < data.length; i++) {
			lowerbound = i * 10;
			upperbound = (i == data.length - 1)? (i * 10 + 10) : (i * 10 + 10) - 1;
			System.out.printf(" %2d-%2d", lowerbound, upperbound);
		}
	}
	public static void readGrades() {
		int numberOfStudents;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		numberOfStudents = in.nextInt();
		grades = new int[numberOfStudents];
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			grades[i] = in.nextInt();
		}
	}
	public static void print(int[] array) {
		System.out.print("The values are: [");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}