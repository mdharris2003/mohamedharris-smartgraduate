package javapartialbook;
import java.util.Scanner;
public class Swap2Integers {
	public static void main(String[] args) {
		int number1, number2, temp;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		number1 = in.nextInt();
		System.out.print("Enter second integer: ");
		number2 = in.nextInt();
		in.close();
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.printf("After the swap, first integer is: %d, second integer is: %d", number1, number2);
	}
}