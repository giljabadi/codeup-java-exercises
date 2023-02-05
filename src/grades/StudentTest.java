package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student anthony = new Student("Anthony");

        anthony.addGrade(89);
        anthony.addGrade(98);
        anthony.addGrade(70);

        System.out.println(anthony.getGradeAverage());
    }

}