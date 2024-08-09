package com.mavendemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalsiTest {

    Calsi calsi = null;


    @Test
    public void shouldReturnSumOfTwoNumber2And5As7() {
        int sum = calsi.add(2, 5);
        assertEquals(7, sum);
    }

    @Test
    public void shouldReturn2When10DividedBy5() {
        double value = calsi.divide(10, 5);
        assertEquals(2, value);
    }

    @Test
    public void shouldReturnArithmeticExceptionWhenDivideByZero() {
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> calsi.divide(10, 0));
        assertEquals("can't divide by zero", arithmeticException.getMessage());
    }
}



