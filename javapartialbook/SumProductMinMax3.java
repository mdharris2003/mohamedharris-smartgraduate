package javapartialbook;
import java.util.Scanner;
public class SumProductMinMax3 {
	public static void main(String[] args) {
		int number1, number2, number3;
		int sum, product, min, max;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		number1 = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		number2 = in.nextInt();
		System.out.print("Enter 3rd integer: ");
		number3 = in.nextInt();
		in.close();
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		min = number1;
		min = (min <= number2)? min : number2;
		min = (min <= number3)? min : number3;
		max = number1;
		max = (max >= number2)? max : number2;
		max = (max >= number3)? max : number3;
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
	}
}