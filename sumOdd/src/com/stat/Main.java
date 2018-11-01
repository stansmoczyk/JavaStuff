package com.stat;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isOdd ( int number){

        if (number < 0 || (number % 2 == 0)) {

            return false;

        } else {
            return true;
        }
    }


    public static int sumOdd ( int start, int end){

        int sum = 0;

        if (end < start || (start <= 0 || end <= 0)) {

            System.out.println("Invalid parameter");

            return -1;

        }

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {

                sum += i;

                System.out.println("Sum of all odd is " + sum);

            }

        }

        return sum;

    }

}
