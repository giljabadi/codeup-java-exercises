import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask if the user is ready to start
        System.out.println("Are you ready to start the game? (yes/no)");
        String ready = scanner.nextLine();
        if (!"yes".equalsIgnoreCase(ready)) {
            System.out.println("Okay, bye!");
            return;
        }

        // Ask the user for their name
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to the game, " + name + "!");

        // Set up hero and enemy stats
        int heroHealth = 100;
        int heroAttack = 10;
        int heroPotions = 3;

        int enemyHealth = 50;
        int enemyAttack = 5;

        // Start the game loop
        while (true) {
            // Display hero and enemy stats
            System.out.println(name + ": " + heroHealth + " HP  Potions: " + heroPotions);
            System.out.println("Enemy: " + enemyHealth + " HP");

            // Ask the user for their next action
            System.out.println("What would you like to do?");
            System.out.println("1. Attack");
            System.out.println("2. Drink potion");
            System.out.println("3. Run");
            int action = scanner.nextInt();
            if (action == 1) {
                enemyHealth -= heroAttack;
                System.out.println("You attacked the enemy and deal " + heroAttack + " damage.");
            } else if (action == 2) {
                if (heroPotions > 0) {
                    heroHealth += 20;
                    heroPotions--;
                    System.out.println("You drink a potion and recover 20 HP.");
                } else {
                    System.out.println("You don't have any potions left!");
                }
            } else if (action == 3) {
                System.out.println("You run away from the enemy.");
                break;
            } else {
                System.out.println("Invalid action.");
                continue;
            }

            // Enemy's turn
            heroHealth -= enemyAttack;
            System.out.println("The enemy attacks you and deals " + enemyAttack + " damage.");

            // Check if the game is over
            if (heroHealth <= 0) {
                System.out.println("You have been defeated!");
                break;
            } else if (enemyHealth <= 0) {
                System.out.println("You have defeated the enemy!");
                break;
            }
        }
    }
}
