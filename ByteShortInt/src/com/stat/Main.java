package com.stat;

public class Main {

    public static void main(String[] args) {
        // int has width of 32
	//int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;
	//int myTotal = (myMinValue/2);
    //    System.out.println("myTotal = " + myTotal);

    //byte has width of 8
	byte myByteValue = 127;
	//byte myNewByteValue = (byte) (myByteValue/2);
	//	System.out.println("myNewByteValue = " + myNewByteValue);

	// short has width of 16
	short myShortValue = 32767;
	//short myNewShortValue = (short) (myShoertValue/2);
	//	System.out.println("myNewShortValue = " + myNewShortValue);

	// long has width of 64
		long myLongValue =  50000L + 10L * (myByteValue + myShortValue + myMaxValue);
	//long myLongValue = 9_223_372_036_854_775_807L;
	//long myNewLongValue = (long) (myLongValue/2);
		//System.out.println("myNewLongValue = " + myNewLongValue);
		System.out.println(myLongValue);


    }
}
