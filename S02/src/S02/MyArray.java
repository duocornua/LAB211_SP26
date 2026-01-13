package S02;

/**
 * S02 - Selection sort algorithm.
 *
 * @author HaoVKCE200157
 */
public class MyArray {

    private int[] a;

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
     * Sorts the array in ascending order using the Selection Sort algorithm.
     *
     * The algorithm works by dividing the array into two parts: a sorted part
     * at the beginning and an unsorted part at the end. For each position, the
     * method searches for the smallest element in the remaining unsorted
     * portion of the array and swaps it with the element at position.
     */
    public void sort() {
        // Loop through each position of the array except the last one
        for (int i = 0; i <= a.length - 2; i++) {
            // Compare the current element with the remaining elements
            for (int j = i + 1; j < a.length; j++) {
                // If a smaller element is found, swap it with the current element
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
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
