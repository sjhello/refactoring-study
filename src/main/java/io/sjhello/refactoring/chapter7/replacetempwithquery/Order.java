package io.sjhello.refactoring.chapter7.replacetempwithquery;

public class Order {

    private int quantity;
    private Item item;

    public Order(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getPrice() {
        int basePrice = getBasePrice();
        double discountFactor = getDiscountFactor(basePrice);

        return basePrice * discountFactor;
    }

    private static double getDiscountFactor(int basePrice) {
        double discountFactor = 0.98;
        if (basePrice > 1000) discountFactor -= 0.03;

        return discountFactor;
    }

    private int getBasePrice() {
        return this.quantity * this.item.getPrice();
    }
}
