package javapartialbook;
import java.util.Scanner;
public class TestPalindromicWord {
	public static void main(String[] args) {
		String inStr;
		boolean isPalindrome = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		inStr = in.next();
		int fIdx = 0, bIdx = inStr.length() - 1;
		while (fIdx < bIdx) {
			if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
				isPalindrome = false;
			}
			fIdx++;
			bIdx--;
		}
		if (isPalindrome) {
			System.out.println(inStr + " is a palinedrome");
		} else {
			System.out.println(inStr + " is not a palinedrome");
		}
	}
}