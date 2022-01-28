package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestReporterExtension.class)
public class CalculatorPowTests {
    private ExpertOperations expertCalculator;

    @BeforeEach
    public void setUpEachTest() {
        expertCalculator = new Expert();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDownEachTest() {
        System.out.println("After Each");
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
}
