package com.stat;

public class Main {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature >= 25 && temperature <= 35) || (summer && temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }







    }

