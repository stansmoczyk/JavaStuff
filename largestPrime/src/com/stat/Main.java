package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }

        int div = 2;

        while(div!=number){
            if(number%div==0){
                number /= div;
                div = 2;
                continue;
            }

            div++;
        }
        return number;
    }

}
