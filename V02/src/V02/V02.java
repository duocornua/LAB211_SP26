package V02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * V02 - Student Management Program.
 *
 * @author HaoVKCE200157
 */
public class V02 {

    public static void main(String[] args) {

        // List to store all input students
        List<Student> students = new ArrayList<>();
        // Stop flag
        boolean stop = false;

        // Loop to input multiple students
        while (true) {

            // Input student information
            String name = MyLib.getName("Name:");
            String classes = MyLib.getClasses("Classes:");
            double maths = MyLib.getMark("Maths:");
            double chemistry = MyLib.getMark("Chemistry:");
            double physics = MyLib.getMark("Physics:");

            // Create student object
            Student st = StudentManager.createStudent(
                    name, classes, maths, chemistry, physics
            );

            // Add student to list
            students.add(st);

            // Ask user whether to continue
            while (true) {
                String choice = MyLib.getString(
                        "Do you want to enter more student information?(Y/N):"
                );

                if (choice.equalsIgnoreCase("Y")) {
                    break; // continue outer loop
                } else if (choice.equalsIgnoreCase("N")) {
                    stop = true; // mark to stop
                    break;
                } else {
                    System.out.println("Please enter Y or N only.");
                }
            }

            // Exit outer loop if user chose N
            if (stop) {
                break;
            }

        }

        // Classify students and calculate average
        students = StudentManager.averageStudent(students);

        // Display student information
        int count = 1;
        for (Student st : students) {
            System.out.println("------ Student" + count + " Info ------");
            System.out.println("Name:" + st.getName());
            System.out.println("Classes:" + st.getClasses());
            System.out.println("AVG:" + st.getAverage());
            System.out.println("Type:" + st.getType());
            count++;
        }

        // Get statistics by student type
        Map<String, Double> percentMap
                = StudentManager.getPercentTypeStudent(students);

        // Display classification statistics
        System.out.println(
                "--------Classification Info -----");
        for (String key
                : percentMap.keySet()) {
            System.out.println(key + ": " + percentMap.get(key) + "%");
        }
    }
}
