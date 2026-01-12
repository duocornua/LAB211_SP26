
package S01;

/**
 * S01 - Bubble sort algorithm.
 *
 * @author HaoVKCE200157
 */
public class S01 {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int n = MyLib.getPositiveInteger("Enter number of array: \n",
                    "Number of elements must be a positive integer.");

            MyArray app = new MyArray(n);
            System.out.println("Unsorted array: " + app);
            app.sort();
            System.out.println("Sorted array: " + app);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
