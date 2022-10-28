package javapartialbook;
import java.util.Scanner;
public class SumOfDigitsInt {
	public static void main(String[] args) {
		int inNumber;
		int digitSum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		inNumber = in.nextInt();
		while (inNumber > 0) {
			digitSum += inNumber % 10;
			inNumber /= 10;
		}
		System.out.print("The sum of all digits is: " + digitSum);
	}
}