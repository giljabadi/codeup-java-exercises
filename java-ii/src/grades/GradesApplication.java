package grades;
import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        String[] usernames = {"square_pants", "tentacles", "star", "cheeks", };
        String[] names = {"spongebob", "squidward", "patrick", "sandy", };
        Student[] myStudents = new Student[usernames.length];
        for (int i = 0; i < usernames.length; i++){
            myStudents[i] = new Student(names[i]);
            for (int j = 0; j < 3; j++){
                myStudents[i].addGrade((int)(Math.random()*100) + 1);
                myStudents[i].recordAttendance("2022-10-0" + i+1, (Math.random() > 0.5) ? "A":"P");
            }
            students.put(usernames[i], myStudents[i]);
        }

        // Commandline Interface
        System.out.println("Welcome!");
        while(again) {
            promptMenu(students);
            int menuSelect = Input.getInt();
            if (menuSelect == 1){
                printAllGrades(students);
            } else if (menuSelect == 2){
                printClassAverage(students);
            } else if (menuSelect == 3){
                promptUsername();
                printStudent(students, sc.nextLine());
            } else if (menuSelect == 4){
                printCSV(students);
            } else if (menuSelect == 5){
                again = false;
            } else {
                System.out.println("Invalid Option...");
            }
        }
        System.out.println("\nGoodbye, and have a wonderful day!");
    }

    // PROMPTS
    public static void promptMenu(HashMap<String, Student> students){
        System.out.print("\n\nGitHub Usernames: ");
        for ( String key : students.keySet() ) {
            System.out.printf( "|%s| ", key);
        }
        System.out.print("\n\tMenu Options:\n\t1 - List All Grades\n\t2 - Get Class Average\n\t3 - Get Student Info\n\t4 - Print CSV Report\n\t5 - Exit\n\n");
        System.out.print("What would you like to do?\n> ");
    }

    public static void promptUsername(){
        System.out.print("\nWhat student would you like to see more information on?\n> ");
    }

    public static void promptAttendance(HashMap<String, Student> students){
        promptUsername();
        String username = Input.getString();
        if (isAStudent(students, username)){
            String date, value;
            System.out.print("\n[YYYY-DD-MM] Date: ");
            date = Input.getString();
            do {
                System.out.print("\n[A/P] Absent or Present: ");
                value = Input.getString();
            } while(!Objects.equals(value.toLowerCase(), "a") || !Objects.equals(value.toLowerCase(), "p"));
            students.get(username).recordAttendance(date, value);
        }
    }

    // PRINTS / RETURNS
    public static boolean isAStudent(HashMap<String, Student> students, String username){
        if (!students.containsKey(username)) System.out.printf("%nSorry, no student found with the GitHub username of \"%s\".", username);
        return students.containsKey(username);
    }

    public static void printStudent(HashMap<String, Student> students, String username){
        if (isAStudent(students, username)) {
            System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.1f%n", students.get(username).getName(), username, students.get(username).getGradeAverage());
            students.get(username).printGrades();
            students.get(username).printAttendance();
        }
    }

    public static void printAllGrades(HashMap<String, Student> students){
        for (Student student: students.values()){
            System.out.print("\n" + student.getName() + " | ");
            student.printGrades();
        }
    }

    public static void printClassAverage(HashMap<String, Student> students){
        int total = 0;
        for (Student student: students.values()){
            total += student.getGradeAverage();
        }
        System.out.printf("\nClass Average: %d", total/students.size());
    }

    public static void printCSV(HashMap<String, Student> students){
        for (String username: students.keySet()){
            Student student = students.get(username);
            System.out.printf("%n%s, %s, %.1f, ", student.getName(), username, student.getGradeAverage());
            student.printAttendance();
        }
    }
}
