package mid1.collection.test.ex1.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println("item.getName() = " + item.getName());
            System.out.println("item.getTotalPrice() = " + item.getTotalPrice());
        }

        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += getTotalPrice(item);
            System.out.println("totalPrice = " + totalPrice);
        }
    }

    private static int getTotalPrice(Item item) {
        return item.getTotalPrice();
    }
}
