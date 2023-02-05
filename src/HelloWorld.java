import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//
//        System.out.println("Hello World!!!!!");
//
//        int myFavoriteNumber = 10;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "Anthony";
//        System.out.println(myString);
//
//        long myNumber= 123L;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;

//
//        System.out.printf("");
//
//        String greeting = "Salutations";
////        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, "Anthony");
//
        /************Scanner Class***************/
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        int userInt = scanner.nextInt();
        System.out.printf("%d",userInt);

        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("%s\n%s\n%s\n%s", userInput1, userInput2, userInput3);

        System.out.printf("Enter your full name: ");
        String userString = scanner.nextLine();
        System.out.printf("Your name: %s", userString);

        System.out.printf("Enter classroom length: ");
        int length = scanner.nextInt();
        System.out.printf("Enter classroom width: ");
        int width = scanner.nextInt();

        System.out.printf(
                "The classroom area is: %d\nThe classroom perimeter is: %d"
                , length*width, (length*2)+(width*2));


    }
}
