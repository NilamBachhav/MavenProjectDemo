package com.mavendemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalsiTest {

    Calsi calsi = null;

    @BeforeEach
    void setUp() {
        calsi = new Calsi();
    }

    @Test
    void shouldReturnSumOfTwoNumber2And5As7() {
        int sum = calsi.add(2, 5);
        assertEquals(7, sum);
    }


    @Test
    void shouldReturn2When10DividedBy5() {
        double value = calsi.divide(10, 5);
        assertEquals(2, value);
    }

    @Test
    void shouldReturnArithmeticExceptionWhenDivideByZero() {
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> calsi.divide(10, 0));
        assertEquals("can't divide by zero", arithmeticException.getMessage());
    }

}
