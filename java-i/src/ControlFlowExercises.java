import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        // Exercise A
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i++ + " ");
//        }
//
//        // Exercise B
//        i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i < 100);
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i != -10);
//
//        long l = 2;
//        do {
//            System.out.println(l);
//            l *= l;
//        } while (l < 1000000);
//
        // Exercise C
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i <= 1000000; i*=i) {
//            System.out.println(i);
//        }

//        // Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//        // Display a table of powers
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = sc.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("-------|---------|-------");
//        for (int i = 1; i <= userInput; i++) {
//            System.out.format(" %-6d| %-8d| %-6d%n", i, (i*i), (i*i*i));
//        }

        // Convert given number grades into letter grades.
        System.out.print("Give me a grade (0-100): ");
        int grade = sc.nextInt();
        while (grade < 0 || grade > 100) {
            System.out.print("Try Again: ");
            grade = sc.nextInt();
        }

        if (grade >= 97) {
            System.out.println("A+");
        } else if (grade >= 92) {
            System.out.println("A");
        } else if (grade >= 90) {
            System.out.println("A-");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
