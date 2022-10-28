package javapartialbook;
public class CozaLozaWoza {
	public static void main(String[]args) {
	final int LOWERBOUND = 1, UPPERBOUND = 110; 
	for (int num = LOWERBOUND; num <= UPPERBOUND; ++num) {
		if (num % 3 == 0) {
			System.out.print("Coza");
		} 
		if (num % 5 == 0) {
			System.out.print("Loza");
		}
		if (num % 7 == 0) {
			System.out.print("Woza");
		}
		if ((num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0)) {
			System.out.print(num);
		}
		if (num % 11 == 0) {
			System.out.println();
		} else {
			System.out.print(" ");
		}
	}
}
}