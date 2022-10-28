package javapartialbook;
import java.util.Scanner;
public class MagicSum {
	public static void main(String[] args) {
		final int SENTINEL = -1;
		int numberIn;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer (or -1 to end): ");
		numberIn = in.nextInt();
		while (numberIn != SENTINEL) {
			if (hasEight(numberIn)) {
				sum += numberIn;
			}
			System.out.print("Enter a number (or -1 to end): ");
			numberIn = in.nextInt();
		}
		System.out.println("The magic sum is: " + sum);
	}
	public static boolean hasEight(int num) {
		while (num != 0) {
			if (num % 10 == 8) {
				return true;
			}
			num /= 10;
		}
		return false;
	}
}