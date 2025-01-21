package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {

        assertEquals(8, calculator.add(4, 4));
        assertNotEquals(7, calculator.add(4, 4));

    }

    @Test
    void subtract() {
        assertEquals(4, calculator.subtract(8, 4));
        assertNotEquals(7, calculator.subtract(4, 4));
    }

    @Test
    void multiply() {
        assertEquals(32, calculator.multiply(8, 4));
        assertNotEquals(7, calculator.multiply(1, 4));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(8, 4));
        assertNotEquals(2, calculator.divide(4, 4));
        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0), "Can not divide by 0 success");
    }

    @Test
    void squareroot(){
        assertEquals(2,calculator.squareroot(4));
    }

    @Test
    void quadrate(){
        assertEquals(16,calculator.quadrate(4));

    }

    @Test
    void sin(){
        assertEquals(Math.sin(Math.PI/2),calculator.sine(Math.PI/2));
        assertNotEquals(Math.sin(Math.PI/2),calculator.sine(Math.PI));
    }
    void cos(){
        assertEquals(Math.cos(Math.PI/2),calculator.cosine(Math.PI/2));
    }
}