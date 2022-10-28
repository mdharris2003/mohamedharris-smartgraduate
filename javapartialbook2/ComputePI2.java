package javapartialbook;
public class ComputePI2 {
public static void main(String[] args) {
double sum = 0.0;
int MAX_TERM = 1000;
for (int term = 1; term <= MAX_TERM; term++) {
if (term % 2 == 1) {
sum += 1.0 / (term * 2 - 1);
} else {
		sum -= 1.0 / (term * 2 - 1);
		}
}
System.out.println("The sum is: " + sum);
System.out.println("The sum in percents of Math.PI: " + ((sum / Math.PI) * 100) + "%");
	}
}