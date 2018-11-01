//package com.stat;
//
//public class Main {
//
//    public static void main(String[] args) {
//        public class LeapYear {
//            public static boolean isLeapYear(int year) {
//                if ((year < 1) || (year > 9999)) {
//                    return false;
//                } else if (year % 400 == 0) {
//                    return true;
//                } else if (year % 100 == 0) {
//                    return false;
//                } else if (year % 4 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            public static void getDaysInMonth(int month, int year) {
//
//                boolean resultOfLeapYearCorrectness = isLeapYear(year);
//
//                if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
//                    return -1;
//                } else if (month == 1) {
//
//                    return 31;
//
//                } else if (month == 2) {
//
//                    if (resultOfLeapYearCorrectness) {
//
//                        return 29;
//                    }
//
//                    return 28;
//
//                } else if (month == 3) {
//
//                    return 31;
//
//                } else if (month == 4) {
//
//                    return 30;
//
//                } else if (month == 5) {
//
//                    return 31;
//
//                } else if (month == 6) {
//
//                    return 30;
//
//                } else if (month == 7) {
//
//                    return 31;
//
//                } else if (month == 8) {
//
//                    return 31;
//
//                } else if (month == 9) {
//
//                    return 30;
//
//                } else if (month == 10) {
//
//                    return 31;
//
//                } else if (month == 11) {
//
//                    return 30;
//
//                } else if (month == 12) {
//
//                    return 31;
//
//                } else {
//
//                    return -1;
//                }
//            }
//        }
//    }
//}


public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year)

    {

        if(year<1 || year >9999)

            return false;

        else

        {

            if((year%4==0 && year%100!=0) || (year%400==0))

            {

                return true;

            }

            else

            {

                return false;

            }

        }

    }

    public static int getDaysInMonth(int month, int year)

    {

        if(month < 1 || month >12 || year <1 || year >9999)

            return -1;

        else {

            boolean decider = isLeapYear(year);

            if (decider == true)

                switch (month) {

                    case 1:

                        return 31;

                    case 2:

                        return 29;

                    case 3:

                        return 31;

                    case 4:

                        return 30;

                    case 5:

                        return 31;

                    case 6:

                        return 30;

                    case 7:

                        return 31;

                    case 8:

                        return 31;

                    case 9:

                        return 30;

                    case 10:

                        return 31;

                    case 11:

                        return 30;

                    case 12:

                        return 31;

                }

            else {

                switch (month) {

                    case 1:

                        return 31;

                    case 2:

                        return 28;

                    case 3:

                        return 31;

                    case 4:

                        return 30;

                    case 5:

                        return 31;

                    case 6:

                        return 30;

                    case 7:

                        return 31;

                    case 8:

                        return 31;

                    case 9:

                        return 30;

                    case 10:

                        return 31;

                    case 11:

                        return 30;

                    case 12:

                        return 31;

                }

            }

        }

        return -1;

    }

}



// Another  solution

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            System.out.println("Your parameter is not correct");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Is a leap year");
            return true;
        }
        System.out.println(year + " Is not a leap year");
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Month and year are not in range");
            return -1;
        }
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year) == true){
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }
}