package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(15, App.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, App.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, App.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, App.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> App.divide(10, 0));
    }
}