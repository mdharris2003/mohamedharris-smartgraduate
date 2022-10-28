package javapartialbook;
import java.util.Scanner;
public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		int upperbound;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		upperbound = in.nextInt();
		int perfectPrimeFactorCount = 0;
		for (int i = 1; i <= upperbound; i++) {
			if (isProductOfPrimeFactors(i)) {
				System.out.print(i + " ");
				perfectPrimeFactorCount++;
			}
		}
		double perfectPrimeFactorPercent = ((double)perfectPrimeFactorCount / upperbound) * 100;
		System.out.printf("\n %d numbers found (%.2f)", perfectPrimeFactorCount, perfectPrimeFactorPercent);
	}
	public static boolean isProductOfPrimeFactors(int n) {
		int product = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) && n % i == 0) {
				product *= i;
			}
		}
		if (n == product) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
}