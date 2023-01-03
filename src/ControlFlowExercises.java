import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        int j = 1;
//        do {
//            int squared = j*j;
//            System.out.println(squared);
//            j*=4;
//        } while (j < 1000000);

//        for (int i=5; i<=15; i++) {
//            System.out.println(i);
//        }
//        for (int i=2; i<1000000; i*=4) {
//            int squared = i * i;
//            System.out.println(squared);
//        }
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else
//                System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer.
        System.out.print("What number would you like to go up to? ");
        int maxNumber = scanner.nextInt();

        // Print the table header.
        System.out.println("\nHere is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        // Print the table rows.
        for (int i = 1; i <= maxNumber; i++) {
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%d      | %d       | %d\n", i, squared, cubed);
        }

        // Ask if the user wants to continue.
        System.out.print("\nDo you want to continue? (y/n) ");
        String response = scanner.next();

        // Only continue if the user agrees to.
        if (response.equalsIgnoreCase("y")) {
            main(args);
        }
    }
}
