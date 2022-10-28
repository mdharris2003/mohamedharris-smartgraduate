package javapartialbook;
import java.util.Scanner;
public class PhoneKeyPadNested {
	public static void main(String[] args) {
		String inStr;
		String keypadDigits = "";
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a string: ");
		inStr = in.next().toLowerCase();

		for (int chIndex = 0; chIndex < inStr.length(); chIndex++) {
			char ch = inStr.charAt(chIndex);
			if (ch == 'a' || ch == 'b' || ch == 'c') {
				keypadDigits += '2';
			} else if (ch == 'd' || ch == 'e' || ch == 'f') {
				keypadDigits += '3';
			} else if (ch == 'g' || ch == 'h' || ch == 'i') {
				keypadDigits += '4';
			} else if (ch == 'j' || ch == 'k' || ch == 'l') {
				keypadDigits += '5';
			} else if (ch == 'm' || ch == 'n' || ch == 'o') {
				keypadDigits += '6';
			} else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
				keypadDigits += '7';
			} else if (ch == 't' || ch == 'u' || ch == 'v' ) {
				keypadDigits += '8';
			} else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
				keypadDigits += '9';
			} 
		} 

		System.out.println("The sequence is: " + keypadDigits);
	}
}