import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Example menu
        ArrayList<Item> menu = new ArrayList<Item>();
        menu.add(new Item("latte", "drink", 3.5));
        menu.add(new Item("croissant", "food", 2.0));
        menu.add(new Item("bagel", "food", 2.5));
        menu.add(new Item("cappuccino", "drink", 4.0));

        // Create a coffee shop instance with the name "My Coffee Shop" and the menu defined above
        CoffeeShop myCoffeeShop = new CoffeeShop("My Coffee Shop", menu);

        // Add an order to the coffee shop
        myCoffeeShop.addOrder("latte");

        // Print the orders of the coffee shop
        System.out.println(myCoffeeShop.listOrders());  // Output: [latte]

        // Fulfill an order from the coffee shop
        System.out.println(myCoffeeShop.fulfillOrder());  // Output: The latte is ready!

        // Print the orders of the coffee shop
        System.out.println(myCoffeeShop.listOrders());  // Output: []

        // Add an order to the coffee shop
        myCoffeeShop.addOrder("croissant");

        // Print the cheapest item on the menu
        System.out.println(myCoffeeShop.cheapestItem());  // Output: croissant

        // Print the list of drink items on the menu
        System.out.println(myCoffeeShop.drinksOnly());  // Output: [latte, cappuccino]
    }
}