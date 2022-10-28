package javapartialbook;
public class CopyArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		printArray(array1);
		printArray(copyOf(array1));
		printArray(copyOf(array1, 3));
		printArray(copyOf(array1, 10));
	}
	public static int[] copyOf (int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}
	public static int[] copyOf (int[] array, int size) {
		int[] copy = new int[size];
		if (array.length > size) {
			for (int i = 0; i < size; i++) {
				copy[i] = array[i];
			}
		} else {
			for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
			}
		}
		return copy;
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