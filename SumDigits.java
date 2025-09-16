
// SumDigits.java
// Revised January 2024
// Three methods to return the sum of the digits in a positive integer
public class SumDigits {
// Identify each as generating an iterative or recursive process

	public static int sumDigits1(int n) {
		if (n==0)
			return 0;
		else return n % 10 + sumDigits1(n/10);
	}
	public static int sumDigits2(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
	public static int sumDigits3(int n, int sum) {
		if (n == 0)
			return sum;
		else return sumDigits3(n / 10, sum + n % 10);
	}
	public static void main(String[] args) {
		System.out.println("sumDigits1(12304) is: " + sumDigits1(12304));
		System.out.println("sumDigits2(12304) is: " + sumDigits2(12304));
		System.out.println("sumDigits3(12304) is: " + sumDigits3(12304, 0));
	}
}
