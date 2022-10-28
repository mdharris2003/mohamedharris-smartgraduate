package javapartialbook;
import java.util.Scanner;
public class WordGuess {
	public static void main(String[] args) {
		final String secretword = args[0];
		final int SECRET_WORD_LEN = secretword.length();
		boolean[] correctCharGuessed = new boolean[SECRET_WORD_LEN];
		Scanner in = new Scanner(System.in);
		int attempts = 1;
		String guess = "";
		boolean isCorrectGuess = false;
		do {
			System.out.println("Key in one character or your guess word: ");
			guess = in.next();
			if (guess.length() == 1) {
				System.out.print("Trial " + attempts + ": ");
				for (int ch = 0; ch < SECRET_WORD_LEN; ch++) {
					if (secretword.charAt(ch) == guess.charAt(0)) {
						correctCharGuessed[ch] = true;
					}
				}
				for (int ch = 0; ch < SECRET_WORD_LEN; ch++) {
					if (correctCharGuessed[ch]) {
						System.out.print(secretword.charAt(ch));
					} else {
						System.out.print("_");
					}
				}
			} else if (guess.equals(secretword)) {
				break;
			}
			attempts++;
			System.out.println();
		} while (true);
		System.out.println("Congratulations!!");
		System.out.println("You got it in " + attempts + " trials");
	}
}