package com.stat;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(96, 45));
        System.out.println(getDurationString(39450l));
    }

        public static String getDurationString ( long minutes, long seconds){
            if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
                return "Invalid Value";
            }
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }

        public static String getDurationString ( long seconds){
            if (seconds < 0) {
                return "Invalid Value";
            }

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);


        }
    }





//            minutes = ((seconds / 60) += minutes);
//            int hours = (minutes / 60);
//            System.out.println(hours + "H " + minutes % 60 + "m " + seconds % 60 + "s");



