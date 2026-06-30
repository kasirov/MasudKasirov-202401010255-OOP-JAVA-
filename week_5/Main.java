public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudentId("CU202401010255");
        student.setName("Masud");
        student.setCGPA(3.75);
        student.setProgramme("BCSSE");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("CGPA: " + student.getCGPA());
        System.out.println("Programme: " + student.getProgramme());
    }
}