package javapartialbook;
import java.util.Scanner;
public class Oct2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char inChar;
		int decimalResult = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an octal string: ");
		inStr = in.next();
		inStrLen = inStr.length() - 1;
		for (int chIndex = 0; chIndex <= inStrLen; chIndex++) {
			inChar = inStr.charAt(chIndex);
			decimalResult += Character.getNumericValue(inChar) * Math.pow(8, inStrLen - chIndex);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d", inStr, decimalResult);
	}
}