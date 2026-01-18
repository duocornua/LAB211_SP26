package S04;

/**
 * S04 - Binary Search algorithm.
 *
 * @author HaoVKCE200157
 */
public class S04 {

    /**
     * The main method Get user input, initialize the algorithm and execute
     * operations.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int n = MyLib.getPositiveInteger(
                    "Enter number of array: \n",
                    "Number of elements must be a positive integer."
            );

            int searchValue = MyLib.getPositiveInteger("Enter search value: \n",
                    "The search value must be a positive integer.");

            BinarySearch app = new BinarySearch(n, searchValue);
            //Sort the array
            app.sort();
            //Display the sorted array
            System.out.println("Sorted array: " + app);
            //Display the search result
            app.searchResult();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
