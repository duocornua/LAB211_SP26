package S04;

import java.util.Arrays;

/**
 * S04 - Binary Search algorithm.
 *
 * @author HaoVKCE200157
 */
public class BinarySearch {

    private int[] a;
    private int searchValue;

    /**
     * Gets random number from lower to upper
     *
     * @param lower Lower range
     * @param upper Upper range, upper must be greater than lower range
     * @return Return random integer from lower to upper.
     */
    public int randomNumber(int lower, int upper) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }

    /**
     * The constructor
     *
     * @param n The number of elements
     * @param searchValue The value that need to be searched
     * @throws Exception if n is negative integer, throws exception
     */
    public BinarySearch(int n, int searchValue) {
        this.searchValue = searchValue;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = randomNumber(0, n);
        }
    }

    /**
     * Sorts the array in ascending order.
     */
    public void sort() {
        Arrays.sort(a);
    }

    /**
     * Searches for a given value in a sorted array using the binary search
     * algorithm.
     *
     * @param searchValue the value to be searched for
     * @return the index of the searched value if found; -1 if the value does
     * not exist in the array
     */
    public int search(int searchValue) {

        // Initialize the left boundary of the search range
        int left = 0;

        // Initialize the right boundary of the search range
        int right = a.length - 1;

        // Continue searching while the search range is valid
        while (left <= right) {

            // Calculate the middle index to divide the array
            int middle = left + (right - left) / 2;

            // Check if the middle element is the searched value
            if (a[middle] == searchValue) {
                return middle;
            }

            // If the searched value is smaller, continue searching in the left half
            if (searchValue < a[middle]) {
                right = middle - 1;
            } // Otherwise, continue searching in the right half
            else {
                left = middle + 1;
            }
        }

        // Return -1 if the searched value is not found
        return -1;
    }

    /**
     * Displays the result of the binary search.
     */
    public void searchResult() {
        int index = search(searchValue);

        if (index == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Found " + searchValue + " at index: " + index);
        }
    }

    /**
     * ToString method, return the array in format '[x, y, z, ...]'
     *
     * @return The string format of array
     */
    @Override
    public String toString() {
        String str = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            str += ", " + a[i];
        }
        return str += "]";
    }
}
