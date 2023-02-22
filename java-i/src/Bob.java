import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to talk to Bob? [y/n] ");
        boolean wannaTalk = sc.nextLine().toLowerCase().startsWith("y");
        int replies = 0;

        while(wannaTalk) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            // Bob!
            if (userInput.trim().endsWith("?")){
                System.out.println("Bob: Sure.");
            } else if (userInput.trim().endsWith("!")){
                System.out.println("Bob: Woah, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            replies++;

            if (replies % 3 == 0){
                System.out.print("Continue talking? [y/n] ");
                wannaTalk = sc.nextLine().toLowerCase().startsWith("y");
            }
        }
    }
}
