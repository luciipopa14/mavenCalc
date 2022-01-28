package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIT {
    private BasicOperations basicCalculator;
    private ExpertOperations expertCalculator;

    @BeforeAll
    public static void setUpAllTests() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDownAllTests() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUpEachTest() {
        basicCalculator = new Basic();
        expertCalculator = new Expert();
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

    @Test
    public void shouldPowSimpleNumbers() {

        //given

        //when
        double result = expertCalculator.pow(2, 3);
        //then
        assertEquals(8, result);
    }

    @Test
    public void shouldPowNegativeExponent() {

        //given

        //when
        double result = expertCalculator.pow(2, -1);
        //then
        assertEquals(0.5,result);
    }

    @Test
    public void shouldPowNegativeBase() {

        //given

        //when
        double result = expertCalculator.pow(-2, 3);
        //then
        assertEquals(-8, result);
    }

    @Test
    public void shouldPowExponent0() {

        //given

        //when
        double result = expertCalculator.pow(3, 0);
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldFactSimpleNumber() {

        //given

        //when
        double result = expertCalculator.fact(4);
        //then
        assertEquals(24, result);
    }

    @Test
    public void shouldFactGivenZero() {

        //given

        //when
        double result = expertCalculator.fact(0);
        //then
        assertEquals(1,result);
    }

    @Test
    public void shouldFactGiven2DigitsNumber() {

        //given

        //when
        double result = expertCalculator.fact(12);
        //then
        assertEquals(479001600, result);
    }
}
