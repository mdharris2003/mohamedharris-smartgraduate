package javapartialbook;
public class ArrayToString {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(arrayToString(array));
	}
	public static String arrayToString(int[] array) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}
}