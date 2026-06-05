package methods.NumberBased;

public class IsHarshadNumber {
    static boolean isHarshad(int n) {
        if (n <= 0) throw new IllegalArgumentException("Harshad Number operates only on Positive Integers.");

        if (n % SumOfDigits.sumDigits(n) == 0)  return true;
        return false;
    }
}
