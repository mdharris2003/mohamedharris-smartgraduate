package javapartialbook;
import java.util.Scanner;
public class DecipherCeasarCode {
	public static void main(String[] args) {
		String cipheredText, decipheredText = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a ciphertext string: ");
		cipheredText = in.next().toUpperCase();
		for (int chIndex = 0; chIndex < cipheredText.length(); chIndex++) {
			char ch = cipheredText.charAt(chIndex);
			ch = (char)(ch - 3);
			decipheredText += ch;
		}
		System.out.println("The plaintext string is: " + decipheredText);
	}
}
