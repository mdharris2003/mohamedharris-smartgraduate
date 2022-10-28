package javapartialbook;
public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));
		System.out.println(factorial(10));
	}
	public static int factorial(int n) {
		if (n < 2) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}