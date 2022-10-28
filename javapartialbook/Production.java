package javapartialbook;
public class Production {
	public static void main(String[] args) {
		int product = 1;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 10;
		for (int num = LOWERBOUND; num <= UPPERBOUND; num++) {
			product *= num;
		}
		System.out.println("The Product is: " + product);
		// 1-10=3628800
		// 1-12=479001600
		// 1-13=1932053504-Wrong
		// 1-14=1278945280-Wrong
	}
}