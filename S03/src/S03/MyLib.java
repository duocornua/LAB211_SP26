
package S03;

import java.util.Scanner;

/**
 * S03 - Insertion sort algorithm.
 *
 * @author HaoVKCE200157
 */
public class MyLib {

    static Scanner sc = new Scanner(System.in);
    /**
     * 
     * This method repeatedly displays a message asking the user for input
     * until a valid positive integer is entered. 
     * If the user enters a value that is not a number or a number less than or equal to zero,
     * an error message is displayed and the user is asked to try again.
     * 
     * @param msg the message displayed to prompt the user for input
     * @param errorMsg the message displayed when the user enters invalid input
     * @return a positive integer value entered by the user
     */
    public static int getPositiveInteger(String msg, String errorMsg) {
        int n;

        while (true) {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine()); // nextLine() reads the entire line safely

                if (n > 0) {
                    return n;
                }

                System.out.println(errorMsg);
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }

}
