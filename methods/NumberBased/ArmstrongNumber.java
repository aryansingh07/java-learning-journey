/**
 * Returns whether the integer is Armstrong Number or not
 *
 * @param number Input Integer
 * @return true if armstrong number, otherwise false.
 *
 * Edge Cases:
 * - isArmstrong(0) -----------------> true
 * - isArmstrong(7) -----------------> true
 * - isArmstrong(370) ---------------> true
 * - isArmstrong(Integer.MAX_VALUE) -> false
 *
 * Note:
 * - Armstrong Number is a Number which is equals to sum of each digit raised to power of no. of digits in the number
 *
 * Time Complexity: O ( d ) --> d is number of digits in the number
 * Space Complexity: O (1)
 */

package methods.NumberBased;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        if (number < 0) return false;
        if(number == 0) return true;

        double sum = 0;
        int count = CountDigits.countDigits(number);
        int originalNumber = number;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, count);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
