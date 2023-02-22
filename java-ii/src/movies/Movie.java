package movies;

import util.Input;

public class Movie {
    // Variables/Fields
    private String name;
    private String category;
    private static String[] categories = { "animated", "drama", "horror", "scifi" };

    // Constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void addMovie() {
        System.out.println("\n------------- ADD A MOVIE -------------");
        System.out.print("Movie Name: ");
        String name = Input.getString();
        System.out.print("    (select a category)\n");
        for(int i = 0; i < categories.length; i++) {
            System.out.printf("    %d - %s\n", i, categories[i]);
        }
        System.out.print("Movie Category: ");
        String category = categories[Input.getInt()];
        Input.clear();
        MoviesArray.add(new Movie(name, category.toLowerCase()));
        System.out.printf("\"%s -- %s\" added!", name, category);
    }
}
