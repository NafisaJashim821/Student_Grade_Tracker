
import java.io.*;


public class FileHandler {
    private String filePath; // file path

    public FileHandler(String filePath) {

        this.filePath = filePath;
    }



    public void saveGPAToFile(double gpa, String studentName, String studentId) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Grade Tracker\\gpa.txt", true))) {


            writer.write("Student Name: " + studentName + "\n");

            writer.write("Student ID: " + studentId + "\n");

            writer.write("GPA: " + gpa + "\n\n");


            System.out.println("GPA saved to " + filePath);
        } catch (IOException e) {


            e.printStackTrace();
        }
    }




}
