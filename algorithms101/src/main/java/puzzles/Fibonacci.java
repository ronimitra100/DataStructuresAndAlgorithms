package puzzles;

//Time complexity : O(2^N), Space Complexity: O(N)
/**
 * Created by ronim_000 on 7/28/2019.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 50; i++) {
            System.out.println(fibonacci.fib(i));
        }

    }

    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed.");
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }

    }
}
