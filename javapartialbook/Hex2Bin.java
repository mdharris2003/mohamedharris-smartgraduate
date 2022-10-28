package javapartialbook;
import java.util.Scanner;
public class Hex2Bin {
	public static void main(String[] args) {
		final String[] HEX_BITS = {
			"0000", "0001", "0010", "0011",
			"0100", "0101", "0110", "0111",
			"1000", "1001", "1010", "1011",
			"1100", "1101", "1110", "1111"
		};
		String inStr, resultBin = "";
		int inStrLen;
		char inChar;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string :");
		inStr = in.next();
		inStrLen = inStr.length();
		for (int chIndex = 0; chIndex < inStrLen; chIndex++) {
			inChar = inStr.toUpperCase().charAt(chIndex);
			if (inChar >= 'A' && inChar <= 'F') {
				resultBin += HEX_BITS[inChar - 55];
			} else {
				resultBin += HEX_BITS[Character.getNumericValue(inChar)];
			}
			resultBin += " ";
		}
		System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s", inStr, resultBin);
	}
}