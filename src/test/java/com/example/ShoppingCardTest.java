package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ShoppingCartTest {

    @Test
    void test_discount_applied_after_18() {

        // Arrange
        TimeProvider timeProvider = mock(TimeProvider.class);
        when(timeProvider.now()).thenReturn(LocalTime.of(19, 0));

        ShoppingCart cart = new ShoppingCart(timeProvider);
        cart.addItem(100);

        // Act
        int total = cart.total();

        // Assert
        assertEquals(90, total);
    }
}

/* Begründung zur Mock-Wahl:
Die Methode LocalTime.now() musste sinnvoller Weise gemockt werden, 
da sie von der realen Systemzeit abhängt und dadurch nicht deterministische Testergebnisse erzeugen würde. 
Ohne Mocking wäre der Test nicht zuverlässig reproduzierbar, 
da das Ergebnis je nach Ausführungszeitpunkt variieren kann. 
*/ 


