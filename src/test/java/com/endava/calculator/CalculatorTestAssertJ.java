package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTestAssertJ {

    private BasicOperations basicCalculator = new Basic();

    @Test
    public void shouldAddOneOperand() {

        //given

        //when
        Long result = basicCalculator.add(167);

        //then
        assertThat(result).isBetween(100L, 200L)
                .isGreaterThan(150L)
                .isEqualTo(167L)
                .isNotNegative()
                .isNotNull();
    }
}
