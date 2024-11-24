import java.util.Scanner;

class Course {
    private String courseCode;
    private String courseName;
    private double grade;
    private int credits;

    public Course(String courseCode, String courseName, double grade, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grade = grade;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getGrade() {

        return grade;//grade
    }

    public int getCredits() {

        return credits;
    }

    public static Course inputCourseData(Scanner scanner) {
        System.out.print("Enter course code: ");

        String courseCode = scanner.nextLine();

        System.out.print("Enter course name: ");




        String courseName = scanner.nextLine();

        double grade;
        do {
            System.out.print("Enter grade (2.50 to 4.00): ");

            grade = scanner.nextDouble();

            if (grade < 2.50 || grade > 4.00) {



                System.out.println("Invalid grade. Grade must be between 2.50 and 4.00.");
            }
        } while (grade < 2.50 || grade > 4.00);

        System.out.print("Enter course credits: ");




        int credits = scanner.nextInt();

        scanner.nextLine();

        return new Course(courseCode, courseName, grade, credits);
    }


}

