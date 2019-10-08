/*
* Write a Boolean expression that evaluates to true if weight is greater than 50 pounds OR
* height is greater than 60 inches.
* */

package com.company;

public class Question4 {
    public static void main(String[] args) {
        int weight = 55;
        int height = 65;
        boolean true_or_bool = (weight > 50) || (height > 60);
        System.out.println(true_or_bool);
    }
}
