package javapartialbook;
import java.util.Scanner;
public class TriangularPatternA {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		size = in.nextInt();
		for (int row = 1; row <= size; ++row) {
			for (int col = 1; col <= row; ++col) {
				System.out.print("# ");
			} 
			System.out.println("\n");
		}
	}
}