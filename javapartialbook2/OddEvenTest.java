package javapartialbook;
import java.util.Scanner;
public class OddEvenTest {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = in.nextInt();
		if (isOdd(number)) {
			System.out.println(number + " is an odd number");
		} else {
			System.out.println(number + " is an even number");
		}
	}
	public static boolean isOdd(int num) {
		if (num % 2 == 0) {
			return false;
		}
		return true;
	}
}