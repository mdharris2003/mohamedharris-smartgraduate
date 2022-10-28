package javapartialbook;
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = {9, 6, 4, 1 ,2, 5, 7};
		System.out.println("Array before Sort: ");
		printArray(array);
		insertionSort(array);
		System.out.println("\nArray after sort: ");
		printArray(array);
	}
	public static void insertionSort (int[] array) {
		int arrayLen = array.length;
		int currentElement;
		int insertPos = 0;
		for (int i = 1; i < arrayLen; i++) {
			currentElement = array[i];
			for (int j = i - 1; j >= 0; j--) {
				if (currentElement < array[j]) {
					array[j + 1] = array[j];
				} else {
					insertPos = j + 1;
					break;
				}
			}
			array[insertPos] = currentElement;
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