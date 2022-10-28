package javapartialbook;
import java.util.Scanner;
public class TestPalindromicPhrase {
	public static void main(String[] args) {
		String inStr;
		boolean isPalindrome = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		inStr = in.nextLine();
		int fIdx = 0, bIdx = inStr.length() - 1;
		while (fIdx < bIdx) {
			char fl = inStr.charAt(fIdx);
			char bl = inStr.charAt(bIdx);
			if (!Character.isLetter(fl)) {
				fIdx++;
				continue;
			} else if (!Character.isLetter(bl)) {
				bIdx--;
				continue;
			} else if (fl != bl) {
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