package javapartialbook;
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {90, 5, 65, 43, 78, 12, 54, 9, 43};
		System.out.println("Array before Sort: ");
		printArray(array);
		bubbleSort(array);
		System.out.println("\nArray after sort: ");
		printArray(array);
	}
	public static void bubbleSort (int[] array) {
		int n = array.length;
		boolean swapped;
		int temp;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (array[i] < array[i - 1]) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n = n - 1;
		} while (swapped);
	}
	public static void printArray(int[] array) {
		System.out.print("The values are: [");
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