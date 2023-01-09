import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String getRandomElement(String[] array) {
        // Create a random number generator
        Random random = new Random();

        // Generate a random index between 0 and the length of the array
        int index = random.nextInt(array.length);

        // Return the element at the random index
        return array[index];
    }

    public static void main(String[] args) {

            String[] adjectives = {"happy", "sad", "excited", "tired", "angry", "bored", "hungry", "thirsty", "energetic", "lazy"};
            String[] nouns = {"dog", "cat", "car", "house", "tree", "book", "phone", "computer", "television", "desk"};
            String randomAdjective = ServerNameGenerator.getRandomElement(adjectives);
            String adjective = getRandomElement(adjectives);
            String noun = getRandomElement(nouns);

        String name = adjective + "-" + noun;
        System.out.println("Your server name is: " + name);

        }
}
