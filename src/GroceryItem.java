public class GroceryItem {
    int quantity;
    String name;
    String category;

    public GroceryItem(int quantity, String name, String category){
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }
}