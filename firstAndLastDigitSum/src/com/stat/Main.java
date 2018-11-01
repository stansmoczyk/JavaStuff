package com.stat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing numbers 3456 " + sumFirstAndLastDigit(3456));
    }

    public static int sumFirstAndLastDigit(int number) {

        int first = 0;
        int last = number % 10;
        int sum = 0;
        if (number >=10){
            while (number > 9) {
                number /= 10;
                first = number;
            }  return sum = first + last;
        } else if (number >= 0){
            first = number;
            return sum = first + last;
        } return -1;
    }
}
