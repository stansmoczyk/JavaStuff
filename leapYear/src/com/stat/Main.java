package com.stat;




public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void getDaysInMonth(int month, int year) {

        boolean resultOfLeapYearCorrectness = isLeapYear(year);

        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        } else if (month == 1) {

            return 31;

        } else if (month == 2) {

            if (resultOfLeapYearCorrectness) {

                return 29;
            }

            return 28;

        } else if (month == 3) {

            return 31;

        } else if (month == 4) {

            return 30;

        } else if (month == 5) {

            return 31;

        } else if (month == 6) {

            return 30;

        } else if (month == 7) {

            return 31;

        } else if (month == 8) {

            return 31;

        } else if (month == 9) {

            return 30;

        } else if (month == 10) {

            return 31;

        } else if (month == 11) {

            return 30;

        } else if (month == 12) {

            return 31;

        } else {

            return -1;
        }
    }
}