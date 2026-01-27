package S06;


/**
 * S06 - Fibonacci sequence program.
 *
 * @author HaoVKCE200157
 */
public class S06 {

    /**
     * Main method of the program.
     *
     * Use recursion method to find 45 sequence Fibonacci and display to screen.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        try {
            //Allocate heap memory for algorithm
            Fibonacci fib = new Fibonacci(45);

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}
