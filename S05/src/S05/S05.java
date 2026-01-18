package S05;

/**
 * S05 - Letter and character count.
 *
 * @author HaoVKCE200157
 */
public class S05 {

    /**
     * The main method.
     *
     * This method prompts the user to enter a text string, validates the input
     * to ensure it contains only letters and spaces, and then performs word and
     * character counting.
     *
     * @param args
     */
    public static void main(String[] args) {
        String input = MyLib.getAlphabetString(
                "Enter your content:\n",
                "Input must contain letters only and not be empty."
        );

        Count counter = new Count(input);
        //Count words
        counter.countWords();
        //Count characters
        counter.countCharacters();
    }

}
