package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getString();
        yesNo();
        getInt(1, 10);
        getInt();
        getDouble(1, 10);
        getDouble();
    }
    public static String getString () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (input instanceof String) {
            System.out.println("Well done.");
        } else {
            System.out.println("Error: input is not a string, try again");
            getString();
        }
        return input;
    }
    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yes or no: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            System.out.println("Well done.");
        } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
            System.out.println("Okay then... try again.");
            yesNo();
        } else {
            System.out.println("Okay then... try again.");
            yesNo();
        }
        return true;
    }
    public static int getInt(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 10: ");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            System.out.println("Well done.");
        } else {
            System.out.println("Okay then... try again.");
            getInt(1, 10);
        }
        return input;
    }
    public static int getInt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, or else... : ");
        int input = scanner.nextInt();
        if (input % 1 == 0) {
            System.out.println("Well done.");
        } else {
            System.out.println("Okay then... try again.");
            getInt();
        }
        return input;
    }

    public static double getDouble(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 10: ");
        double input = scanner.nextDouble();
        if (input >= min && input <= max) {
            System.out.println("Well done.");
        } else {
            System.out.println("Okay then... try again.");
            getDouble(1, 10);
        }
        return input;
    }
    public static double getDouble() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, or else... : ");
        double input = scanner.nextInt();
        if (input % 1 == 0) {
            System.out.println("Well done.");
        } else {
            System.out.println("Okay then... try again.");
            getDouble();
        }
        return input;
    }
    public static double Radius () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius for your circle");
        double input = scanner.nextDouble();
        return input;
    }


}
