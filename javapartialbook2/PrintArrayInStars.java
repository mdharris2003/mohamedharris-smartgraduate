package javapartialbook;
import java.util.Scanner;
public class PrintArrayInStars {
	public static void main(String[] args) {
		final int NUM_ITEMS;
		int[] items;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		NUM_ITEMS = in.nextInt();

		items = new int[NUM_ITEMS];

		if (items.length > 0) {
			System.out.print("Enter the value of all items (seperated by spaces): ");

			for (int i = 0; i < items.length; i++) {
				items[i] = in.nextInt();
			}
		}

		for (int idx = 0; idx < items.length; idx++) {
			System.out.print(idx + ": ");
			for (int starNo = 1; starNo <= items[idx]; starNo++) {
				System.out.print("*");
			}
			System.out.println("(" + items[idx] + ")");
		}
	}
}
