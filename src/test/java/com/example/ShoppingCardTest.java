package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void test_empty_cart_has_zero_total() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.total());
    }
}

