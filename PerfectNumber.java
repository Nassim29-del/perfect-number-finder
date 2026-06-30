/**
 * PerfectNumber
 *
 * Business class responsible for determining whether a given integer
 * is a "perfect number" — a positive integer that is equal to the sum
 * of its proper divisors (divisors excluding the number itself).
 *
 * Example: 6 is perfect because 1 + 2 + 3 = 6.
 *
 */
public class PerfectNumber {

    /**
     * Checks whether a number is a perfect number.
     *
     * Pseudocode:
     *   START
     *   IF n <= 1 THEN
     *       RETURN false
     *   END IF
     *
     *   sum = 0
     *   FOR i = 1 TO n - 1
     *       IF isMultipleOf(n, i) THEN
     *           sum = sum + i
     *       END IF
     *   END FOR
     *
     *   RETURN (sum == n)
     *   STOP
     *
     * @param n the number to be tested
     * @return true if n is a perfect number, false otherwise
     */
    public boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (isMultipleOf(n, i)) {
                sum += i;
            }
        }

        return sum == n;
    }

    /**
     * Checks whether "num" is evenly divisible by "base".
     *
     * Pseudocode:
     *   START
     *   IF num MOD base == 0 THEN
     *       RETURN true
     *   ELSE
     *       RETURN false
     *   END IF
     *   STOP
     *
     * @param num  the number being divided
     * @param base the divisor being tested
     * @return true if num is a multiple of base, false otherwise
     */
    public boolean isMultipleOf(int num, int base) {
        return num % base == 0;
    }
}