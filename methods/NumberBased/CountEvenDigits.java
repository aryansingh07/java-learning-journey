package methods.NumberBased;

public class CountEvenDigits {
    static int countEven (int n) {
        if (n < 0)  throw new IllegalArgumentException("Write Whole Number.");

        int count = 0;

        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0)  count++;
            n /= 10;
        }
        return count;
    }
}
