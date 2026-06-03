package numbers;

public class TrailingZeros {
    static int zeroFactorial(int n) {
        if(n < 0)   return -1;
        if(n == 0 || n == 1)  return 1;

        int fact = n * (n - 1);
        int cnt = 0;
        while (fact > 0) {
            if(fact % 10 == 0)  cnt++;
            fact /= 10;
        }
        return cnt;
    }
}
