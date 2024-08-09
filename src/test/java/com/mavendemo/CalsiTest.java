
package com.mavendemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalsiTest {

    private Calsi calsi;

    @BeforeEach
    public void setUp() {
        // Initialize the Calsi object before each test
        calsi = new Calsi();
    }

    @Test
    public void shouldReturnSumOfTwoNumber2And5As7() {
        int result = calsi.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void shouldReturn2When10DividedBy5() {
        int result = (int) calsi.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnArithmeticExceptionWhenDivideByZero() {
        // This should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> calsi.divide(10, 0));
    }
}


