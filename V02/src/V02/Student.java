package V02;

/**
 * V02 - Student Management Program.
 *
 * Student class represents a student entity.
 *
 * @author HaoVKCE200157
 */
public class Student {

    private String name;
    private String classes;
    private double maths;
    private double chemistry;
    private double physics;
    private double average;
    private String type;

    /**
     * Constructs a Student object with basic information and marks.
     *
     * @param name student's full name
     * @param classes student's class code
     * @param maths mathematics score
     * @param chemistry chemistry score
     * @param physics physics score
     */
    public Student(String name, String classes,
            double maths, double chemistry, double physics) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public double getMaths() {
        return maths;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public double getAverage() {
        return average;
    }

    public String getType() {
        return type;
    }
    
    //ko dc set Avg và set Type vì read only
}
