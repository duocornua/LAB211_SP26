package S01;

/**
 * S01 - Bubble sort algorithm.
 *
 * @author HaoVKCE200157
 */
public class MyArray {

    int[] a;

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
     * @throws Exception if n is negative integer, throws exception
     */
    public MyArray(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("Number of elements must be a positive integer.");
        } else {
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = randomNumber(0, n);
            }
        }
    }

    /**
     * Sorts the array in ascending order using the Bubble Sort algorithm.
     *
     * Bubble Sort works by repeatedly comparing adjacent elements in the array
     * and swapping them if they are in the wrong order. After each pass, the
     * largest unsorted element is moved to its correct position at the end of
     * the array.
     */
    public void sort() {
        int n = a.length;
        boolean swapped;
        // Outer loop controls the number of passes through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements up to the last unsorted position
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if they are in reversed order
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    // Mark that a swap has occurred in this pass
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
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
