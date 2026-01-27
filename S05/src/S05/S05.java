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
     * and then performs word and character counting.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = MyLib.getAlphabetString(
                "Enter your content:\n",
                "Input cannnot be empty."
        );
        //Allocate heap memory for algorithm
        Count counter = new Count(input);
        
        // Count and print words
        counter.countWords();
        counter.printWordCount();

        // Count and print characters
        counter.countCharacters();
        counter.printCharacterCount();

    }

}
