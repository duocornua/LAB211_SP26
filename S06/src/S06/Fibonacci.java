package S06;

/**
 * S06 - Fibonacci sequence program.
 *
 * @author HaoVKCE200157
 */
public class Fibonacci {

    /**
     * The constructor
     *
     * @param n the n-th number of Fibonacci sequence
     * @throws Exception when n is lower than 0
     */
    public Fibonacci(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("The sequence number must be a positive integer\n");
        } else {
            displaySequence(n);
        }
    }

    /**
     * Calculates the Fibonacci number at a given position using recursion.
     *
     * @param n position in the Fibonacci sequence
     * @return Fibonacci number at position n
     */
    public long FibonacciCalc(int n) {
        // F(0) = 0
        // F(1) = 1
        // This stop the recursion to prevent StackOverflow
        if (n <= 1) {
            return n;
        }
        // F(n) = F(n-1) + F(n-2), for n > 1
        return FibonacciCalc(n - 1) + FibonacciCalc(n - 2);
    }

    /**
     * Displays the Fibonacci sequence up to the given number of terms.
     *
     * @param count number of Fibonacci terms to display
     */
    public void displaySequence(int count) {
        System.out.println("The 45 sequence fibonacci:");
        for (int i = 0; i < count; i++) {
            System.out.print(FibonacciCalc(i));

            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
