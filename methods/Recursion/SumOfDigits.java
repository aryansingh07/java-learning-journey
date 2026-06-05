package methods.Recursion;

public class SumOfDigits {
    static int sumDigits(int n) {
        if (n == 0) return 0;

        int sign = (n < 0) ? -1 : 1;

        return sign * (n + sumDigits(n % 10));
    }
}
