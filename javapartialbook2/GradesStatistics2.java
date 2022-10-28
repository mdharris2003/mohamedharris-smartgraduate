package javapartialbook;
import java.util.Scanner;
public class GradesStatistics2 {
	public static int[] grades;
	public static void main(String[] args) {
		readGrades();
		System.out.println("The grades are: ");
		print(grades);
		System.out.printf("The average is %.2f\n", average(grades));
		System.out.printf("The median is %.2f\n", median(grades));
		System.out.printf("The minimum is %d\n", min(grades));
		System.out.printf("The maximum is %d\n", max(grades));
		System.out.printf("The standard deviation is %.2f", stdDev(grades));
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
	public static double stdDev(int[] array) {
		int n = array.length;
		int sumOfSquare = 0;
		double meanSquared = Math.pow(average(array), 2);
		double standardDeviation;
		for (int i = 0; i < n; i++) {
			sumOfSquare += array[i] * array[i];
		}
		standardDeviation = Math.sqrt((1.0 / n) * sumOfSquare - meanSquared);
		return standardDeviation;
	}
	public static double median(int[] array) {
		array.sort(array);
		int n = array.length;
		double median;
		if (n % 2 == 0) {
			median = (array[(n / 2) - 1] + array[n / 2]) / 2.0;
		} else {
			median = array[((n + 1) / 2) - 1];
		}
		return median;
	}
	public static double average(int[] array) {
		int sum = 0;
		double average;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
     	average = (double)sum / array.length;
		return average;
	}
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
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
}