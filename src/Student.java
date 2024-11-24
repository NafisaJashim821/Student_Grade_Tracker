
public class Student {
    private String studentName;


    private String studentId;//id

    public Student(String studentName, String studentId) {


        this.studentName = studentName;

        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }
}

