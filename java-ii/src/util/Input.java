package util;
import java.util.Scanner;

public final class Input {

    // Variables/Fields
    private static final Scanner scanner = new Scanner(System.in);


    // Methods
    public static String getString(String... prompt){
        if (prompt.length > 0) { System.out.print("Gimme a string: "); }
        return scanner.nextLine();
    }

    public static boolean yesNo(String... prompt){
        if (prompt.length > 0) { System.out.print("Want a boolean? (y/n): "); }
        return (scanner.nextLine().toLowerCase().startsWith("y"));
    }

    public static int getInt(int min, int max, String... prompt) {
        int userInput;
        try {
            if (prompt.length > 0) { System.out.print("Gimme an integer between " + min + " and " + max + ": "); }
            userInput = getInt();
            if (userInput > max || userInput < min) { throw new NotInRangeException(); }
            return userInput;
        } catch (NotInRangeException e) {
            System.out.println("That wasn't in range...");
            return (prompt.length > 0)? getInt(min, max, "prompt") : getInt(min, max);
        }
    }

    public static int getInt(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme an integer: "); }
        try{
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a number...");
            return getInt("prompt");
        }
    }

    public static double getDouble(double min, double max, String... prompt) {
        double userInput;
        try {
            if (prompt.length > 0) { System.out.print("Gimme a double between " + min + " and " + max + ": "); }
            userInput = getDouble();
            if (userInput > max || userInput < min) { throw new NotInRangeException(); }
            return userInput;
        } catch (NotInRangeException e) {
            System.out.println("That wasn't in range...");
            return (prompt.length > 0)? getDouble(min, max, "prompt") : getDouble(min, max);
        }
    }

    public static double getDouble(String... prompt) {
        if (prompt.length > 0) { System.out.print("Gimme a double: "); }
        try{
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a number...");
            return getDouble("prompt");
        }
    }

    public static void clear() {
        scanner.nextLine();
    }

    // Custom Exception
    static class NotInRangeException extends Exception {}
}
