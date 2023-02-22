package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        int menuSelect = displayMenu();
        while(menuSelect != 0){
            if (menuSelect == 1) { Movie.addMovie(); }
            else if (menuSelect == 2) { MoviesArray.findAll(); }
            else if (menuSelect == 3) { MoviesArray.findAll("animated"); }
            else if (menuSelect == 4) { MoviesArray.findAll("drama"); }
            else if (menuSelect == 5) { MoviesArray.findAll("horror"); }
            else if (menuSelect == 6) { MoviesArray.findAll("scifi"); }
            else { menuSelect = displayMenu(); continue; }
            System.out.print("\n\n[0-Exit] Enter Menu Option: ");
            menuSelect = Input.getInt();
        }
    }

    public static int displayMenu() {
        System.out.print("\n\n============= MOVIES APP =============\n" +
                "    (select a menu option)\n" +
                "    0 - exit\n" +
                "    1 - add a movie\n" +
                "    2 - view all movies\n" +
                "    3 - view animated movies\n" +
                "    4 - view drama movies\n" +
                "    5 - view horror movies\n" +
                "    6 - view scifi movies\n" +
                "    7 - view menu\n" +
                "\n" +
                "Enter Menu Option: ");
        return Input.getInt();
    }
}
