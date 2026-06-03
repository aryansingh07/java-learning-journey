package numbers;

public class Palindrome {

    static boolean palin (int n) {
        if(n < 0)   return false;
        int rev = 0;
        int original = n;
        while ( n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        return (original == rev);
    }
}
