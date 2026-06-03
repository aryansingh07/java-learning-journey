package numbers;
public class Count_Number {

    static int count(int n) {
        if (n == 0) return 1;

        n = Math.abs(n);

        int count = 0;

        while ( n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}