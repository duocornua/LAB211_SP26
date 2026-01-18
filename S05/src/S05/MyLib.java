package S05;

import java.util.Scanner;

/**
 * S05 - Letter and character count.
 *
 * @author HaoVKCE200157
 */
public class MyLib {

    /**
     * Reads a string that contains only alphabetic characters and spaces.
     *
     * @param prompt message displayed to the user
     * @param errorMessage message displayed when input is invalid
     * @return a valid string containing only letters and spaces
     */
    public static String getAlphabetString(String prompt, String errorMessage) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(prompt);
                String input = sc.nextLine().trim();

                // Reject empty or whitespace-only input
                if (input.isEmpty()) {
                    throw new Exception();
                }

                // Validate each character
                for (char c : input.toCharArray()) {
                    if (!Character.isLetter(c) && c != ' ') {
                        throw new Exception();
                    }
                }

                return input;

            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

}
