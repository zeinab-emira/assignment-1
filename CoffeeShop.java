import java.util.ArrayList;

public class CoffeeShop {
    private String name;
    private ArrayList<Item> menu;
    private ArrayList<String> orders;

    public CoffeeShop(String name, ArrayList<Item> menu) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<String>();
    }

    public void addOrder(String item) {
        for (Item menu_item : this.menu) {
            if (menu_item.getItem().equals(item)) {
                this.orders.add(item);
                return;
            }
        }
        System.out.println("This item is currently unavailable!");
    }

    public String fulfillOrder() {
        if (!this.orders.isEmpty()) {
            String item = this.orders.remove(0);
            return "The " + item + " is ready!";
        } else {
            return "All orders have been fulfilled!";
        }
    }

    public ArrayList<String> listOrders() {
        return this.orders;
    }

    public double dueAmount() {
        double total = 0;
        for (String order : this.orders) {
            for (Item menu_item : this.menu) {
                if (menu_item.getItem().equals(order)) {
                    total += menu_item.getPrice();
                    break;
                }
            }
        }
        return total;
    }

    public String cheapestItem() {
        Item cheapest = this.menu.get(0);
        for (Item menu_item : this.menu) {
            if (menu_item.getPrice() < cheapest.getPrice()) {
                cheapest = menu_item;
            }
        }
        return cheapest.getItem();
    }

    public ArrayList<String> drinksOnly() {
        ArrayList<String> drinks = new ArrayList<String>();
        for (Item menu_item : this.menu) {
            if (menu_item.getType().equals("drink")) {
                drinks.add(menu_item.getItem());
            }
        }
        return drinks;
    }

    public ArrayList<String> foodOnly() {
        ArrayList<String> food = new ArrayList<String>();
        for (Item menu_item : this.menu) {
            if (menu_item.getType().equals("food")) {
                food.add(menu_item.getItem());
            }
        }
        return food;
    }
}

class Item {
    private String item;
    private String type;
    private double price;

    public Item(String item, String type, double price) {
        this.item = item;
        this.type = type;
        this.price = price;
    }

    public String getItem() {
        return this.item;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }
}