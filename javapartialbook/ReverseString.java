package javapartialbook;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		String reverseStr = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		inStr = in.next();
		inStrLen = inStr.length();
		for (int charIndex = inStrLen - 1; charIndex >= 0; charIndex--) {
			reverseStr += inStr.charAt(charIndex);
		} 
		System.out.println("The reverse of " + inStr + " is " + reverseStr);
	}
}