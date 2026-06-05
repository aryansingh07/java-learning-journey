/**
 * To find factorial of a number
 *
 * @param n Input Integer
 * @return factorial of the input integer
 *
 * Edge Cases:
 * - factorial(0) --> 1
 * - factorial(-1) -> IllegalArgumentException
 *
 * Assumption: method follows problem's specific constraints (0 <= n <= 12)
 *
 * Note:
 * Uses int return type.
 * Valid only while factorial result fits inside int.
 *
 * Time Complexity: O (n)
 * Space Complexity: O (1)
 */

package methods.NumberBased;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0)  throw new IllegalArgumentException("Negative Numbers don't have factorial.");
        if (n == 0)   return 1;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= n;
        }
        return factorial;
    }
}
