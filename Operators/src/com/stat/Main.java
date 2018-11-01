package com.stat;

public class Main {

    public static void main(String[] args) {
	int result = 1+2;
        System.out.println("1 + 2 + " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 =" + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 =" + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 =" + result);

        previousResult = result % 3;
        System.out.println(previousResult + " % 3 =" + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got high score!");

        int secondTopScore = 61;
        if ((topScore > secondTopScore) && (topScore <100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore >= 90))
            System.out.println("One of these test are true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double test = ((20 + 80) * 25);
        System.out.println(test);
        double testTwo = test % 40;
        if (testTwo <= 20)
            System.out.println("Total is over the limit " + testTwo);




    }
}
