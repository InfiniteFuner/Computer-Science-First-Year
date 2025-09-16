public class ComplexNumber {
	
	private double realPart;
	private double imagPart;

	public ComplexNumber(double realP, double imagP) {
		realPart = realP;
		imagPart = imagP;
	}

	public void setRealPart(double val) {
		realPart = val;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setImagPart(double val) {
		imagPart = val;
	}

	public double getImagPart() {
		return imagPart;
	}

	//operators

	//2 specialities
/*
this is an alternative way of doing setImagPart.
public void setImagPart(double imagPart) {
	this.imagPart = imagPart;
}
*/
	public ComplexNumber addComplex(ComplexNumber anotherComplexNumber) {
		return new ComplexNumber(realPart + anotherComplexNumber.getRealPart, imagPart + anotherComplexNumber.getImagPart);
	}

	public String toString() {

		return realPart + " " + imagPart + "i";
	}

	public boolean equals(Object anotherObject) {
		ComplexNumber anotherComplexNumber;
		if (anotherObject instanceof ComplexNumber) {
			anotherComplexNumber = (ComplexNumber) anotherObject;
		if (realPart == anotherComplexNumber.getRealPart() &&
			imagPart == anotherComplexNumber.getImagPart())
			return true;
		}
		return false;
	}

	public static void Main(String[] args) {

		ComplexNumber c = new ComplexNumber(3.1, 8.4);

		System.out.println("c is: " + c);
		System.out.println("The real part of c is: " + c.getRealPart());
		System.out.println("c added to c is: " + c.addComplex(c));
	}
}