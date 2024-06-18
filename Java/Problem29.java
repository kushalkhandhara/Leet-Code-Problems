public class Problem29 {
    public static int divide(int dividend, int divisor) {
        // Handle the edge case where the result would overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int a = divide(-2147483648, -1);
        System.out.println(a);  // Should print 2147483647
    }
}
