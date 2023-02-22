import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Exercise 1
        System.out.println("Exercise 1: Basic Arithmetic");

        System.out.print("Give me two numbers to add: ");
        System.out.println(addition(sc.nextInt(), sc.nextInt()));

        System.out.print("Give me two numbers to subtract: ");
        System.out.println(subtraction(sc.nextInt(), sc.nextInt()));

        System.out.print("Give me two numbers to multiply: ");
        System.out.println(multiplication(sc.nextInt(), sc.nextInt()));

        System.out.print("Give me two numbers to divide: ");
        try {
            System.out.println(division(sc.nextInt(), sc.nextInt()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Give me two numbers to modulus: ");
        System.out.println(modulus(sc.nextInt(), sc.nextInt()));


        // Exercise 2
        System.out.println("\nExercise 2: Validate user input");
        System.out.print("Enter a number between 1-10: ");
        System.out.printf("Valid user input: %d%n", validateInput(1, 10, sc.nextInt()));


        // Exercise 3
        System.out.println("\nExercise 3: Calculate Factorial");
        System.out.print("Enter a number between 1-10: ");
        System.out.printf("Factorial: %d%n", factorial(sc.nextInt()));


        // Exercise 4
        System.out.println("\nExercise 4: Roll Die");
        System.out.print("How many sides are on the dice? ");
        rollDie(sc.nextInt());
    }


    // Exercise 1
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int division(int num1, int num2) throws Exception{
        if (num2 == 0) {
            throw new Exception("You cannot divide by zero.");
        }
        return num1 / num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    // Exercise 2
    public static int validateInput(int min, int max, int userInput){
        if (userInput < min || userInput > max) {
            System.out.printf("Please enter a number BETWEEN %d and %d: ", min, max);
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            userInput = validateInput(min, max, userInput);
        }
        return userInput;
    }


    // Exercise 3
    public static long factorial(int factor){
        int n = validateInput(1, 10, factor);
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    // Exercise 4
    public static void rollDie(int sides){
        int dieCount = 2;
        for (int i = 1; i <= dieCount; i++){
            System.out.printf("Rolling Die %d... %d%n", i, ((int)(Math.random() * sides) + 1));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Wanna roll again? (y/n) ");
        String userRollsAgain = sc.nextLine().toLowerCase();
        if (userRollsAgain.startsWith("y")) { rollDie(sides); }
    }
}
