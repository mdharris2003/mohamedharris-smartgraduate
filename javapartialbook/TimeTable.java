package javapartialbook;
import java.util.Scanner;
public class TimeTable {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		size = in.nextInt();
		for (int row = -1; row <= size; row++) {
			for (int col = -1; col <= size; col++) {
				if (row == -1 && col == -1) {
					System.out.printf("%4c", '*');
				} else if (row == 0) {
					System.out.print("----");
				} else if (col == 0) {
					System.out.print(" | ");
				} else if (row == -1) {
					System.out.printf("%4d", col);
				} else if (col == -1) {
					System.out.printf("%4d", row);
				} else {
					System.out.printf("%4d", row * col);
				}
			}
			System.out.println();
		}
	}
}