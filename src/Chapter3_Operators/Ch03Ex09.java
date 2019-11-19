/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**
 * Exercise 9: (1) Display the largest and smallest numbers for both float and
 * double exponential notation.
 */
public class Ch03Ex09 {

    public static void main(String[] args) {

        float largestFloat = java.lang.Float.MAX_VALUE;
        float smallestFloat = java.lang.Float.MIN_VALUE;
        double largestDouble = java.lang.Double.MAX_VALUE;
        double smallestDouble = java.lang.Double.MIN_VALUE;
        System.out.println("Largest float = " + largestFloat);
        System.out.println("Smallest float = " + smallestFloat);
        System.out.println("Largest double = " + largestDouble);
        System.out.println("Smallest double = " + smallestDouble);

    }
}
