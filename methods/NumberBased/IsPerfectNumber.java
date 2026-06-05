package methods.NumberBased;

public class IsPerfectNumber {
    static boolean isPerfect(int n) {
        if (n <= 0) throw new IllegalArgumentException("Perfect Number applies only on Positive Integers.");
        int N = n;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n == 0) break;
            if(n % i == 0)  sum += i;
        }
        return sum == N;
    }
}
