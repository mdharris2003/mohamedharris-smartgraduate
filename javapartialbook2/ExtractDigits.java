package javapartialbook;
public class ExtractDigits {
	public static void main(String[] args) {
		String reversedDigits = "";
		int n = 15423;
		int digit;
		while (n > 0) {
			digit = n % 10; 
			reversedDigits += digit + " ";
			n /= 10; 			
		} 
		System.out.println("The reversed extracted digits are: " + reversedDigits);
	}
}
