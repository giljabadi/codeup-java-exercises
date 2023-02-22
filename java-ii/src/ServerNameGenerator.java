import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ServerNameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] adjectives = { "Aloof", "Clumsy", "Flying", "Enthusiastic", "Amused", "Adorable", "Wild", "Livid", "Troubled", "Graceful" };
        String[] nouns = { "Coffee", "Grass", "Cow", "Potato", "Lama", "Tornado", "Peach", "Cheese", "Nap", "Honey" };
        System.out.println("======= Name Generator =======\n| [ENTER] to generate        |\n| 'q'+[ENTER] to quit        |\n==============================");
        String userInput;
        do {
            System.out.print(generateName(adjectives, nouns));
            userInput = sc.nextLine();
        } while(Objects.equals(userInput, ""));
    }

    public static String generateName(String[] adj, String[] noun) {
        int i = (int) (Math.random()* 10);
        int j = (int) (Math.random()* 10);
        return adj[i] + " " + noun[j];
    }
}
