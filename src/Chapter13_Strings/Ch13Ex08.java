/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.Arrays;

/**
 * (2) Split the string Splitting.knights on the words "the" or “you."
 */
// Splitting class
public class Ch13Ex08 {

    public static String knights
            = "Then, when you have found the shrubbery, you must "
            + "cut down the mightiest tree in the forest... "
            + "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split("the"); 
        split("you"); 
    }
}
