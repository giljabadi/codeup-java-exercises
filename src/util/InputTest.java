package util;
import util.Input;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input.getString();
        Input.yesNo();
        Input.getInt(1, 10);
        Input.getInt();
        Input.getDouble(1, 10);
        Input.getDouble();
    }
}
