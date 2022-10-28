package javapartialbook;
import java.util.Scanner;
public class Hex2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char inChar;
		boolean isValid;
		int decimalResult = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		inStr = in.next();
		inStrLen = inStr.length() - 1;
		isValid = true;
		for (int chIndex = 0; chIndex <= inStrLen; chIndex++) {
			inChar = inStr.toUpperCase().charAt(chIndex);
			if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
				isValid = false;
				break;
			}
			if (inChar >= '0' && inChar <= '9') {
				decimalResult += Character.getNumericValue(inChar) * (int)Math.pow(16, inStrLen - chIndex);
			} else {
				decimalResult += (inChar - 55) * (int)Math.pow(16, inStrLen - chIndex);
			}
		}
		if (isValid) {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, decimalResult);
		} else {
			System.out.printf("error: Invalid hex string: \"%s\"", inStr);
		}
	}
}