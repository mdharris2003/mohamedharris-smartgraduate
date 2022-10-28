package javapartialbook;
class SumAverageRunningInt2 {
	public static void main(String[] args) {
		int sum = 0;
		double average;

		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		int count = 0;
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sum += number;
			++count;
		}
		average = (double)sum / count;
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
	}
}
