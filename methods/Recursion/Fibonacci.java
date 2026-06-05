package methods.Recursion;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n < 0)  throw new IllegalArgumentException("Provide Whole Numbers.");

        if (n == 0 || n == 1)   return 1;

        return fibonacci(n - 1) + fibonacci(n - 2) ;
    }
}
