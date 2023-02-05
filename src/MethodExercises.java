import java.util.Random;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(addition(3,4));
        System.out.println(subtraction(10,7));
        System.out.println(multiply(3,4));
        System.out.println(division(81,9));
        System.out.println(modulo(42,7));

//        String letter = "y";
//        while (letter.equalsIgnoreCase("y")){
//            int userInput = getInteger(1,10);
//            System.out.printf("Factorial: %d\n", factorial(userInput));
//            System.out.printf("Do want another factorial(y/n)?:");
//            letter = scanner.nextLine();
//        }
        diceGame();


    }

    public static int addition(int num1, int num2){
        return num1+num2;
    }

    public static int subtraction(int num1, int num2){
        return num1-num2;
    }

    public static int multiply(int num1, int num2){
        if(num2 <= 0){
            return 0;
        }
        return num1+multiply(num1,num2-1);
    }

    public static int division(int num1, int num2){
        return num1/num2;
    }

    public static int modulo(int num1, int num2){
        return num1%num2;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();

        while (userInput<min || userInput > max){
            System.out.printf("You must enter a number between %d and %d: ", min, max);
            userInput = scanner.nextInt();
            System.out.printf("\n");
        }

        System.out.printf("You entered %d\n", userInput);
        return userInput;
    }

    public static int factorial(int num){
        if(num <= 0){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void diceGame(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int diceSides;
        int sideOne;
        int sideTwo;
        Random rand = new Random();
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")){
            System.out.printf("Enter the number of sides for a pair of dice:");
            diceSides = scanner.nextInt();
            scanner.nextLine();

//            System.out.printf("Press enter to roll the dice!");
//            scanner.next();
//            System.out.println();

            sideOne = generateRandomNum(diceSides);
            sideTwo = generateRandomNum(diceSides);

            System.out.printf("Dice side one: %d\nDice side two: %d", sideOne, sideTwo);

            System.out.printf("\nDo you want to try again(y/n):");
            userContinue = scanner.nextLine();
        }

    }
    public static int generateRandomNum(int num){
        double randNum = (Math.random()*num);
        return (int)randNum+1;
    }
}