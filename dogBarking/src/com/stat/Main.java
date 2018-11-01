package com.stat;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay < 0) {
            return false;
        }else if (hourOfDay >=24){
            return false;
        }


        else if(barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }else {
            return false;
        }


    }
}