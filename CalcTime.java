 public class CalcTime {
	 public static int calc1(int n) {
		 int total = 0;
		 int count = 0;
		 for (count = 0; count <= n; count++) {
			 if (count % 2 == 0 && count % 3 == 0) {
				 total = total + count;
			 }
		 }
		 return total;
	 }

	 public static int calc2(int n, int count, int total) {
		 if (count > n)
			 return total;
		 else if (count % 2 == 0 && count % 3 == 0)
			 return calc2(n, count + 1, total + count);
		 else return calc2(n, count + 1, total);
	 }

	 public static int calc3(int n) {
		 if (n == 0)
			 return 0;
		 else if (n % 2 == 0 && n % 3 == 0)
			 return n + calc3(n - 1);
		 else return calc3(n - 1);
	 }
	 public static void main(String[] args) {
		 int j = calc3(6);
		 System.out.println(j);
	 }
 }

 