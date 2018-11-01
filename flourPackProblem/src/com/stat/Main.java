package com.stat;

public class Main {

    public static void main(String[] args) {

        canPack(1,0,4);
        canPack(2,2,12);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {

            return false;

        }

        for (int i = 0; i <= smallCount; i++) {

            for (int y = 0; y <= bigCount; y++) {

                if (goal == i + y * 5) {

                    return true;

                }

            }

        }

        return false;

    }

}
