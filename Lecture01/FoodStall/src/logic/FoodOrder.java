package logic;

import java.util.Scanner;

public class FoodOrder {

    // Fields: description, price, chicken, vegetable, extraChicken, extraRice
    private final String description;
    private int price;
    private boolean hasChicken;
    private boolean hasVegetable;
    private boolean hasExtraChicken;
    private boolean hasExtraRice;

    // Constructor
    public FoodOrder() {
        this.description = "Hainanese Chicken rice";
        this.hasChicken = true;
        this.hasVegetable = true;
        this.hasExtraChicken = false;
        this.hasExtraRice = false;
    }

    // Methods
    public int calculatePrice() {
        int cost = 40;
        if (!this.hasChicken) {
            cost -= 10;
        }
        if (this.hasExtraChicken) {
            cost += 10;
        }
        if (this.hasExtraRice) {
            cost += 5;
        }
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
        price = calculatePrice();
    }

    public void setHasVegetable(boolean hasVegetable) {
        this.hasVegetable = hasVegetable;
    }

    public void setHasExtraChicken(boolean hasExtraChicken) {
        this.hasExtraChicken = hasExtraChicken;
        price = calculatePrice();
    }

    public void setHasExtraRice(boolean hasExtraRice) {
        this.hasExtraRice = hasExtraRice;
        price = calculatePrice();
    }

    @Override
    public String toString() {
        return "That would be " + getPrice() + " baht. Thanks !\n"
                + getDescription() + "\n"
                + "Chicken:" + hasChicken + "\n"
                + "Vegetable:" + hasVegetable + "\n"
                + "Extra Chicken:" + hasExtraChicken + "\n"
                + "Extra Rice:" + hasExtraRice;
    }

    public boolean equals(FoodOrder other) {
        return price == other.getPrice();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        FoodOrder foodOrder = new FoodOrder();
        System.out.println("Hi, Welcome to Kao-Mun-Gai food stall!");
        System.out.println("We only sell " + foodOrder.getDescription());
        System.out.println("Would you like your meal with chicken? (Yes/No)");
        String customerInput = keyboard.next();
        if (customerInput.equals("No")) {
            foodOrder.setHasChicken(false);
            System.out.println("Okay...");
        } else if (customerInput.equals("Yes")) {
            foodOrder.setHasChicken(true);
        }
        System.out.println("Would you like your meal with vegetable? (Yes/No)");
        customerInput = keyboard.next();
        if (customerInput.equals("No")) {
            foodOrder.setHasVegetable(false);
        } else if (customerInput.equals("Yes")) {
            foodOrder.setHasVegetable(true);
        }
        System.out.println("Extra chicken? (Yes/No)");
        customerInput = keyboard.next();
        if (customerInput.equals("Yes")) {
            foodOrder.setHasExtraChicken(true);
            System.out.println("Good Choice!");
        } else if (customerInput.equals("No")) {
            foodOrder.setHasExtraChicken(false);
        }
        System.out.println("Extra Rice? (Yes/No)");
        customerInput = keyboard.next();
        if (customerInput.equals("Yes")) {
            foodOrder.setHasExtraRice(true);
        } else if (customerInput.equals("No")) {
            foodOrder.setHasExtraRice(false);
        }

        System.out.println(foodOrder);

        // Uncomment the following lines to test equals method
//        FoodOrder testOrder = new FoodOrder();
//        testOrder.setHasChicken(false);
//        testOrder.setHasExtraChicken(false);
//        testOrder.setHasExtraRice(true);
//        FoodOrder testOrder2 = new FoodOrder();
//        testOrder2.setHasChicken(false);
//        testOrder2.setHasExtraChicken(false);
//        testOrder2.setHasExtraRice(true);
//        System.out.println("Equal:" + testOrder.equals(testOrder2));
    }

}
