package javapartialbook;
import java.util.Scanner;
public class NumberConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number and radix: ");
		String input = in.next();
		System.out.print("Enter the input radix: ");
		int inRadix = in.nextInt();
		System.out.print("Enter the output radix: ");
		int outRadix = in.nextInt();
		String result = toRadix(input, inRadix, outRadix);
		System.out.println(input + " in radix " + inRadix + " is " + result + " in radix " + outRadix);
	}
	public static String toRadix(String in, int inRadix, int outRadix) {
		String result = "";
		int inStrLen = in.length() - 1;
		char inChar;
		if (outRadix == 10) {
			int resultInt = 0;
			if (inRadix < outRadix) {
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.charAt(ch);
					resultInt += Character.getNumericValue(inChar) * (int)Math.pow(inRadix, inStrLen - ch);
				}
			} else {
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.toUpperCase().charAt(ch);
					if (inChar >= '0' && inChar <= '9') {
						resultInt += Character.getNumericValue(inChar) * (int)Math.pow(inRadix, inStrLen - ch);
					} else {
						resultInt += (inChar - 55) * (int)Math.pow(inRadix, inStrLen - ch);
					}
				}
			}
			result = Integer.toString(resultInt);
		} 
		else if (outRadix == 2) {
			if (inRadix == 16) {
				String[] HEX_BITS = {
					"0000", "0001", "0010", "0011",
					"0100", "0101", "0110", "0111",
					"1000", "1001", "1010", "1011",
					"1100", "1101", "1110", "1111"
				};
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.toUpperCase().charAt(ch);
					if (inChar >= 'A' && inChar <= 'F') {
						result += HEX_BITS[inChar - 55];
					} else {
						result += HEX_BITS[Character.getNumericValue(inChar)];
					}
					result += " ";
				}
			} else if (inRadix == 8) {
				String[] OCT_BITS = {
					"000", "001", "010", "011",
					"100", "101", "110", "111"
				};
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.toUpperCase().charAt(ch);
					result += OCT_BITS[Character.getNumericValue(inChar)];
					result += " ";
				}
			} else {
				int num = Integer.parseInt(in);
				while (num > 0) {
					result += Integer.toString(num % 2);
					num /= 2;
				}
			}
		}
		else if (outRadix == 8) {
			int resultInt = 0;
			if (inRadix == 10) {
				resultInt = Integer.parseInt(in);
			} else if (inRadix == 2) {
				resultInt = 0;
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.charAt(ch);
					resultInt += Character.getNumericValue(inChar) * (int)Math.pow(inRadix, inStrLen - ch);
				}		
			} else if (inRadix == 16) {
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.toUpperCase().charAt(ch);
					if (inChar >= '0' && inChar <= '9') {
						resultInt += Character.getNumericValue(inChar) * (int)Math.pow(inRadix, inStrLen - ch);
					} else {
						resultInt += (inChar - 55) * (int)Math.pow(inRadix, inStrLen - ch);
					}
				}
			}
			while (resultInt > 0) {
				result = Integer.toString(resultInt % 8) + result;
				resultInt /= 8;
			}
		}
		else if (outRadix == 16) {
			int resultInt = 0;
			int remainder;
			if (inRadix == 2 || inRadix == 8) {
				for (int ch = 0; ch <= inStrLen; ch++) {
					inChar = in.charAt(ch);
					resultInt += Character.getNumericValue(inChar) * (int)Math.pow(inRadix, inStrLen - ch);
				}
			} else {
				resultInt = Integer.parseInt(in);
			}
			while (resultInt != 0) {
				remainder = resultInt % 16;
				if (remainder >= 10) {
					result = (char)(remainder + 55) + result;
				} else {
					result = remainder + result;
				}
				resultInt /= 16;
			}
		}
		return result;
	}
}
