package groceries;

import util.Input;

public class GroceryListApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to this awkward grocery store!!!\n");
        System.out.print("Do you want to start shopping? (y/n) ");

        boolean shopping = Input.yesNo();
        GroceryStore shopper = (shopping) ? new GroceryStore() : null;

        while(shopping){
            Grocery item = new Grocery(shopper.getCategories(), shopper.getName(), shopper.getQuantity());
            shopper.add(item);
            shopping = shopper.getCart();
        }

        System.out.println("\n\nGOODBYE!!! :)");
    }
}
