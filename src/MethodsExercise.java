import java.util.Scanner;
import java.util.Random;


public class MethodsExercise {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = scanner.nextInt();
        System.out.print("Enter a number:");
        int y = scanner.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        ///////////////////////////////

        between();
        factorial();
        dice();

        //////////////////////////////

    }
    public static void between () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 & 10: ");
        int min = 1;
        int max = 10;
        int n = scanner.nextInt();
        if (n >= min && n <= max) {
            System.out.println("You're number is between 1 & 10");
        } else {
            System.out.println("You're number is NOT between 1 & 10, try again");
            between();
        }

    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and get it's factorial :) ");
        long n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
             result *= i;
        }
        n = result;
        System.out.println(n);
    }

    public static void dice() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the amount of sides for dice 1 ");
        int dice1 = scanner.nextInt();
        System.out.print("Enter the amount of sides for dice 2 ");
        int dice2 = scanner.nextInt();
        scanner.nextLine();
        int randomInt1 = rand.nextInt(dice1) + 1;
        int randomInt2 = rand.nextInt(dice2) + 1;
        System.out.println("Dice 1 rolled " + randomInt1);
        System.out.println("Dice 2 rolled " + randomInt2);
        System.out.println("Would you like to roll again? y/n");
        String input = scanner.nextLine();  // Read the user's input

        if (input.equalsIgnoreCase("y")) {
            dice();
        } else if (input.equalsIgnoreCase("n")) {  // Check if the input is "n" (ignoring case)
        } else {
            System.out.println("Type y or n please!");
        }
    }


}


