package javapartialbook;
class SumAverageRunningIntWhile {
	public static void main(String[] args) {
		
		int sum = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
		}
		average = (double)sum / UPPERBOUND;
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
	}
}