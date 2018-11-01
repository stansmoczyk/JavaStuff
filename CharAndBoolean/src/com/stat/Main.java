package com.stat;

public class Main {

    public static void main(String[] args) {

        //width 0f 16 (2 bytes)
        char myChar = '\u00Ae'; //registered symbol unicode
        System.out.println("Unicode output was : " + myChar);

        boolean myBoolean = true;
        System.out.println("Boolean is = " + myBoolean);
    }
}
