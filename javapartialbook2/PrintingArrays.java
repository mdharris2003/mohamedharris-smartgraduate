package javapartialbook;
import java.util.Scanner;
public class PrintingArrays {
	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50};
		float[] floatArray = {2.3f, 4.3f, 60.4f, 12.3f};
		double[] doubleArray = {3.123, 67.432, 98.54, 100.34, 64.223, 8.765};
		print(intArray);
		print(floatArray);
		print(doubleArray);
	}
	public static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
	public static void print(float[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
	public static void print(double[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
}