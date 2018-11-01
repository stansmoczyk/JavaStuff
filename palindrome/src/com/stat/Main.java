package com.stat;

public class Main {

    public static void main(String[] args) {
        System.out.println(" testing number 1221 = " + isPalindrome(1221));
        System.out.println(" testing number 1234 = " + isPalindrome(1234));
        System.out.println(" testing number 1234321 = " + isPalindrome(1234321));
    }
//    public class NumberPalindrome {
        public static boolean isPalindrome(int number) {
            int numberCopy = 0, reversedNumber = 0;

            if(number <= -1) {
                number = number * (-1);
            }

            numberCopy = number;

            while(numberCopy > 9) {
                reversedNumber = (reversedNumber * 10) + (numberCopy % 10);
                numberCopy = numberCopy / 10;
            }

            reversedNumber = (reversedNumber * 10) + numberCopy;

            return (number == reversedNumber);
        }
    }
//}
