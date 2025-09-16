public class Rational {
	public int numerator;
	public int denominator;
	public Rational(int up, int down) {
		numerator = up;
		denominator = down;
	}
	public static void main(String[] args) {
		Rational r1 = new Rational(2, 3);
		Rational r2 = new Rational(2, 3);
		r1 = r2;
		System.out.println(r1==r2);
	}
}
