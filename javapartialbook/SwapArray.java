package javapartialbook;
public class SwapArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {12, 23, 34, 45, 56};
		if (swap(array1, array2)) {
			System.out.println("Arrays have been successfully swapped..");
		} else {
			System.out.println("Arrays could not be swapped..");
		}
	}
	public static boolean swap(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		int temp;
		for (int i = 0; i < array1.length; i++) {
			temp = array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}
		printArray(array1);
		printArray(array2);
		return true;
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