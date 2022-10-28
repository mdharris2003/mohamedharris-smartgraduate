package javapartialbook;
public class GCDRecursive {
	public static void main(String[] args) {
		System.out.println(gcd(8, 20));
		System.out.println(gcd(12, 0));
		System.out.println(gcd(0, 34));
		System.out.println(gcd(32, 54));
		System.out.print(gcd(33, 37));
	}
	public static int gcd (int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}