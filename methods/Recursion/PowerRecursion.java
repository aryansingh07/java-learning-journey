package methods.Recursion;

public class PowerRecursion {
    static long powerRecursion(int n, int p) {
        if (n == 0 && p < 0)    throw new ArithmeticException("0 can't be raised to negative powers.");
        if (n == 0) return 0;

        if (p == 0) return 1;

        if ( p < 0) return 1 / powerRecursion(n, -p);

        return n * powerRecursion(n, p - 1);
    }
}
