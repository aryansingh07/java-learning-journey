/**
 * Reverse the order of given Integer
 *
 * @param number Input Integer
 * @return reverse order of the integer
 *
 * Edge cases:
 * - reverseDigits(0) ----> 0
 * - reverseDigits(5) ----> 5
 * - reverseDigits(1000) -> 1
 * - reverseDigits(-123) -> -321
 *
 * Assumption: Input lies within (-10^6 to 10^6) problem constraint
 *
 * Future Improvement:  Handle integer OverFlow while reversing
 *                      Increase input acceptance outside problem constraint (personal use)
 *
 * Time Complexity: O ( d ) -----------> d is number of digits in the number
 * Space Complexity: O (1)
 */

package methods.NumberBased;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        if (number == 0)    return 0;
        int sign = number < 0 ? -1 : 1;
        long originalNumber = Math.abs( (int) number);
        long reverseDigit = 0;
        while (originalNumber > 0) {
            long lastDigit = originalNumber % 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
            originalNumber /= 10;
        }
        return sign * (int) reverseDigit ;
    }
}
