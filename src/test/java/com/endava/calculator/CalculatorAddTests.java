package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestReporterExtension.class)
public class CalculatorAddTests {

    private BasicOperations basicCalculator;

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
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDownEachTest() {
        System.out.println("After Each");
    }

    @Tags({@Tag("smoke"), @Tag("ui")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b, long expected) {

        //given

        //when
        Long result = basicCalculator.add(2, 0);

        //then
        assertThat(result, is(expected));
    }

    public static List<Arguments> numberProvider() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.of(0, 2, 2));
        argumentsList.add(Arguments.of(2, 0, 2));

        return argumentsList;
    }

    @Tag("smoke")
    @Test
    public void shouldAddNegativeNumbers() {

        //given

        //when
        Long result = basicCalculator.add(-2, -4);

        //then
        assertEquals(-6L, result);
        assertTrue(result.equals(-6L));
    }

    @Tags({@Tag("smoke"), @Tag("api")})
    @Test
    public void shouldAddBigNumbers() {

        //given

        //when
        Long result = basicCalculator.add(Integer.MAX_VALUE, 1);

        //then
        assertThat(result, is(Integer.MAX_VALUE + 1L));
        assertThat(result, greaterThan(0L));
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldAddNoOperands() {

        //given

        //when
        Long result = basicCalculator.add(0);

        //then
        assertEquals(0, result);
    }

    @Test
    public void shouldAddOneOperand() {

        //given

        //when
        Long result = basicCalculator.add(167);

        //then
        assertEquals(0, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3,6", "2,4,5,11"})
    @CsvFileSource(resources = "numberSource.csv")
    public void shouldAddMoreThan2Operands(Integer a, Integer b, Integer c, Long expected) {

        //given

        //when
        Long result = basicCalculator.add(a, b, c);

        //then
        assertThat(result, is(expected));
    }

}
