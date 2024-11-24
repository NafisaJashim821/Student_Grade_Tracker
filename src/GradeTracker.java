
import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private List<Course> courses;

    public GradeTracker() {


        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {


        courses.add(course);
    }

    public double calculateGPA() {
        double totalGPA = 0.0;

        int totalCredits = 0;


        for (Course course : courses) {


            totalGPA += course.getGrade() * course.getCredits();


            totalCredits += course.getCredits();
        }

        if (totalCredits == 0) {


            return 0.0; //gradde
        }

        return totalGPA / totalCredits;
    }




}
