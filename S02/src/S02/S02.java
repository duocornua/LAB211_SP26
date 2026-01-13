package S02;

/**
 * S02 - Selection sort algorithm.
 *
 * @author HaoVKCE200157
 */
public class S02 {

    /**
     * The main method Get user input, initialize the algorithm and execute
     * operations.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //try-catch block
        try {
            int n = MyLib.getPositiveInteger("Enter number of array: \n",
                    "Number of elements must be a positive integer.");

            //allocate memory and fill the array with random numbers
            MyArray app = new MyArray(n);
            //Display the unsorted array
            System.out.println("Unsorted array: " + app);
            //Execute the sorting algorithm
            app.sort();
            //Display the sorted array
            System.out.println("Sorted array: " + app);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
