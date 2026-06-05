/**
 * Tells whether given Integer is Palindrome number or not
 *
 * @param number Input Integer
 * @return true if number is palindrome, otherwise false.
 *
 * Note:
 * - Palindrome numbers are considered only for non-negative integers.
 * - This implementation uses ReverseDigits.reverseDigits().
 *
 * Edge Cases:
 * - isPalindrome(0) -----------------> true
 * - isPalindrome(101) ---------------> true
 * - isPalindrome(123) ---------------> false
 * - isPalindrome(-123) --------------> Exception
 * - isPalindrome(Integer.MAX_VALUE) -> haven't done it
 *
 * Future Improvement:  betterment in integer overflow while reversing
 *                      calling ReverseDigits.reverseDigits(), it only works upto 10^6, which is a problematic.
 *
 * Time Complexity: O ( d) -> digits in input number
 * Space Complexity: O(1)
 */

package methods.NumberBased;

public class PalindromeNumber {
    public static boolean isPalindrome (int number) {
        if (number < 0) {
            throw new ArithmeticException("Palindrome can be found only for positive numbers.");
        }
        if (number == 0) {
            return true;
        }

        int palindromeNumber = ReverseDigits.reverseDigits(number);

        return palindromeNumber == number;
    }
}
