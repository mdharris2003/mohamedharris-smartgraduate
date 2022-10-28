package javapartialbook;
public class Matrix {
	public static void main(String[] args) {
		int[][] m1 = {
			{1, 3, 4},
			{3, 5, 5},
			{10, 6, 8}
		};
		int[][] m2 = {
			{2, 4, 7},
			{4, 5, 6},
			{1, 2 ,4}
		};
		double[][] d1 = {
			{2.3, 4.34},
			{1.65, 0.43}
		};
		double[][] d2 = {
			{3.145, 0.32},
			{95.432, 43.38}
		};
		System.out.println("Integer Matrix Operations: ");
		System.out.println("Addition: ");
		print(add(m1, m2));
		System.out.println("Subtraction: ");
		print(subtract(m1, m2));
		System.out.println("Multiplication: ");
		print(multiply(m1, m2));
		// Double Matrices Operations
		System.out.println("Double Matrix Operations: ");
		System.out.println("Addition: ");
		print(add(d1, d2));
		System.out.println("Subtraction: ");
		print(subtract(d1, d2));
		System.out.println("Multiplication: ");
		print(multiply(d1, d2));
	}
	public static int[][] multiply (int[][] m1, int[][] m2) {
		int[][] product = new int[m1[0].length][m2.length];
		for (int i = 0; i < m1.length; i++) { // i = 1
			for (int j = 0; j < m1[0].length; j++) { // j = 1
				for (int k = 0; k < m2[0].length; k++) { // k = 1
					product[i][k] += m1[i][j] * m2[j][k];
				}
			}
		}
		return product;
	}
	public static double[][] multiply (double[][] m1, double[][] m2) {
		double[][] product = new double[m1[0].length][m2.length];
		for (int i = 0; i < m1.length; i++) { // i = 1
			for (int j = 0; j < m1[0].length; j++) { // j = 1
				for (int k = 0; k < m2[0].length; k++) { // k = 1
					product[i][k] += m1[i][j] * m2[j][k];
				}
			}
		}
		return product;
	}
	public static int[][] add (int[][] m1, int[][] m2) {
		int[][] sum = new int[m1.length][m1[0].length];
		if (haveSameDimension(m1, m2)) {
			for (int row = 0; row < m1.length; row++) {
				for (int col = 0; col < m1[0].length; col++) {
					sum[row][col] = m1[row][col] + m2[row][col];
				}
			}
		}
		return sum;
	}
	public static double[][] add (double[][] m1, double[][] m2) {
		double[][] sum = new double[m1.length][m1[0].length];
		if (haveSameDimension(m1, m2)) {
			for (int row = 0; row < m1.length; row++) {
				for (int col = 0; col < m1[0].length; col++) {
					sum[row][col] = m1[row][col] + m2[row][col];
				}
			}
		}
		return sum;
	}
	public static int[][] subtract (int[][] m1, int[][] m2) {
		int[][] difference = new int[m1.length][m1[0].length];
		if (haveSameDimension(m1, m2)) {
			for (int row = 0; row < m1.length; row++) {
				for (int col = 0; col < m1[0].length; col++) {
					difference[row][col] = m1[row][col] - m2[row][col];
				}
			}
		}
		return difference;
	}
	public static double[][] subtract (double[][] m1, double[][] m2) {
		double[][] difference = new double[m1.length][m1[0].length];
		if (haveSameDimension(m1, m2)) {
			for (int row = 0; row < m1.length; row++) {
				for (int col = 0; col < m1[0].length; col++) {
					difference[row][col] = m1[row][col] - m2[row][col];
				}
			}
		}
		return difference;
	}
	public static boolean haveSameDimension (int[][] m1, int[][] m2) {
		if (m1.length == m2.length && m1[0].length == m2[0].length) {
			return true;
		}
		return false;
	}
	public static boolean haveSameDimension (double[][] m1, double[][] m2) {
		if (m1.length == m2.length && m1[0].length == m2[0].length) {
			return true;
		}
		return false;
	}
	public static void print(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%4d ", matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void print(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%7.2f ", matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
}