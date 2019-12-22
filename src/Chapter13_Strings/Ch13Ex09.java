/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.Arrays;

/**
 * (4) Using the documentation for java.util.regex.Pattern as a resource,
 * replace all the vowels in Splitting.knights with underscores.  *
 */
public class Ch13Ex09 {

    public static String knights
            = "Then, when you have found the shrubbery, you must "
            + "cut down the mightiest tree in the forest... "
            + "with... a herring!";

    public static void main(String[] args) {
        
        System.out.println(knights.replaceAll("[aeiouAEIOU]", "_"));

    }
}
