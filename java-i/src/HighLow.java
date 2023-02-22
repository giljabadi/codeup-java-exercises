import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playNewGame = true;
        while (playNewGame) {
            play();
            System.out.print("\nWould you like to play again? (y/n) ");
            playNewGame = sc.nextLine().toLowerCase().startsWith("y");
        }
        System.out.println("\nHey, thanks for playing! :)");
    }

    public static void play(){
        // VARIABLES & SCANNER
        Scanner sc = new Scanner(System.in);
        boolean isGameOver = false;
        int guess,
            guessesCount = 10,
            answer = (int)(Math.random() * 100) + 1;

        // PLAY GAME!
        System.out.println("\nGUESS A RANDOM NUMBER 1-100!");
        do {
            System.out.printf((guessesCount == 1) ? ("%d guess left:   ") : ("%d guesses left: "), guessesCount--);
            guess = sc.nextInt();
            if (guessesCount == 0){
                System.out.printf("HAHA! YOU LOSE!%nThe number was: %d%n", answer);
                isGameOver = true;
            } else if (guess == answer) {
                System.out.printf("%d! YOU GUESSED IT!!!%n", answer);
                isGameOver = true;
            } else {
                System.out.print((guess > answer) ? "(GUESS LOWER)  " : "(GUESS HIGHER) ");
            }
        } while (!isGameOver);
    }
}

