package methods.Recursion;

public class SumN {
    static int sumN (int n) {
        if (n == 0) return 0;

        int sum = Math.abs(n);
        int sign = (n < 0) ? -1 : 1;

        return sign * (n + sumN(n - 1));
    }
}
