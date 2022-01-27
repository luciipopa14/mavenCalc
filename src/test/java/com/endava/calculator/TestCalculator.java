package com.endava.calculator;

import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;

public class TestCalculator {
    public static void main(String[] args) {

//        BasicOperations b = new Basic(1);
//        System.out.println(b.add(2, 3, 4, 9, 12, 0));
//        System.out.println(b.substract(2, 3));
//        System.out.println(b.multiply(2, 6));
//        System.out.println(b.divide(10, 3));
//        System.out.println(b.divide(5, 1));
//        System.out.println(b.multiply(3.5, 2.3));

        ExpertOperations e = new Expert(2);
//        System.out.println(e.pow(2,3));
//        System.out.println(e.root(10));
//        System.out.println(e.fact(5));
//        System.out.println(e.factRec(5));

//        System.out.println(e.calculate("3 + 5"));
//        System.out.println(e.calculate("22.50 + 33.35 + 5 + 6 + 10.1"));
        System.out.println("-----Calculator-----");
        System.out.println(e.calculate("3*5"));
        System.out.println(e.calculate("- 3 - 5 * 3"));
        System.out.println(e.calculate("2 * (-3-5)*(-7-5)"));
        System.out.println(e.calculate("(3+2)/5*5-(8/2)"));
//        System.out.println(e.calculate("(2*(-3+7))+4"));
        System.out.println(e.calculate("2^3^2"));
    }
}
