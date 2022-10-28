package javapartialbook;
class SumOddEvenRunningInt {
	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		for (int num = LOWERBOUND; num <= UPPERBOUND; num++) {
			if (num % 2 == 0) {
				sumEven += num;
			} else {
				sumOdd += num;
			}
		}
		absDiff = (sumOdd > sumEven)? (sumOdd - sumEven) : (sumEven - sumOdd); 
		System.out.println("The sum of odd numbers is: " + sumOdd);
		System.out.println("The sum of even numbers is: " + sumEven);
		System.out.println("The absolute difference is: " + absDiff);
	}
}