import utils.Input;

import java.util.*;


public class GroceryListApp {

    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        int tryAgain = -1;

        while(tryAgain == -1){
            tryAgain = init(groceryItems);
        }



    }

    public static int init(ArrayList<GroceryItem> items){
        Scanner scanner = new Scanner(System.in);
        String createListChoice = "y";
        Input input = new Input();


        createListChoice = input.getString("Would you like to create a grocery list?(y/n)");

        if(createListChoice.equalsIgnoreCase("y") || createListChoice.equalsIgnoreCase("yes")){
           boolean userContinue =true;
            while(userContinue){
                items.add(createItem());
                userContinue = input.yesNo("Do you want to add another item?: ");
            }
            printOrganizedList(items);
            return 1;
        }

        if(createListChoice.equalsIgnoreCase("n") || createListChoice.equalsIgnoreCase("no")){
            System.out.println("Goodbye!");
            return 1;
        }

        System.out.println("Input must be yes(y) or no(n). Try again\n");

        return -1;
    }

    public static GroceryItem createItem(){
        String optionSelection = "";
        String categorySelection;
        String itemName;
        int quantity;
        Input input = new Input();

        System.out.println("\nSelect Food category:");
        System.out.println("1. Produce");
        System.out.println("2. Dairy");
        System.out.println("3. Frozen");
        System.out.println("4. Meat");

        categorySelection = input.getString("Enter selection by number: ");

        while(Integer.parseInt(categorySelection) < 1 || Integer.parseInt(categorySelection) >4){
            categorySelection = input.getString("The selection must be between 1-4. Enter: ");
        }

        switch (Integer.parseInt(categorySelection)){
            case 1: optionSelection = "Produce";
                    break;
            case 2: optionSelection = "Dairy";
                    break;
            case 3: optionSelection = "Frozen";
                    break;
            case 4: optionSelection = "Meat";
                    break;
        }

        itemName = input.getString("Enter Item name:");
        quantity = input.getInt("Enter quantity amount:");

        return new GroceryItem(quantity,itemName,optionSelection);
    }

    public static void printOrganizedList(ArrayList<GroceryItem> items){
        Collections.sort(items, new Comparator<GroceryItem>() {
            @Override
            public int compare(GroceryItem o1, GroceryItem o2) {
                return o1.name.compareTo(o2.getName());
            }
        });

        System.out.println("\nHere is your sorted grocery list");
        System.out.println("--------------------------------");

        //Dairy Item
        System.out.println("Dairy items:");
        System.out.println("-------------");
        items.forEach((GroceryItem item) -> {
            if (item.getCategory() == "Dairy")
                System.out.println(item.getName() +" qnt: "+ item.getQuantity());
        });
        System.out.println("\n");

        //Produce Items
        System.out.println("Produce items:");
        System.out.println("-------------");
        items.forEach(item -> {
            if (item.getCategory() == "Produce")
                System.out.println(item.getName() +" qnt: "+ item.getQuantity());
        });
        System.out.println("\n");

        System.out.println("Frozen items:");
        System.out.println("-------------");
        items.forEach(item -> {
            if (item.getCategory() == "Frozen")
                System.out.println(item.getName() +" qnt: "+ item.getQuantity());
        });
        System.out.println("\n");

        System.out.println("Meat items:");
        System.out.println("-------------");
        items.forEach(item -> {
            if (item.getCategory() == "Meat")
                System.out.println(item.getName() +" qnt: "+ item.getQuantity());
        });
    }


}