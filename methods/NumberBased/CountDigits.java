/**
 * Count the number of digits in an integer
 *
 * @param number Input Integer
 * @return number of digits
 *
 * Edge Cases:
 * - countDigits(0) -----------------> 1
 * - countDigits(-123) --------------> 3
 * - countDigits(Integer.MIN_VALUE) -> 10
 * Time Complexity: O ( d ) ---------> d is number of digits in input number
 * Space Complexity: O(1)
 */

package methods.NumberBased;

public class CountDigits {
    public static int countDigits(int number ) {

        if(number == 0)   return 1;

        int count = 0;
        long N = Math.abs((long) number);

        while (N > 0) {
            count++;
            N /= 10;
        }
        return count;
    }
}
