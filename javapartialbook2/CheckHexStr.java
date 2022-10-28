package javapartialbook;
import java.util.Scanner;
public class CheckHexStr {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char inChar;
		boolean isValid;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		inStr = in.next();
		inStrLen = inStr.length();
		isValid = true;
		for (int chIndex = 0; chIndex < inStrLen; chIndex++) {
			inChar = inStr.toUpperCase().charAt(chIndex);
			if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
				isValid = false;
				break;
			}
		}
		if (isValid) {
			System.out.printf("\"%s\" is a hex string", inStr);
		} else {
			System.out.printf("\"%s\" is NOT a hex string", inStr);
		}
	}
}