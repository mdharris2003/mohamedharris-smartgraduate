package javapartialbook;
import java.util.Scanner;
public class CheckBinStr {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char inChar;
		boolean isValid;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		inStr = in.next();
		inStrLen = inStr.length();
		isValid = true;
		for (int chIndex = 0; chIndex < inStrLen; chIndex++) {
			inChar = inStr.charAt(chIndex);
			if (!(inChar == '0' || inChar == '1')) {
				isValid = false;
				break;
			}
		}
		if (isValid) {
			System.out.printf("\"%s\" is a binary string", inStr);
		} else {
			System.out.printf("\"%s\" is NOT a binary string", inStr);
		}
	}
}