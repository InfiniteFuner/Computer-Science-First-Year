public class Complex {
	
	public static void main(String[] args) {

		double realPart1 = 2.5;
		double imagPart1 = 1.7;

		double realPart2 = 1.0;
		double imagPart2 = 3.0;

		double realSum;
		double imagSum;

		realSum = realPart1 + realPart2;
		imagSum = imagPart1 + imagPart2;

		System.out.println(realPart1 + " + " + imagPart1 + "i" + " + " + realPart2 + " + " + imagPart2 + "i" + " = " + realSum + " + " + imagSum + "i");
	}
}