import java.util.Scanner;

/**
 * TestPerfect
 *
 * Test/driver class for the PerfectNumber business class.
 * Prompts the user for a maximum value (N) and prints every
 * perfect number found below N.
 *
 */
public class TestPerfect {

    /**
     * Pseudocode:
     *   START
     *   PRINT title and student info
     *   PRINT "Enter the maximum value:"
     *   READ maxValue
     *
     *   count = 0
     *   FOR i = 1 TO maxValue - 1
     *       IF PerfectNumber.isPerfect(i) THEN
     *           count = count + 1
     *       END IF
     *   END FOR
     *
     *   CREATE perfect[count]
     *   index = 0
     *   FOR i = 1 TO maxValue - 1
     *       IF PerfectNumber.isPerfect(i) THEN
     *           perfect[index] = i
     *           index = index + 1
     *       END IF
     *   END FOR
     *
     *   IF perfect.length == 0 THEN
     *       PRINT "No perfect number found below", maxValue
     *   ELSE
     *       FOR i = 0 TO perfect.length - 1
     *           PRINT "Perfect[" , i+1 , "] =", perfect[i]
     *       END FOR
     *   END IF
     *   STOP
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printHeader();

        System.out.print("Enter the maximum value to check: ");
        int maxValue = sc.nextInt();

        PerfectNumber perfectNumber = new PerfectNumber();

        // First pass: count how many perfect numbers exist below maxValue
        int count = 0;
        for (int i = 1; i < maxValue; i++) {
            if (perfectNumber.isPerfect(i)) {
                count++;
            }
        }

        // Second pass: store the perfect numbers found
        int[] perfect = new int[count];
        int index = 0;
        for (int i = 1; i < maxValue; i++) {
            if (perfectNumber.isPerfect(i)) {
                perfect[index] = i;
                index++;
            }
        }

        printResults(perfect, maxValue);

        sc.close();
    }

    /**
     * Prints the program title and student information.
     */
    private static void printHeader() {
        System.out.println("==========================================");
        System.out.println("        LAB 1 - PERFECT NUMBERS FINDER   ");
        System.out.println("==========================================");
        System.out.println(" Student : Nasim Bidel");
        System.out.println("==========================================\n");
    }

    /**
     * Prints the list of perfect numbers found, or a message
     * if none were found.
     *
     * @param perfect  array containing the perfect numbers found
     * @param maxValue the upper limit that was checked
     */
    private static void printResults(int[] perfect, int maxValue) {
        System.out.println();
        if (perfect.length == 0) {
            System.out.println("No perfect numbers were found below " + maxValue + ".");
            return;
        }

        System.out.println("Perfect numbers found below " + maxValue + ":");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s | %-10s%n", "Index", "Value");
        System.out.println("------------------------------------------");

        for (int i = 0; i < perfect.length; i++) {
            System.out.printf("%-10d | %-10d%n", (i + 1), perfect[i]);
        }

        System.out.println("------------------------------------------");
        System.out.println("Total perfect numbers found: " + perfect.length);
    }
}