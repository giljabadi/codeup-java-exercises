package movies;
import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        MovieApp();

    }

    public static void MovieApp() {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n" +
                "\n" +
                "Enter your choice: ");
        String userInput = Input.getString();
        System.out.println(userInput);

        if (userInput.equals("0")) {
            return;
        } else if (userInput.equals("1")) {
            for (Movie movie : findAll()) {
                System.out.println(movie.getMovie());
            }
            MovieApp();
        } else if (userInput.equals("2")) {
            for (Movie movie : findAll()) {
                if (movie.getCategory() == "animated") {
                    System.out.println(movie.getMovie());
                }
            }
            MovieApp();
            }

        else if (userInput.equals("3")) {
            for (Movie movie : findAll()) {
                if (movie.getCategory() == "drama") {
                    System.out.println(movie.getMovie());
                }
            }
            MovieApp();
            }
        else if (userInput.equals("4")) {
            for (Movie movie : findAll()) {
                if (movie.getCategory() == "horror") {
                    System.out.println(movie.getMovie());
                }
            }
            MovieApp();
            }
        else if (userInput.equals("5")) {
            for (Movie movie : findAll()) {
                if (movie.getCategory() == "scifi") {
                    System.out.println(movie.getMovie());
                }
            }
            MovieApp();
        }
    }
}

