package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class SharedDigit {
        public static boolean  hasSharedDigit(int first ,int second) {
            int digitOne = first %10;
            int digitTwo = (first /10)%10;
            int secondDigitOne = second %10 ;
            int secondDigitwo = (second /10) %10;
            if (first > 99 || second > 99 || first < 10 || second < 10) {
                return false;
            }else if (digitOne == secondDigitOne||digitOne ==secondDigitwo ||digitTwo==secondDigitOne||digitTwo==secondDigitwo){
                return true;
            }return false;
        }
    }
}
