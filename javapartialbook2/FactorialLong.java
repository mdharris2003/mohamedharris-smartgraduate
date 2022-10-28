package javapartialbook;
public class FactorialLong {
	public static void main(String[] args) {
		long i = 1;
		long fact = 1;
		while (Long.MAX_VALUE / fact >= (i + 1)) {
			fact = factorial(i);
			System.out.println("The factorial of " + i + " is " + fact);
			++i;
		}
		System.out.println("The factorial of " + i + " is out of range");
	}
	public static long factorial (long n) {
		if (n < 2) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}