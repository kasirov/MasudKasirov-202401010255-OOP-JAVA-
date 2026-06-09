class Student {
    String name;
    int age;
    double gpa;

    Student(String studentName, int studentAge, double studentgpa){
        name = studentName;
        age = studentAge;
        gpa = studentgpa;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void isStudying(){
        System.out.println(name + " is studying.");
    }

    public void takeExam(){
        System.out.println(name + " is taking an Exam.");
    }
}