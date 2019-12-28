/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * (1) Rewrite SplitDemo using String.split( ).
 */
public class Ch13Ex14 {

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
//        System.out.println(Arrays.toString(
//                Pattern.compile("!!").split(input)));
//        // Only do the first three:
//        System.out.println(Arrays.toString(
//                Pattern.compile("!!").split(input, 3)));

        String [] output = input.split("!!");
        System.out.println(Arrays.toString(output));
    }
}
