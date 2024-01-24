package Students_05;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //"{first name} {second name}: {grade}"
        return String.format("%s %s: %.2f", firstName, lastName, grade);
    }
}
