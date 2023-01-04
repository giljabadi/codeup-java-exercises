import java.util.Scanner;
import java.util.Random;
public class HighLow {
    public static void main(String[] args) {
        System.out.println("Game has picked the number! Go ahead and guess: ");
        Random rand = new Random();
        int randomInt1 = rand.nextInt(100) + 1;

        guess(randomInt1);

    }

    public static void guess(int randomInt1) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int userGuess = scanner.nextInt();
        if (userGuess > randomInt1) {
            System.out.println("Lower!");
            counter++;
            guess(randomInt1);

        } else if (userGuess < randomInt1) {
            System.out.println("Higher!");
            counter++;
            guess(randomInt1);

        } else {
            System.out.println("Correct!");
            System.out.println("Took you " + counter + " tries!");
        }
    }

}
