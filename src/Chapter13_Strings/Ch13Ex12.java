/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * (5) Modify Groups.java to count all of the unique words that do not start
 * with a capital letter.
 */
public class Ch13Ex12 {

    static public final String POEM
            = "Twas brillig, and the slithy toves\n"
            + "Did gyre and gimble in the wabe.\n"
            + "All mimsy were the borogoves,\n"
            + "And the mome raths outgrabe.\n\n"
            + "Beware the Jabberwock, my son,\n"
            + "The jaws that bite, the claws that catch.\n"
            + "Beware the Jubjub bird, and shun\n"
            + "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+")
                        .matcher(POEM);
        List<String> list = new ArrayList();
        while (m.find()) {
            list.add(m.group());
        }
        System.out.println(list);
    }
}
