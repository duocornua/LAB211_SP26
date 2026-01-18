package S05;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

/**
 * S05 - Letter and character count.
 *
 * @author HaoVKCE200157
 */
public class Count {

    /**
     * Stores the input text provided by the user.
     */
    private String content;

    /**
     * Constructs a TextCounter object with the given text.
     *
     * @param content the input string to be analyzed
     */
    public Count(String content) {
        this.content = content;
    }

    /**
     * Counts the number of occurrences of each word in the input text and
     * displays the result.
     *
     * The text is split by one or more spaces. Each word is stored as a key in
     * a map, and its frequency is stored as the corresponding value.
     */
    public void countWords() {

        // Split the content into words using whitespace
        String[] words = content.trim().split("\\s+");

        // Map to store word frequencies
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display the word count result
        System.out.println(wordCount);
    }

    /**
     * Counts the number of occurrences of each letter in the input text and
     * displays the result.
     *
     * Only alphabetic characters are counted. Spaces and non-letter characters
     * are ignored.
     *
     * All letters are converted to lowercase before counting to ensure
     * case-insensitive comparison.
     */
    public void countCharacters() {

        // Map to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Convert the string into a character array
        for (char c : content.toCharArray()) {

            // Count letters
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            } // Count whitespaces
            else if (Character.isWhitespace(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Display the character count result
        System.out.println(charCount);
    }

}
