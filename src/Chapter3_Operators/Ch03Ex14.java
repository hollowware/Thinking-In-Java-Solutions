/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**
 * Exercise 14: (3) Write a method that takes two String arguments and uses all
 * the boolean comparisons to compare the two Strings and print the results. For
 * the == and !=, also perform the equals( ) test. In main( ), call your method
 * with some different String objects.
 */
public class Ch03Ex14 {

    public static void main(String[] args) {

        comparisons("Dumb", "DumbAss");
        comparisons("TV", "Remote");
        comparisons("Java", "Robust");

    }

    private static void comparisons(String a, String b) {
        System.out.println(a + ", " + b + " :");
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("b.equals(a) : " + b.equals(a));
        System.out.println("a != b : " + (a != b));
        System.out.println("*******************");
    }
}
