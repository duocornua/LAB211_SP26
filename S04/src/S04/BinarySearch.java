package S04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * S04 - Binary Search algorithm.
 *
 * @author HaoVKCE200157
 */
public class BinarySearch {

    private int[] a;
    private List<Integer> result;

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
     *
     */
    public BinarySearch(int n) {
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
     * Searches for all occurrences of a given value in the sorted array.
     *
     * This method uses binary search to locate one occurrence of the value,
     * then expands to the left and right to find all matching indices.
     *
     * @param searchValue the value to search for
     */
    public void search(int searchValue) {

        // Initialize result list
        result = new ArrayList<>();

        int left = 0;
        int right = a.length - 1;
        int foundIndex = -1;

        // Binary search to find one occurrence
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (a[middle] == searchValue) {
                foundIndex = middle;
                break;
            }

            if (searchValue < a[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        // If not found, stop here
        if (foundIndex == -1) {
            return;
        }

        // Move left to find first occurrence
        int i = foundIndex;
        while (i >= 0 && a[i] == searchValue) {
            i--;
        }

        // Move right and collect all indices
        i++;
        while (i < a.length && a[i] == searchValue) {
            result.add(i);
            i++;
        }
    }

    /**
     * Prints the result of the binary search.
     *
     * @param searchValue the value that was searched for
     */
    public void printSearchResult(int searchValue) {

        // If result list is empty, value was not found
        if (result == null || result.isEmpty()) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Found " + searchValue + " at index: " + result);
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
