package puzzles;

//Time Complexity : O(N), Space Complexity: O(1)
/**
 * Created by ronim_000 on 7/28/2019.
 */
public class FibonacciWithMemoization {
    private int[] memo = new int[1000];

    public static void main(String[] args) {
        FibonacciWithMemoization fibonacci = new FibonacciWithMemoization();
        for (int i = 1; i < 50; i++) {
            System.out.println(fibonacci.fib(i));
        }

    }

    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed.");
        }
         else if (n == 0 || n == 1) {
            memo[n] =n;
        } else if (memo[n] == 0) {
            memo[n] = fib(n - 1) + fib(n - 2);
        }
        return memo[n];
    }
}
