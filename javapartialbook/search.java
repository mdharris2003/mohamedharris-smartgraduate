package javapartialbook;
public class search {
	public static void main(String[] args) {
		int[] array = {10, 34, 74, 2, 0, 65};
		int key = 0;
		int result = search(array, key);
		if (result == -1) {
			System.out.println("The array does not contain the value " + key);
		} else {
			System.out.println(key + " is found at index " + result);
		}
	}
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}