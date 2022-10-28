package javapartialbook;
import java.util.Scanner;
public class SphereComputation {
	public static void main(String[] args) {
		double radius, surfaceArea, volume;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");		
		radius = in.nextDouble();
		in.close();
		surfaceArea = 4 * Math.PI * radius * radius;
		volume = 4.0 / 3 * Math.PI * radius * radius * radius;
		System.out.printf("The surface area is: %.2f\n", surfaceArea);
		System.out.printf("The volume is: %.2f\n", volume);
	}
}