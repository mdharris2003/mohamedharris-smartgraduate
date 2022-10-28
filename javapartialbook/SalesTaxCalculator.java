package javapartialbook;
import java.util.Scanner;
public class SalesTaxCalculator {
	public static void main(String[] args) {
		final double SALES_TAX_RATE = 0.07;
		final int SENTINEL = -1;
		Scanner in = new Scanner(System.in);
		double price, actualPrice, salesTax;
		double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
		System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		price = in.nextDouble();
		while (price != SENTINEL) {
			actualPrice = price / (1 + SALES_TAX_RATE);
			salesTax = price - actualPrice;
			totalPrice += price;
			totalActualPrice += actualPrice;
			totalSalesTax += salesTax;
			System.out.printf("Actual price is: $%.2f, Sales Tax is $%.2f\n\n", actualPrice, salesTax);
			System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
			price = in.nextDouble();
		}
		System.out.printf("Total price is: $%.2f\n", totalPrice);
		System.out.printf("Total actual price is $%.2f\n", totalActualPrice);
		System.out.printf("Total sales tax is: $%.2f", totalSalesTax);
	}
}