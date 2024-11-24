
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your username: ");

        String username = sc.nextLine();

        System.out.print("Enter your password: ");

        String password = sc.nextLine();


        if (!authenticate(username, password))
        {
            System.out.println("Authentication failed. Exiting...");

            return;
        }


        System.out.print("Enter student name: ");

        String studentName = sc.nextLine();



        System.out.print("Enter student ID: ");


        String studentId = sc.nextLine();


        List<Course> courses = new ArrayList<>();



        FileHandler fileHandler = new FileHandler("D:\\Grade Tracker\\gpa.txt");

        while (true) {
            System.out.println("\nChoose an option:");

            System.out.println("1. Calculate GPA");

            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();


            sc.nextLine();

            switch (choice) {

                case 1:

                    GradeTracker gt = new GradeTracker();


                    System.out.print("How many courses do you want to enter? ");
                    int numCourses = sc.nextInt();
                    sc.nextLine();

                    if (numCourses <= 0) {
                        System.out.println("Please enter a valid number of courses.");
                    } else {
                        for (int i = 0; i < numCourses; i++) {

                            Course newCourse = Course.inputCourseData(sc);

                            courses.add(newCourse);


                            gt.addCourse(newCourse);
                        }

                        double newGpa = gt.calculateGPA();
                        System.out.println("GPA: " + newGpa);

                        fileHandler.saveGPAToFile(newGpa, studentName, studentId);
                    }
                    break;

                case 2:

                    System.out.println("Goodbye!");


                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }


    private  static boolean authenticate(String username, String password) {
        return username.equals("user") && password.equals("password"); //user
    }
}


