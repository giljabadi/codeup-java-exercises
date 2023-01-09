package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student gil = new Student();
        gil.addGrade(50);
        Student jess = new Student();
        jess.addGrade(100);
        Student sarah = new Student();
        sarah.addGrade(30);

        sarah.getGradeAverage();
    }
}
