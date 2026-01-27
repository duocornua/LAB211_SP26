package V02;

import java.util.Scanner;

/**
 * V02 - Student Management Program.
 *
 * MyLib provides utility methods for validated user input.
 *
 * @author HaoVKCE200157
 */
public class MyLib {

    /**
     * Shared Scanner object used to read input from standard input.
     */
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Reads a non-empty string from the user.
     *
     * @param message the prompt message displayed to the user
     * @return a non-empty string entered by the user
     */
    public static String getString(String message) {
        while (true) {
            // Display prompt message
            System.out.print(message);
            // Read input and remove leading/trailing spaces
            String input = sc.nextLine().trim();
            // Check if input is not empty
            if (!input.isEmpty()) {
                return input;
            }
            // Display error message if input is empty
            System.out.println("Input cannot be empty.");
        }
    }

    /**
     * Reads and validates a student's full name.
     *
     * Validation rules:
     *
     * -The name must not be empty The name can contain only.
     *
     * -letters and spaces The name must contain at least two words.
     *
     * -The first character of each word must be an uppercase letter.
     *
     * Example: Nguyen Van A.
     *
     * @param message the prompt message displayed to the user
     * @return a valid student name that satisfies all conditions
     */
    public static String getName(String message) {
        while (true) {
            // Display prompt message
            System.out.print(message);
            // Read input and remove leading/trailing spaces
            String input = sc.nextLine().trim();

            // Check if the name is empty
            if (input.isEmpty()) {
                System.out.println("Name cannot be empty.");
                continue;
            }

            // Ensure the name contains only letters and spaces
            if (!input.matches("[A-Za-z ]+")) {
                System.out.println("Name cannot contain numbers or special characters.");
                continue;
            }

            // Split the name into individual words
            String[] words = input.split("\\s+");
            boolean valid = true;

            // Ensure the name contains at least two words
            if (words.length < 2) {
                System.out.println("Name must contain at least two words.");
                continue;
            }

            // Check that each word starts with an uppercase letter
            for (String word : words) {
                if (!Character.isUpperCase(word.charAt(0))) {
                    valid = false;
                    break;
                }
            }
            // Display error if capitalization rule is violated
            if (!valid) {
                System.out.println("Each word must start with an uppercase letter.");
                continue;
            }

            return input;
        }
    }

    /**
     * Reads and validates a class code.
     *
     * The class code must follow the format:
     *
     * -Exactly two uppercase letters.
     *
     * -Followed by one or two digits.
     *
     * Examples: FU1, FU12.
     *
     * @param message the prompt message displayed to the user
     * @return a valid class code
     */
    public static String getClasses(String message) {
        while (true) {
            // Display prompt message
            System.out.print(message);
            // Read input and remove leading/trailing spaces
            String input = sc.nextLine().trim();

            // Check if input is empty
            if (input.isEmpty()) {
                System.out.println("Classes cannot be empty.");
                continue;
            }

            // Validate format: 2 uppercase letters + 1 or 2 digits
            if (!input.matches("^[A-Z]{2}[0-9]{1,2}$")) {
                System.out.println("Classes must follow format AA0 or AA00 (e.g. FU1, FU12)");
                continue;
            }

            return input;
        }
    }

    /**
     * Reads and validates a subject mark.
     *
     * The mark must be a numeric value between 0 and 10.
     *
     * @param subject the subject name used in prompts and error messages
     * @return a valid mark between 0 and 10
     */
    public static double getMark(String subject) {

        // Remove ':' from subject for error messages
        String subjectName = subject.replace(":", "");

        while (true) {
            try {
                // Display subject prompt
                System.out.print(subject);
                // Read input and remove leading/trailing spaces
                String input = sc.nextLine().trim();

                // Convert input string to double
                double mark = Double.parseDouble(input);

                // Validate that mark does not exceed maximum value
                if (mark > 10) {
                    System.out.println(subjectName + " must be less or equal than ten.");
                } // Validate that mark is not negative
                else if (mark < 0) {
                    System.out.println(subjectName + " must be greater or equal than zero.");
                } // Valid mark
                else {
                    return mark;
                }

            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println(subjectName + " must be a digit.");
            }
        }
    }

}
