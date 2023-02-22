import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = sc.nextInt();
        if (userNum != 5) {
            System.out.println("Man, I wish you'd've said 5.");
        } else {
            System.out.println("Hey, 5 is a heckin' cool number.");
        }

        System.out.print("Order: ");
        String entre = sc.next(),
                side = sc.next();
        // if(entre.equals("nuggets") && side.equals("fries")) {
        //     System.out.println("Alright, completed order!");
        // } else {
        //     System.out.println("You messed something up with my order...");
        // }
        System.out.println((entre.equals("nuggies") && side.equals("fries")) ?
                "Yay! You got my order right!":
                "Awwww, you messed up my order..."
        );

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
