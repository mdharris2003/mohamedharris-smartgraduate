package javapartialbook;
import java.util.Scanner;
public class CountVowelsDigits {
	public static void main(String[] args) {
		String inStr;
		int inStrLen, digits = 0, vowels = 0;
		double digitsPercent, vowelsPercent;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string :");
		inStr = in.next().toLowerCase();
		inStrLen = inStr.length();
		for (int chIndex = 0; chIndex < inStrLen; chIndex++) {
			char ch = inStr.charAt(chIndex);
			if (Character.isDigit(ch)) {
				++digits; 
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			}
		}
		digitsPercent =  ((double)digits / inStrLen) * 100;
		vowelsPercent =  ((double)vowels / inStrLen) * 100;
		System.out.printf("Number of vowels: %d (%.2f)\n", vowels, vowelsPercent);
		System.out.printf("Number of digits: %d (%.2f)", digits, digitsPercent);
	}
}