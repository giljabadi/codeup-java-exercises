package groceries;
import util.Input;
import java.util.ArrayList;
import java.util.Collections;

public class GroceryStore {
    // Variables
    private ArrayList<Grocery> cart;
    private String[] categories = {"Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy", "Dry/Baking Goods", "Frozen Foods", "Meat", "Produce", "Cleaners", "Paper Goods", "Personal Care", "Other"};

    // Constructor
    public GroceryStore() {
        this.cart = new ArrayList<>();
    }

    // Methods
    public void add(Grocery grocery) {
        cart.add(grocery);
    }

    public void edit(Grocery originalGrocery, Grocery editedGrocery) {
        cart.remove(originalGrocery);
        cart.add(editedGrocery);
    }

    public String getCategories() {
        System.out.println("-- Now Shopping --\n");
        for (int i = 0; i < categories.length; i++){
            System.out.printf("    %d - %s%n", i+1, categories[i]);
        }
        System.out.print("\nSelect a category: ");
        int category = Input.getInt();
        return categories[category - 1];
    }

    public String getName(){
        System.out.print("Item Name: ");
        return Input.getString();
    }

    public int getQuantity(){
        System.out.print("Quantity: ");
        return Input.getInt();
    }

    public boolean getCart(){
        System.out.print("Continue Shopping? (y/n) ");
        Input.clear();
        boolean stillShopping = Input.yesNo();
        if(!stillShopping) {
            sortAlpha(cart);
            sortCategory(cart);
            for(Grocery grocery : cart){
                System.out.printf("%nCategory: %-20s | Name: %-20s | Quantity: %d", grocery.getCategory(), grocery.getName(), grocery.getQuantity());
            }
        }
        return stillShopping;
    }

    private void sortAlpha(ArrayList<Grocery> cart) {
        cart.sort((g1, g2) -> g1.getName().compareTo(g2.getName()));
    }

    private void sortCategory(ArrayList<Grocery> cart) {
        cart.sort((g1, g2) -> g1.getCategory().compareTo(g2.getCategory()));
    }
}
