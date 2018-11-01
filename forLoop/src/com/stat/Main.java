package com.stat;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateIntrest(10000.0, 2.0));
    //for (init; termination; increment){
        for (int i = 0 ; i < 5; i++){
            System.out.println("Loop " + i + " hello");


    }

        for (int i = 2; i < 9; i++ ){
            System.out.println("10,000 at " + i +"% interest = " + calculateIntrest(10000.0, i));

            //To do 2 decimal spotsa use formatting command
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateIntrest(10000.0, i)));
        }
        System.out.println("**********************");
        for (int i = 8; i > 1; i-- ){
            System.out.println("10,000 at " + i +"% interest = " + calculateIntrest(10000.0, i));

            //To do 2 decimal spots use formatting command
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateIntrest(10000.0, i)));
        }

        int count =0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + "" + " is a prime number");
                if (count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }



    public static boolean isPrime(int n){

        if (n ==1) {
            return false;

        }
        for (int i=2; i<= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static double calculateIntrest (double amount, double interestRate ){
        return (amount *(interestRate/100));

    }

}


// prime number code.................