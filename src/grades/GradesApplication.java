package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();

        Student anthony = new Student("Anthony");
        Student julian = new Student("Julian");
        Student amida = new Student("Amida");
        Student mia = new Student("Mia");

        anthony.addGrade(89);
        anthony.addGrade(98);
        anthony.addGrade(70);

        julian.addGrade(99);
        julian.addGrade(98);
        julian.addGrade(88);

        amida.addGrade(75);
        amida.addGrade(98);
        amida.addGrade(100);

        mia.addGrade(87);
        mia.addGrade(78);
        mia.addGrade(80);

        students.put("onepunch", anthony);
        students.put("cppWarrior", julian);
        students.put("cssGod", amida);
        students.put("hackerGoddess", mia);

        welcomeMenu(students);

    }

    public static void welcomeMenu(HashMap<String,Student> userAccounts){
        String userInput;
        String userContinue = "y";
        String[] usernames = new String[5];
        Scanner scanner = new Scanner(System.in);

        while(userContinue.equalsIgnoreCase("y")){
            System.out.println("Welcome\n" +
                    "Here are the Github usernames of our students:\n");

            for (String name: userAccounts.keySet()){
                System.out.printf("|%s| ",name);
            }

            System.out.println("\nWhat student would you like to see more information on?\n>");
            userInput = scanner.nextLine();
//        scanner.next();

            if(!userAccounts.containsKey(userInput)){
                System.out.printf("Sorry, no student found with the GitHub username of %s.",userInput);
            }else{
                getUserData(userInput, userAccounts);
            }

            System.out.println("\nWould you like to see another student?(y/n)");
            userContinue = scanner.nextLine();
        }

        System.out.println("\nGoodbye, and have a wonderful day!");

    }

    public static void getUserData(String user, HashMap<String,Student> student){
        String userName = "";
        String studentName = student.get(user).getName();
        ArrayList<Integer> grades = student.get(user).getGrades();
        double studentAverage = student.get(user).getGradeAverage();

        for(String name: student.keySet()){
            if(name.equals(user)){
                userName = name;
            }
        }

        System.out.printf("\nName: %s - GitHub Username: %s\n" +
                "Current Average: %.1f\n"+
                "Grades: ",studentName,userName,studentAverage);
        grades.forEach(g -> System.out.printf("%d  ", g));
    }
}