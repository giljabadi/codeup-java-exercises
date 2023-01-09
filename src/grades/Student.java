package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student() {
        grades = new ArrayList<>();

    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double size = grades.size();
        System.out.println(size);
        double sum = 0;
        for (double i=0; i<size; i++) {
            sum+=i;
        }
        System.out.println(sum);
        return sum/size;
    }

}
