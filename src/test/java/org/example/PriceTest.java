package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {
    Price parking;
    @BeforeEach
    void setUp() {
        parking = new Price();
    }

    @Test
    void calculatePrice() {
        assertEquals(3, parking.calculatePrice(parking.hour(9), parking.hour(10)));
        assertEquals(3, parking.calculatePrice(parking.hour(7), parking.hour(9)));
        assertEquals(0, parking.calculatePrice(parking.hour(18), parking.hour(20)));
        assertEquals(1.5, parking.calculatePrice(parking.hour(5), parking.hour(8.5F)));
    }

}