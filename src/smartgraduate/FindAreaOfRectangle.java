package smartgraduate;
import java.util.Scanner;
public class FindAreaOfRectangle {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the lenght of rectanagle:");
		double length=scanner.nextDouble();
		System.out.println("enter the width of rectangle:");
		double width=scanner.nextDouble();
		double area=length*width;
		System.out.println("area of rectangle is:"+area);
	}
}

