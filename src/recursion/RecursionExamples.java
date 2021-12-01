package recursion;

public class RecursionExamples {

    /** Non-recursively (iterative) factorial
     *
     * @param n
     * @return factorial of n
     */
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Recursive factorial
     * @param n
     * @return factorial of n
     */
    public static long factorial(int n) {
        if (n <= 1)
            return 1; // base case

        else
            return n * factorial(n - 1);

    }

    public static long sum(int n) {

        long sum = 0;
        if (n < 0)
            throw new IllegalArgumentException();

        // FILL IN CODE

        return sum;
    }

    /**
     * Recursively computes x to the power of n.
     * @param x
     * @param n
     * @return x to the power of n
     */
    public static double pow(double x, int n) {
        // FILL IN CODE


        return 0;
    }

    /**
     *
     * @param s
     * @return
     */

    public static String reverse(String s) {
        // FILL IN CODe
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }


    public static void main(String[] args) {
        long res = factorial(3);
        System.out.println(res);

    }

}
