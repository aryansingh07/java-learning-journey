package numbers;
public class Reverse_Digits {

    static int reverse(int n) {
        int rev = 0;
        int sign = (n < 0) ? -1 : 1;

        n = Math.abs(n);

        while (n > 0 ) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        return rev * sign;
    }
}
