package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getEvenDigitSum(int number){

        if(number < 0){

            return -1;

        }else{

            int sum = 0;

            int lastNumber = 0;

            while(number != 0){

                lastNumber = number % 10;

                if(lastNumber % 2 == 0){

                    sum += lastNumber;
                }

                number /= 10;
            }
            return sum;

        }

    }


}
