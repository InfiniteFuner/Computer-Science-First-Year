public class NewTest {
    public static int getLength(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3, 4, 5};
        int length = getLength(g);
        System.out.println(length);
    }
}