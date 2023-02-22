import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        // Exercise 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease input a number: ");
        int nextInt = scanner.nextInt();
        System.out.println("You entered the number: " + nextInt);

        // Exercise 2
        System.out.print("\nEnter three words: ");
        String word1 = scanner.next(),
                word2 = scanner.next(),
                word3 = scanner.next();
        System.out.format("Word1: %s\nWord 2: %s\nWord 3: %s\n", word1, word2, word3);

        // Exercise 3 & 4
        scanner.nextLine();
        System.out.print("\nGimme a Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Here's the sentence: " + sentence);

        // Exercise 5
        System.out.print("\nGive me a length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Give me a width: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.format("Area: %d\nPerimeter: %d", length * width, length * 2 + width * 2);

        // Exercise 6
        // scanner.useDelimiter("\n");
    }
}