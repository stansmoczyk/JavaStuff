package com.stat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void numberToWords(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            int numReverse = reverse(number);
            int numDigit = getDigitCount(number);
            // never learned converted by IDE behave like += but for strings
            StringBuilder toWords = new StringBuilder();

            for (int i = numDigit; i > 0; i--) {
                switch (numReverse % 10) {
                    case 1:
                        toWords.append("One");
                        break;
                    case 2:
                        toWords.append("Two");
                        break;
                    case 3:
                        toWords.append("Three");
                        break;
                    case 4:
                        toWords.append("Four");
                        break;
                    case 5:
                        toWords.append("Five");
                        break;
                    case 6:
                        toWords.append("Six");
                        break;
                    case 7:
                        toWords.append("Seven");
                        break;
                    case 8:
                        toWords.append("Eight");
                        break;
                    case 9:
                        toWords.append("Nine");
                        break;
                    default:
                        toWords.append("Zero");
                        break;
                }
                if (i > 1) toWords.append(" ");
                numReverse /= 10;
            }

            System.out.println(toWords);
        }

    }

    public static int reverse(int number) {
        // check if number is negative convert to positive if it was negative
        boolean isNegative = false;
        if (number < 0) {
            number = number * -1;
            isNegative = true;
        }

        // reversing the number
        int numReverse = 0;

        for (int i = getDigitCount(number); i > 0; i--) {
            numReverse += number % 10;
            if (i > 1) numReverse *= 10;
            number /= 10;
        }

        if (isNegative) return numReverse * -1;

        return numReverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;

        int numDigit = 0;

        while (number >= 1) {
            numDigit++;
            number = number / 10;
        }

        return numDigit;
    }
}


