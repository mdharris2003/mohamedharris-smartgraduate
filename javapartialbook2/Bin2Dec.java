package javapartialbook;
import java.util.Scanner;
public class Bin2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char inChar;
		boolean isValid;
		int decimalResult = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		inStr = in.next();
		inStrLen = inStr.length() - 1;
		isValid = true;
		for (int chIndex = 0; chIndex <= inStrLen; chIndex++) {
			inChar = inStr.charAt(chIndex);
			if (!(inChar == '0' || inChar == '1')) {
				isValid = false;
				break;
			} 
			decimalResult += Character.getNumericValue(inChar) * (int)Math.pow(2, inStrLen - chIndex);
		}
		if (isValid) {
			System.out.printf("The equivalent decimal number for binary \"%s\" is: %d", inStr, decimalResult);
		} else {
			System.out.printf("error: Invalid binary string: \"%s\"", inStr);
		}
	}
}