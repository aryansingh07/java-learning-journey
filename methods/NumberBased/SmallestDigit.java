package methods.NumberBased;

public class SmallestDigit {
    static int smallestDigit(int n) {
        if (n == 0) return 0;

        int sign = (n < 0) ? -1 : 1;
        int count = 9;
        while (n > 0) {
            int last = n % 10;

            if (count > last)   count = last;
            n /= 10;
        }
        return count;
    }
}
