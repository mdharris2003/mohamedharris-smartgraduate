package javapartialbook;
public class Contain {
	public static void main(String[] args) {
		int[] array = {10, 34, 74, 2, 0, 65};
		int key = 1;
		if (contains(array, key)) {
			System.out.println("The array contains " + key);
		} else {
			System.out.println("The array does not contain " + key);
		}
	}
	public static boolean contains(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}

		return false;
	}
}
