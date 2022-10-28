package javapartialbook;
public class LengthOfRunningNumberSequence {
	public static void main(String[]args) {
		System.out.println(length(1));
		System.out.println(length(2));
		System.out.println(length(9));
		System.out.println(length(10));
		System.out.println(length(11));
		System.out.println(length(12));
	}
	public static int length (int n) {
		if (n == 1) {
			return 1;
		}
		return length(n - 1) + numOfDigits(n);
	}
	public static int numOfDigits (int n) {
		String numStr = Integer.toString(n);
		return numStr.length();
	}
}