package javapartialbook;
import java.util.Scanner;
public class Add2integer
{
   public static void main(String[]args) {
	   int number1,number2,sum;
	   Scanner in =new Scanner(System.in);
	   System.out.print("Enter first number:");
	   number1=in.nextInt();
	   System.out.print("Enter second number:");
	   number2=in.nextInt();  
		in.close();
		sum = number1 + number2;
		System.out.println("The sum is: " + sum);
	}
}
