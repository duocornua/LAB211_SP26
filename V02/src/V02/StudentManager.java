package V02;

import java.util.HashMap;
import java.util.List;

/**
 * V02 - Student Management Program.
 *
 * StudentManager handles student calculation and classification.
 *
 * @author HaoVKCE200157
 */
public class StudentManager {

    /**
     * Creates and returns a student object from the provided input data.
     *
     * @param name the full name of the student
     * @param classes the class code of the student
     * @param maths the Maths score of the student
     * @param chemistry the Chemistry score of the student
     * @param physics the Physics score of the student
     * @return a Student object initialized with the given data
     */
    public static Student createStudent(String name, String classes,
            double maths, double chemistry, double physics) {
        // Create a new Student object using the provided parameters
        // and return it to the caller
        return new Student(name, classes, maths, chemistry, physics);
    }

    /**
     * Calculate average score and classify students.
     *
     * @param students the list of students whose averages and types need to be
     * calculated
     * @return the same list of students after updating average scores and
     * classification types
     */
    public static List<Student> averageStudent(List<Student> students) {
        // Iterate through each student in the list
        for (Student st : students) {

            // Calculate the average score from three subjects
            double avg = (st.getMaths()
                    + st.getChemistry()
                    + st.getPhysics()) / 3;
            // Store the calculated average score in the student object
            st.setAverage(avg);

            // Determine the student's classification type 
            // based on the calculated average score
            if (avg > 7.5) {
                st.setType("A");
            } else if (avg >= 6) {
                st.setType("B");
            } else if (avg >= 4) {
                st.setType("C");
            } else {
                st.setType("D");
            }
        }
        return students;
    }

    /**
     * Calculate percentage of student types.
     *
     * @param students the list of students whose classification percentages
     * need to be calculated
     * @return a HashMap containing the percentage of students for each
     * classification type
     */
    public static HashMap<String, Double> getPercentTypeStudent(
            List<Student> students) {
        // Create a map to store student type and its count/percentage
        HashMap<String, Double> map = new HashMap<>();
        // Initialize each classification type with count 0
        map.put("A", 0.0);
        map.put("B", 0.0);
        map.put("C", 0.0);
        map.put("D", 0.0);

        // Count how many students belong to each type
        for (Student st : students) {
            map.put(st.getType(), map.get(st.getType()) + 1);
        }
        // Get the total number of students
        int total = students.size();

        // Convert the count of each type into a percentage
        for (String key : map.keySet()) {
            map.put(key, map.get(key) * 100 / total);
        }

        return map;
    }
}
