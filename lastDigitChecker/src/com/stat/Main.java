package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static boolean hasSameLastDigit(int first , int second, int third ){

        if (first < 10 || first > 1000 || second< 10 || second> 1000 || third < 10 || third > 1000  ){
            return false;
        }

        else if (first%10 == second%10 || first%10 == third%10 || second%10 == third%10){
            return true;
        }
        return false;


    }


}
