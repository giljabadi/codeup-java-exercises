import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        // System.out methods
        String name = "David";
        System.out.print("Hi, I'm " + name + "\n");
        System.out.println("Hi, I'm " + name);
        System.out.format("Hi, I'm %s. I'm %d years old. I'm a %s.%n", name, 25, "Scorpio");

        // System.out with variables
        float percent = 99.99F;
        System.out.format("I'm %f%% sure it takes two %%'s to print a %% in System.out.format()%n", percent);
        System.out.format("I'm %.2f%% sure if you want to fix a decimal you will use %%.<number>f%n", percent);

        // User Input Strings!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input something: ");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        // scanner.next(): dogs -> dogs
        // scanner.next(): i like dongs -> i
        // scanner.nextLine(): i like dogs -> i like dogs

        // User input integers!
        System.out.print("What's your favorite number? ");
        int favoriteNumber = scanner.nextInt();
        System.out.println(favoriteNumber);

        // Lines and scanners!
        scanner.nextLine();
        System.out.println("What's your favorite color?");
        String favColor = scanner.nextLine();
        System.out.println(favColor);
    }
}
