package com.example;

public class ShoppingCart {

    private int total = 0;
    private final TimeProvider timeProvider;

    public ShoppingCart(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public void addItem(int price) {
        total += price;
    }

    public int total() {
        if (timeProvider.now().getHour() >= 18) {
            return (int) (total * 0.9); // 10% Rabatt
        }
        return total;
    }
}

