import java.util.Locale;
import java.util.Scanner;

public class StringLecture {
        public static void main(String[] args) {
                // STRINGS ARE IMMUTABLE!
                String helloMsg = "Hello, how's it going?";
                System.out.println(helloMsg);

                System.out.println(helloMsg.concat(" Are you busy?"));

                // Redefining Strings
                String myName = "Mia";
                myName = myName.concat(" Evans");
                System.out.println(myName);

                // Comparing Strings
                Scanner sc = new Scanner(System.in);
                System.out.println("Continue? [y/n] ");
                String userInput = sc.next();
                // boolean confirm = userInput == "y";
                // boolean confirm = userInput.equals("y");
                boolean confirm = userInput.equalsIgnoreCase("y");
                System.out.println(confirm);

                // Chaining Methods: Pass undefined variables into predefined variable methods!
                String input = "yes";
                System.out.println("Continue? [yes/no]");
                String userInput2 = sc.next();
                System.out.println(input.startsWith(userInput2.toLowerCase()));

                // String manipulation
                String manipulation = "String to manipulate.";
                System.out.println(manipulation.charAt(4));
                System.out.println(manipulation.indexOf("n"));
                System.out.println(manipulation.lastIndexOf("n"));
                System.out.println(manipulation.length());
                System.out.println(manipulation.replace("manipulate", "change"));
                System.out.println(manipulation.substring(10, 20));
                System.out.println(manipulation.toLowerCase());
                System.out.println(manipulation.toUpperCase());
                System.out.println(manipulation.replace("manipulate", "yeah yeah yeah".toUpperCase()));
                System.out.println(manipulation.trim());
        }
}
