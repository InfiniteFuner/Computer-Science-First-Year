public class GreatestDevisor {
	public static int greatestCommonDivisor(int a, int b) {
		int i = Math.min(a, b);
		while (i > 1) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
			i--;
		}
		return 1;
	}
	public static void main(String[] args) {
		int f = 12;
		int g = 18;
		System.out.println(greatestCommonDivisor(f, g));
	}
}