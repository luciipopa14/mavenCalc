package com.endava.calculator.basic;

public class Basic implements BasicOperations {

    protected int decimals;

    public Basic() {
        decimals = 10;
    }

    public Basic(int decimals) {
        this.decimals = decimals;
    }

    @Override
    public Long add(Long... no) {
        Long sum = 0L;
        for (Long i : no) {
            sum += i;
        }
        return sum;
    }

    @Override
    public long add(long... no) {
        long sum = 0;
        for (long i : no) {
            sum += i;
        }
        return sum;
    }

    @Override
    public double add(double... no) {
        double sum = 0;
        for (double i : no) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int substract(int... no) {
        int diff = no[0];
        for (int i = 1; i < no.length; i++) {
            diff -= no[i];
        }
        return diff;
    }

    @Override
    public long substract(long... no) {
        long diff = no[0];
        for (int i = 1; i < no.length; i++) {
            diff -= no[i];
        }
        return diff;
    }

    @Override
    public double substract(double... no) {
        double diff = no[0];
        for (int i = 1; i < no.length; i++) {
            diff -= no[i];
        }
        return diff;
    }

    @Override
    public long multiply(int... no) {
        long result = 1;
        for (int i : no) {
            result *= i;
        }
        return result;
    }

    @Override
    public long multiply(long... no) {
        long result = 1;
        for (long i : no) {
            result *= i;
        }
        return result;
    }

    @Override
    public double multiply(double... no) {
        double result = 1;
        for (double i : no) {
            result *= i;
        }
        return formatNumber(result);
    }

    @Override
    public double divide(int... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);
    }

    @Override
    public double divide(long... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);
    }

    @Override
    public double divide(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);
    }

    protected double formatNumber(double n) {
        String s = String.format("%." + decimals + "f", n);
        return Double.parseDouble(s);
    }
}
