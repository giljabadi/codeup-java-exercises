package shapes;
import util.Input;
import java.lang.reflect.Array;

public class CircleApp {
    public static void main(String[] args) {
        boolean again = true;
        do {
            Circle.createNewCircle();
            again = prompt();
        } while (again);
    }

    public static boolean prompt(){
        System.out.print("\nYou wanna make another Circle? (y/n) ");
        return Input.yesNo();
    }
}
