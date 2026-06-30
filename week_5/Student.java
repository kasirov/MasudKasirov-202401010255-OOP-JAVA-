public class Student {
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    public void setStudentId(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentId() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getProgramme() {
        return programme;
    }
}