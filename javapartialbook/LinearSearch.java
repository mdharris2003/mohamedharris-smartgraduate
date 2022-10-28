package javapartialbook;
public class LinearSearch {
	public static void main(String[] args) {
		int[] array = {12, 32, 45, 34, 67, 12, 0, 1, 4};
		System.out.println(linearSearch(array, 67));
		System.out.println(linearSearch(array, 43));
		System.out.println(linearSearchIndex(array, 45));
		System.out.println(linearSearchIndex(array, 3));
	}
	public static boolean linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return true;
			}
		}
		return false;
	}
	public static int linearSearchIndex(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}
}