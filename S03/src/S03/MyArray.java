package S03;

/**
 * S03 - Insertion sort algorithm.
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
     * Sorts the array in ascending order using the Insertion Sort algorithm.
     *
     * Insertion Sort works by dividing the array into a sorted part and an
     * unsorted part. The algorithm takes one element from the unsorted part and
     * inserts it into its correct position in the sorted part by shifting
     * larger elements one position to the right.
     *
     */
    public void sort() {
        int n = a.length;

        // Traverse from the second element to the end of the array
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // Shift elements of the sorted portion that are greater than key
            // to one position ahead to make space for insertion
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            // Insert the key element into its correct position
            a[j + 1] = key;
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
