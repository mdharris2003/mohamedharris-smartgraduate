package javapartialbook;
import java.util.Scanner;
public class RadixN2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen, radix;
		char inChar;
		int decimalResult = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radix :");
		radix = in.nextInt();
		System.out.print("Enter the string: ");
		inStr = in.next();
		inStrLen = inStr.length() - 1;
		for (int chIndex = 0; chIndex <= inStrLen; chIndex++) {
			inChar = inStr.toUpperCase().charAt(chIndex);
			if (inChar >= 'A' && inChar <= 'F') {
				decimalResult += (inChar - 55) * Math.pow(radix, inStrLen - chIndex);
				continue;
			}
			decimalResult += Character.getNumericValue(inChar) * Math.pow(radix, inStrLen - chIndex);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d", inStr, decimalResult);
	}
}