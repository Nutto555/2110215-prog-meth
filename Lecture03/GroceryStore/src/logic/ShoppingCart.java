package logic;

import java.util.ArrayList;
import java.util.Random;

public class ShoppingCart {
    private int requiredUnitItems;
    private int requiredWeightItems;
    private int discount; // in percentage 1 - 100;

    private final ArrayList<Item> items;

    public ShoppingCart() {
        // TODO Auto-generated constructor stub
        Random random = new Random();
        requiredUnitItems = 1 + random.nextInt(3);
        requiredWeightItems = 1 + random.nextInt(3);
        discount = 20;
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        if (item instanceof UnitItem) {
            if (item.getUnitPrice() <= 0) {
                System.out.println("Unable to add. Price should be more than $0");
                return;
            }
            if (((UnitItem) item).getAmount() <= 0) {
                System.out.println("Unable to add. Amount should be more than 0");
                return;
            }
        } else if (item instanceof WeightItem) {
            if (item.getUnitPrice() <= 0) {
                System.out.println("Unable to add. Price should be more than $0");
                return;
            }
        }
        items.add(item);
        System.out.printf("Cost is $%.2f\n", item.cost());
    }

    public double checkOut() {
        double sum = 0;
        for (Item item : items) {
            sum += item.cost();
        }
        return sum;
    }

    public boolean isDiscounted() {
        int uCount = 0; // Count total number of different unit items
        int wCount = 0; // Count total number of different weight items

        for (Item item : items) {
            if (item instanceof UnitItem)
                uCount++;
            else if (item instanceof WeightItem)
                wCount++;
        }

        return uCount >= this.requiredUnitItems && wCount >= this.requiredWeightItems;

    }

    public int getRequiredUnitItems() {
        return requiredUnitItems;
    }

    public void setRequiredUnitItems(int requiredUnitItems) {
        this.requiredUnitItems = requiredUnitItems;
    }

    public int getRequiredWeightItems() {
        return requiredWeightItems;
    }

    public void setRequiredWeightItems(int requiredWeightItems) {
        this.requiredWeightItems = requiredWeightItems;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
