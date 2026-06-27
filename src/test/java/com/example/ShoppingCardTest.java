package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void test_empty_cart_has_zero_total() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.total());
    }

    @Test
    void test_single_item_adds_to_total() {
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(10);
    assertEquals(10, cart.total());
    }
   
}


