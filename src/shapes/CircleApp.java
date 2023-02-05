package shapes;

import utils.Input;

import java.util.Scanner;


public class CircleApp {

    public static void main(String[] args) {
        double userRadius;
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        boolean userContinue = true;

        while (userContinue){
            userRadius = input.getDouble("Enter circle radius: ");
            Circle myCircle = new Circle(userRadius);
            System.out.printf("Your circle circumference is: %.2f", myCircle.getCircumference());
            System.out.printf("\nYour circle area is: %.2f", myCircle.area());
            userContinue = input.yesNo("\nWould you like to continue?(y/n): ");
        }

    }
}