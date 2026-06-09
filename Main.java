public class Main {
    public static void main(String[] args){
        Student s1 = new Student ("Masud", 20, 3.00);
        
        s1.displayInfo();
        s1.isStudying();
        s1.takeExam();

        System.out.println("Good job Lad!");
    }
}