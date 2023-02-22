package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Student constructor
        Student student1 = new Student("Mia");
        Student student2 = new Student("Arri");

        // .getName();
        System.out.println(student1.getName());
        System.out.println(student2.getName());

        // .addGrade();
        student1.addGrade(70);
        student1.addGrade(50);
        student2.addGrade(90);
        student2.addGrade(100);

        // .getGradeAverage();
        System.out.println(student1.getGradeAverage());
        System.out.println(student2.getGradeAverage());


    }
}
