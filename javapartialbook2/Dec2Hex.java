package javapartialbook;
import java.util.Scanner;
public class Dec2Hex {	
	public static void main(String[] args) {
	int decimalInput;
	String resultHex = "";
	int remainder;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a decimal number: ");
	decimalInput = in.nextInt();
	while (decimalInput != 0) {
		remainder = decimalInput % 16;
		if (remainder >= 10) {
			resultHex = (char)(remainder + 55) + resultHex;
		} else {
			resultHex = remainder + resultHex;
		}
		decimalInput /= 16;
	}
	System.out.println("The equivalent hexadecimal number is: " + resultHex);
}
}