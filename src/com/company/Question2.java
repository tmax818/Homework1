/*
* Translate the following algorithm into Java code:

Step 1:  Declare a double variable named miles with an initial value of 100.

Step 2: Declare a double constant named KILOMETERS_PER_MILE with initial value 1.609.

Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.

Step 4: Display the value of kilometers to the console.
* */

package com.company;


public class Question2 {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);

    }
}