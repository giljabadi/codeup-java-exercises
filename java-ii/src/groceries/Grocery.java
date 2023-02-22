package groceries;

public class Grocery {
    // Variables
    private String name;
    private String category;
    private int quantity;

    // Constructor
    public Grocery(String category, String name, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
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
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
