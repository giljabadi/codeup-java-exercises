package movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MoviesArray {
    // Variables
    private static Movie[] movies = {
            new Movie("Citizen Kane", "drama"),
            new Movie("Casablanca", "drama"),
            new Movie("The Godfather", "drama"),
            new Movie("Gone With The Wind", "drama"),
            new Movie("Lawrence Of Arabia", "drama"),
            new Movie("The Wizard Of Oz", "musical"),
            new Movie("The Graduate", "drama"),
            new Movie("On The Waterfront", "drama"),
            new Movie("Schindler's List", "drama"),
            new Movie("Singin' In The Rain", "musical"),
            new Movie("It's A Wonderful Life", "drama"),
            new Movie("Sunset Boulevard", "drama"),
            new Movie("The Bridge On The River Kwai", "drama"),
            new Movie("Some Like It Hot", "drama"),
            new Movie("Star Wars", "scifi"),
            new Movie("All About Eve", "drama"),
            new Movie("The African Queen", "drama"),
            new Movie("Psycho" , "horror"),
            new Movie("Chinatown", "drama"),
            new Movie("One Flew Over The Cuckoo's Nest", "drama"),
            new Movie("The Grapes Of Wrath", "drama"),
            new Movie("2001: A Space Odyssey", "scifi"),
            new Movie("The Maltese Falcon", "drama"),
            new Movie("Raging Bull", "drama"),
            new Movie("E.T. The extra-terrestrial", "scifi"),
            new Movie("Dr. Strangelove", "drama"),
            new Movie("Bonnie And Clyde", "drama"),
            new Movie("Apocalypse Now", "drama"),
            new Movie("Mr. Smith Goes to Washington", "drama"),
            new Movie("The Treasure Of The Sierra Madre", "drama"),
            new Movie("Annie Hall", "comedy"),
            new Movie("The Godfather Part II", "drama"),
            new Movie("High Noon", "drama"),
            new Movie("To Kill A Mockingbird", "drama"),
            new Movie("It Happened One Night", "drama"),
            new Movie("Midnight Cowboy", "drama"),
            new Movie("The Best Years Of Our Lives", "drama"),
            new Movie("Double Indemnity", "drama"),
            new Movie("Doctor Zhivago", "drama"),
            new Movie("North By Northwest", "drama"),
            new Movie("West Side Story", "musical"),
            new Movie("Rear Window", "drama"),
            new Movie("King Kong", "horror"),
            new Movie("The Birth Of A Nation", "drama"),
            new Movie("A Streetcar Named Desire", "drama"),
            new Movie("A Clockwork Orange", "scifi"),
            new Movie("Taxi Driver", "drama"),
            new Movie("Jaws", "horror"),
            new Movie("Snow White And The Seven Dwarfs", "animated"),
            new Movie("Butch Cassidy And The Sundance Kid", "drama"),
            new Movie("The Philadelphia Story", "drama"),
            new Movie("From Here To Eternity", "drama"),
            new Movie("Amadeus", "drama"),
            new Movie("All Quiet On The Western Front", "drama"),
            new Movie("The Sound Of Music", "musical"),
            new Movie("M*A*S*H", "comedy"),
            new Movie("The Third Man", "drama"),
            new Movie("Fantasia", "animated"),
            new Movie("Rebel Without A Cause", "drama"),
            new Movie("Raiders Of The Lost Ark", "drama"),
            new Movie("Vertigo", "drama"),
            new Movie("Tootsie", "comedy"),
            new Movie("Stagecoach", "drama"),
            new Movie("Close Encounters Of The Third Kind", "scifi"),
            new Movie("The Silence Of The Lambs", "horror"),
            new Movie("Network", "drama"),
            new Movie("The Manchurian Candidate", "drama"),
            new Movie("An American In Paris", "drama"),
            new Movie("Shane", "drama"),
            new Movie("The French Connection", "drama"),
            new Movie("Forrest Gump", "drama"),
            new Movie("Ben-Hur", "drama"),
            new Movie("Wuthering Heights", "drama"),
            new Movie("The Gold Rush", "drama"),
            new Movie("Dances With Wolves", "drama"),
            new Movie("City Lights", "drama"),
            new Movie("American Graffiti", "drama"),
            new Movie("Rocky", "drama"),
            new Movie("The Deer Hunter", "drama"),
            new Movie("The Wild Bunch", "drama"),
            new Movie("Modern Times", "drama"),
            new Movie("Giant", "drama"),
            new Movie("Platoon", "drama"),
            new Movie("Fargo", "drama"),
            new Movie("Duck Soup", "comedy"),
            new Movie("Mutiny On The Bounty", "drama"),
            new Movie("Frankenstein", "horror"),
            new Movie("Easy Rider", "drama"),
            new Movie("Patton", "drama"),
            new Movie("The Jazz Singer", "drama"),
            new Movie("My Fair Lady", "musical"),
            new Movie("A Place In The Sun", "drama"),
            new Movie("The Apartment", "drama"),
            new Movie("Goodfellas", "drama"),
            new Movie("Pulp Fiction", "drama"),
            new Movie("The Searchers", "drama"),
            new Movie("Bringing Up Baby", "drama"),
            new Movie("Unforgiven", "drama"),
            new Movie("Guess Who's Coming To Dinner", "drama"),
            new Movie("Yankee Doodle Dandy", "musical")
    };;
    private static int numMovies = movies.length;

    public static void add(Movie aMovie) {
        ensureCapacity();
        movies[numMovies++] = aMovie;
    }

    private static void ensureCapacity() {
        if (numMovies == movies.length) {
            int newSize = movies.length + 1;
            Movie[] newMovies = new Movie[newSize];

            System.arraycopy(movies, 0, newMovies, 0, movies.length);
            movies = newMovies;
        }
    }

    public static void findAll() {
        System.out.println("\n------------- ALL MOVIES -------------=");
        for(Movie movie: movies){
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }


    public static void findAll(String category) {
        int count = 0;
        for(Movie movie: movies){
            if (movie.getCategory().equals(category))count++;
        }
        Movie[] filtered = new Movie[count];
        int i = 0;
        for(Movie movie: movies){
            if (movie.getCategory().equals(category)){
                filtered[i++] = movie;
            }
        }
        System.out.printf("\n------------- %s -------------\n", category.toUpperCase());
        for(Movie movie: filtered){
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }


}