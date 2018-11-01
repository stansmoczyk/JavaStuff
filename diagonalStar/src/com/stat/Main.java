package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(21);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {
                for (int y = 1; y <= number; y++) {
                    if (i == 1 || i == number || y == 1 || y == number
                            || i == y || y == number - i + 1) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
