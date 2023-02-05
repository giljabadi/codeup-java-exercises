package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice =1 ;
        while(userChoice != 0){
            userChoice = displayOptions();
            if(userChoice>0){
                Movie[] movies = MoviesArray.findAll();
                executeOption(userChoice,movies);
                System.out.println("\n\nPress Enter to go back to the main menu.");
                scanner.nextLine();
            }
        }


    }

    public static void executeOption(int choice, Movie[] movies){
        Movie[] temp;
        switch (choice){
            case 1:
                displayAllMovies(movies);
                break;
            case 2:
                displayMovieByCategory(movies, "animated");
                break;
            case 3:
                displayMovieByCategory(movies, "drama");
                break;
            case 4:
                displayMovieByCategory(movies, "horror");
                break;
            case 5:
                displayMovieByCategory(movies, "scifi");
                break;
//            case 6:
//               temp = addMovie(movies);

        }

    }

    public static void displayAllMovies(Movie[] movies){
        for(Movie movie: movies){
            System.out.printf("\n%s -- %s",movie.getName(),movie.getCategory());
        }
    }

    public static void displayMovieByCategory(Movie[] movies, String category){
        for(Movie movie: movies){
            if(movie.category.equalsIgnoreCase(category)){
                System.out.printf("\n%s -- %s",movie.getName(),movie.getCategory());
            }
        }
    }

    public static int displayOptions(){
        Scanner scanner = new Scanner(System.in);

        int userInput;
        System.out.printf("\nWhat would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
//                "6 - add movie to the list\n"+
                "\n" +
                "Enter your choice: ");

        userInput = scanner.nextInt();
        while(userInput < 0 || userInput > 6){
            System.out.println("You must enter a number between 0-5:");
            userInput = scanner.nextInt();
        }

        return userInput;
    }

//    public static Movie[] addMovie(Movie[] movies){
//        String name;
//        String category;
//        Movie [] temp = new Movie[movies.length+1];
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter movie name: ");
//        name = scanner.nextLine();
//
//        System.out.println("Enter movie category: ");
//        category = scanner.nextLine();
//
//        for(int i=0; i < movies.length; i++){
//            temp[i] = movies[i];
//        }
//
//        temp[movies.length] = new Movie(name, category);
//        System.out.printf("%s has been added to the movie list", name);
//
//        return temp;
//    }

}