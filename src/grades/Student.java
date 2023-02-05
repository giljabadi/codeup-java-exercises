package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //Constructor
    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;

        for(double g: grades){
            sum += g;
        }

        return sum/grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}