package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestReporterExtension.class)
public class CalculatorFactorialTests {

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
