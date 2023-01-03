import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask Bob something: ");
        String question = scanner.nextLine();

        if (question.endsWith("?")) {
            System.out.println("Sure.");
        } else if (question.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (question.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
