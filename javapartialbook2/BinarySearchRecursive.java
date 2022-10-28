package javapartialbook;
public class BinarySearchRecursive {
	public static void main(String[] args) {
		int[] array = {10, 23, 45, 66, 68, 78, 87, 89, 91, 100};

		System.out.println(binarySearch(array, 66, 2, 8));
		System.out.println(binarySearch(array, 10, 2, 8));
		System.out.println(binarySearch(array, 10, 0, 8));

		System.out.println(binarySearch(array, 87));
		System.out.println(binarySearch(array, 99));

	}

	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (fromIdx == toIdx - 1) {
			if (key == array[fromIdx])
				return true;
			return false;
		}

		int middleIdx = (fromIdx + toIdx) / 2;

		if (key == array[middleIdx]) {
			return true;
		} else if (key > array[middleIdx]) {
			fromIdx = middleIdx;
		} else {
			toIdx = middleIdx;
		}

		return binarySearch(array, key, fromIdx, toIdx);

	}

	public static boolean binarySearch(int[] array, int key) {
		int fromIdx = 0;
		int toIdx = array.length - 1;

		return binarySearch(array, key, fromIdx, toIdx);
	}
}