package com.example;

/**
 * Simple shopping cart for TDD exercise
 */

public class ShoppingCart {

    private int total = 0;

    public void addItem(int price) {
        total += price;
    }

    public int total() {
        return total;
    }
}


