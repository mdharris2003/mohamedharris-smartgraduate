package javapartialbook;
import java.util.Scanner;
public class PhoneKeyPadSwitch {
	public static void main(String[] args) {
		String inStr;
		String keypadDigits = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		inStr = in.next().toLowerCase();
		for (int chIndex = 0; chIndex < inStr.length(); chIndex++) {
			char ch = inStr.charAt(chIndex);
			switch(ch) {
				case 'a': case 'b': case 'c':
					keypadDigits += '2';
					break;
				case 'd': case 'e': case 'f':
					keypadDigits += '3';
					break;
				case 'g': case 'h': case 'i':
					keypadDigits += '4';
					break;
				case 'j': case 'k': case 'l':
					keypadDigits += '5';
					break;
				case 'm': case 'n': case 'o':
					keypadDigits += '6';
					break;
				case 'p': case 'q': case 'r': case 's':
					keypadDigits += '7';
					break;
				case 't': case 'u': case 'v':
					keypadDigits += '8';
					break;
				case 'w': case 'x': case 'y': case 'z':
					keypadDigits += '9';
					break;
				default:
					keypadDigits += '0';
			}
		} 
		System.out.println("The sequence is: " + keypadDigits);
	}
}