package S05;

import java.util.LinkedHashMap;
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
    private Map<String, Integer> wordCount;
    private Map<String, Integer> charCount;

    /**
     * Constructs a TextCounter object with the given text.
     *
     * @param content the input string to be analyzed
     */
    public Count(String content) {
        this.content = content;
    }

    /**
     * Counts the number of occurrences of each valid word in the content.
     *
     * A valid word contains only alphabetic characters.
     */
    public void countWords() {

        // Initialize word count map
        wordCount = new LinkedHashMap<>();

        // Split the content into words using whitespace
        String[] words = content.trim().split("\\s+");

        // Count only valid words (letters only)
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
    }

    /**
     * Prints the word count result.
     */
    public void printWordCount() {

        if (wordCount == null || wordCount.isEmpty()) {
            System.out.println("No word found.");
        } else {
            System.out.println(wordCount);
        }
    }

    /**
     * Counts the number of occurrences of each character in the content.
     *
     * All letters are converted to lowercase. All whitespace characters are
     * counted as a single space (" ").
     */
    public void countCharacters() {

        // Initialize character count map
        charCount = new LinkedHashMap<>();

        // Loop through each character in the content
        for (char c : content.toCharArray()) {

            String key;

            // Treat all whitespace characters as a single space
            if (Character.isWhitespace(c)) {
                key = " ";
            } else {
                key = String.valueOf(Character.toLowerCase(c));
            }

            // Update character count
            charCount.put(key, charCount.getOrDefault(key, 0) + 1);
        }
    }

    /**
     * Prints the character count result.
     *
     * Whitespace characters are displayed as ' ' for clarity.
     */
    public void printCharacterCount() {

        if (charCount == null || charCount.isEmpty()) {
            System.out.println("{}");
            return;
        }

        System.out.print("{");
        boolean first = true;

        for (Map.Entry<String, Integer> entry : charCount.entrySet()) {

            if (!first) {
                System.out.print(", ");
            }

            if (entry.getKey().equals(" ")) {
                System.out.print("' '=" + entry.getValue());
            } else {
                System.out.print(entry.getKey() + "=" + entry.getValue());
            }

            first = false;
        }

        System.out.println("}");
    }

}
