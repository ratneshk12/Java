public class StackHeight {
    public static int calculateHeight(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calculateHeight(x, n-1);
        int xPownm2 = x * xPownm1;
        return xPownm2;
    }
    public static void main(String[] args) {
        int x = 5, n = 2;
        int ans = calculateHeight(x, n);
        System.out.println(ans);
    }
}
