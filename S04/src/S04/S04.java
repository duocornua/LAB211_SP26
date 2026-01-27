package S04;

/**
 * S04 - Binary Search algorithm.
 *
 * @author HaoVKCE200157
 */
public class S04 {

    /**
     * The main method.
     *
     * Get user input, initialize the algorithm and execute operations.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Enter the number of elements in array
            int n = MyLib.getPositiveInteger(
                    "Enter number of array: \n",
                    "Number of elements must be a positive integer."
            );

            //Allocate the heap memory for generating random elements in array 
            BinarySearch app = new BinarySearch(n);

            //Sort the array
            app.sort();

            //Enter the search value
            int searchValue = MyLib.getPositiveInteger("Enter search value: \n",
                    "The search value must be a positive integer.");

            //Display the sorted array
            System.out.println("Sorted array: " + app);

            // Perform search
            app.search(searchValue);

            // Print result
            app.printSearchResult(searchValue);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
