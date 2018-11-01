package com.stat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        double x = firstNumber * 1000;
        int x1 = (int) x;
        double y = secondNumber * 1000;
        int y1 = (int) y;
        if (x1 == y1)
            return true;
        else
            return false;

    }
}

else if()