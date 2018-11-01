package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int count = first;
        if(first<10 || second<10){
            return -1;
        }else{
            while(first>=count){
                count--;
                if(first%count==0 && second%count==0){
                    return count;
                }
            }
        }
        return -1;
    }
}
