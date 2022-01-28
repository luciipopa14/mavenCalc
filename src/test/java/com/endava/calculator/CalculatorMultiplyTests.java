package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestReporterExtension.class)
public class CalculatorMultiplyTests {
    private BasicOperations basicCalculator;

    @BeforeEach
    public void setUpEachTest() {
        basicCalculator = new Basic();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDownEachTest() {
        System.out.println("After Each");
    }

    @Test
    public void shouldMultiply2PositiveNumbers() {

        //given

        //when
        Long result = basicCalculator.multiply(2, 3);

        //then
        assertEquals(6, result);
    }

    @Test
    public void shouldMultiplyMultipleNumbers() {

        //given

        //when
        Long result = basicCalculator.multiply(-2, 3, -2, 5);

        //then
        assertEquals(60, result);
    }

    @Test
    public void shouldMultiplyGiven1Operand() {

        //given

        //when
        Long result = basicCalculator.multiply(3);

        //then
        assertEquals(3, result);
    }

    @Test
    public void shouldMultiplyGivenOperandAnd0() {

        //given

        //when
        Long result = basicCalculator.multiply(3, 0);

        //then
        assertEquals(0, result);
    }
}
