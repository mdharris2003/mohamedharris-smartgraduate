package javapartialbook;
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = {9, 6, 4, 1, 5};	

		System.out.println("Array before Sort: ");
		printArray(array);

		selectionSort(array);

		System.out.println("\nArray after sort: ");
		printArray(array);
	}

	public static void selectionSort(int[] array) {
		int arrayLen = array.length;
		int min, minIndex, temp;
		for (int i = 0; i < arrayLen; i++) {
			min = array[i];
			minIndex = i;
			for (int j = i; j < arrayLen; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			temp = array[i];
			array[i] = min;
			array[minIndex] = temp;
		}
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