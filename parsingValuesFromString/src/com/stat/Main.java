package com.stat;

public class Main {

    public static void main(String[] args) {

        String numberAsString ="2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number2 = " + number2);

        numberAsString += 1;
        number += 1;
        number2 += 1.125;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);


    }
}
