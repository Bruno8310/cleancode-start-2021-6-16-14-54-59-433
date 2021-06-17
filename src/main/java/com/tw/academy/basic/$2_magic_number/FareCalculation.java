package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    private static final Double FIRST_LEVEL_DISCOUNT = 0.8;
    private static final Double SECOND_LEVEL_DISCOUNT = 0.5;
    private static final Integer FIRST_MIN_CUMULATIVE_EXPENSES = 100;
    private static final Integer FIRST_MAN_CUMULATIVE_EXPENSES = 150;
    private static final Integer RIGHT_MAN_CUMULATIVE_EXPENSES = 400;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= FIRST_MIN_CUMULATIVE_EXPENSES && cumulativeExpensesThisMonth < FIRST_MAN_CUMULATIVE_EXPENSES) {
            return originalPrice * FIRST_LEVEL_DISCOUNT;
        }
        if (cumulativeExpensesThisMonth >= FIRST_MAN_CUMULATIVE_EXPENSES && cumulativeExpensesThisMonth < RIGHT_MAN_CUMULATIVE_EXPENSES) {
            return originalPrice * SECOND_LEVEL_DISCOUNT;
        }
        return originalPrice;
    }
}
