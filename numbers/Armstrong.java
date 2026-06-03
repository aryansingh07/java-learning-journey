package numbers;

public class Armstrong {
    static boolean arm(int n ) {
        int cnt = 0;
        int original = n;
        int sum = 0;

        while (n > 0) {
            cnt++;
            n /=10;
        }
        n = original;
        while ( n > 0) {
            int rem = n % 10;
            sum += (int)Math.pow(rem, cnt);
            n /= 10;
        }
        return (sum == original);
    }
}
