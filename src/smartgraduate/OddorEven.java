package smartgraduate;
import java.util.Scanner;
public class OddorEven{
	public static void main(String[]args) {
		int num;
		System.out.println("enter the integer number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("enter number is even");
		else
			System.out.println("enter number is odd");
	}
}
