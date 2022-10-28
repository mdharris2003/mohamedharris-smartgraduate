package javapartialbook;
import java.util.Scanner;
public class Tribonacci {
	public static void main(String[] args) {
		int n = 3;
		int tn;
		int tnMinus1 = 2;
		int tnMinus2 = 1;
		int tnMinus3 = 1;
		int nMax = 20;
		int sum = tnMinus1 + tnMinus2 + tnMinus3;
		double average;
		System.out.println("The first " + nMax + " Tribonacci numbers are: ");
		System.out.print(tnMinus3 + " " + tnMinus2 + " " + tnMinus1 + " ");
		while (n <= nMax) {
			tn = tnMinus3 + tnMinus2 + tnMinus1;
			System.out.print(tn + " ");
			sum += tn;
			++n;
			tnMinus3 = tnMinus2;
			tnMinus2 = tnMinus1;
			tnMinus1 = tn;
		}
		average = (double)sum / nMax;
		System.out.println("\nThe average is: " + average); 
	}
}