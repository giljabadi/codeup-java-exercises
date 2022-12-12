import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s.", pi);


        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int intInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + intInput + "\" <--");
//
//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("You entered: --> %s <-- %n You entered: --> %s <-- %n You entered: --> %s <--  %n", userInput1, userInput2, userInput3);
//
//        System.out.print("Enter a sentence: ");
//        String userInput4 = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput4 + "\" <--");

        System.out.print("Enter class width: ");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter class length: ");
        float length = Float.parseFloat(scanner.nextLine());
        float area = width*length;
        float perimeter = (width*2) + (length*2);
        System.out.printf("Classroom Area: --> %s <-- %n Classroom Perimeter: --> %s <--", area, perimeter );

        scanner.useDelimiter("\n");

    }
}
