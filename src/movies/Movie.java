package movies;

public class Movie {
    String name;
    String category;

    public Movie(String n, String c){
        name = n;
        category = c;
    }

    public String getName() {
        return name;
    }

    public java.lang.String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}