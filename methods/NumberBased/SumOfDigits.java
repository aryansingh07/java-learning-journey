package methods.NumberBased;

public class SumOfDigits {
    static int sumDigits(int number) {
        if (number == 0)  return 0;

        int sign = (number < 0 ) ? -1 : 1;
        int sum = 0;
        int originalNum = Math.abs(number);

        while (number > 0) {
            int last = number % 10;
            sum += last;
            number /= 10;
        }
        return sign * sum;
    }
}
