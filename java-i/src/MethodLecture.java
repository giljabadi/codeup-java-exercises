import java.util.Scanner;

public class MethodLecture {
    public static void main(String[] args) {
        System.out.println(add(3, 8));

        Scanner sc = new Scanner(System.in);
        System.out.print("Give me two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(add(num1, num2));

        System.out.println(getPassword());
        System.out.println(isLoggedIn());
        System.out.printf("$%.2f%n", checkBalance());
        soutMsg();

        System.out.println(multiply(2.2, 7.89));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String getPassword() {
        return "P@$$w0rd";
    }

    public static boolean isLoggedIn() {
        return true;
    }

    public static double checkBalance() {
        return 5.50D;
    }

    public static void soutMsg() {
        System.out.println("Hiya!");
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
