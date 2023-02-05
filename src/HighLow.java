
import java.util.Scanner;

public class HighLow {
    //Main Function
    public static void main(String[] args) {
        int compNum = generateRandomNum(100);
        int userNum = guessNumber();

        while(userNum != compNum){
            if(userNum < compNum){
                System.out.printf("HIGHER\n");
            }
            if(userNum > compNum){
                System.out.printf("LOWER\n");
            }
            userNum = guessNumber();
        }

        System.out.printf("GOOD GUESS!!!");

    }

    public static int guessNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1 and 100: ");
        int userInput = scanner.nextInt();

        while (userInput < 1|| userInput > 100){
            System.out.printf("You must enter a number between 1 and 100: ");
            userInput = scanner.nextInt();
            System.out.printf("\n");
        }

//        System.out.printf("You entered %d\n", userInput);
        return userInput;
    }

    public static int generateRandomNum(int num){
        double randNum = (Math.random()*num);
        return (int)randNum+1;
    }
}

