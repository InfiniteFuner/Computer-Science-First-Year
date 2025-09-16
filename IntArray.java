public class IntArray {

	public static int[] clone(int[] orig) {

		int[] copy = new int[orig.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = orig[i];
		}
		return copy;
	}

	public static void arrayPrint(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(" index: " + i + " Value is: " + x[i]);
		}
	}

	public static void copy(int[] first, int[] second) {

		int len = Math.min(first.length, second.length);
		for (int i = 0; i < len; i++) {
			second[i] = first[i];
		}
	}

	public static boolean equal(Object one, Object two) {
		// Note: arrays are passed as Objects, so equal() needs to verify that
		// the arguments are int[]. Might it be better to make
		// the parameters int[] and have the compiler do the verification at
		// compile time (similar to copy() and clone() above?
		// We will cover this more later in the course.
		boolean ident = true;
		if (! (one instanceof int[] && two instanceof int[])) {
			return false;
		}
		int[] a = (int[]) one;
		int[] b = (int[]) two;
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length && ident; i++) {
			if (a[i] != b[i]) {
				ident = false;
			}
		}
		return ident;
	}

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};
		int b[] = a; // points to above array to begin
		int c[] = {1, 3, 5, 7, 9, 11, 13, 15};

		a[1] = 1000;

		System.out.println();
		System.out.println("Arrays a, b, c to start");
		System.out.println("\nArray a:");
		IntArray.arrayPrint(a);
		System.out.println("\nArray b:");
		IntArray.arrayPrint(b);
		System.out.println("\nArray c:");
		IntArray.arrayPrint(c);
		System.out.println();

		System.out.println("a equal a: " + equal(a, a));
		System.out.println("a equal b: " + equal(a, b));
		System.out.println("a equal c: " + equal(a, c));
		System.out.println("b equal c: " + equal(b, c));
		System.out.println();

		System.out.println("Arrays a, b, c after copy(a, c)");
		copy(a, c);
		System.out.println("\nArray a:");
		IntArray.arrayPrint(a);
		System.out.println("\nArray b:");
		IntArray.arrayPrint(b);
		System.out.println("\nArray c:");
		IntArray.arrayPrint(c);
		System.out.println();
		System.out.println("a equal a: " + equal(a, a));
		System.out.println("a equal b: " + equal(a, b));
		System.out.println("a equal c: " + equal(a, c));
		System.out.println("b equal c: " + equal(b, c));
		System.out.println();

		System.out.println("Arrays a, b, c after b = clone(c)");
		b = clone(c); // be now gets new space
		System.out.println("\nArray a:");
		IntArray.arrayPrint(a);
		System.out.println("\nArray b:");
		IntArray.arrayPrint(b);
		System.out.println("\nArray c:");
		IntArray.arrayPrint(c);
		System.out.println();

		System.out.println("a equal a: " + equal(a, a));
		System.out.println("a equal b: " + equal(a, b));
		System.out.println("a equal c: " + equal(a, c));
		System.out.println("b equal c: " + equal(b, c));

	}

}