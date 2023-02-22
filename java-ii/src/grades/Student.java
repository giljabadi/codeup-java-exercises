package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    // Variables/Fields
    private String name;
    ArrayList<Integer> grades;
    HashMap<String, String> attendance;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // Methods
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double) total/grades.size();
    }
    public void printGrades(){
        System.out.print("Recorded Grades: ");
        for (Integer grade : grades){
            System.out.print(grade + " ");
        }
    }
    public void recordAttendance(String date, String value) {
        this.attendance.put(date, value.toUpperCase());
    }

    public void printAttendance() {
        System.out.print("\nAttendance: " + this.attendance);
    }
}
