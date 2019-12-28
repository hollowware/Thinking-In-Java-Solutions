/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**(2) Modify StartEnd.java so that it uses Groups.POEM as input, but
still produces positive outputs for find( ), lookingAt( ) and matches( ). 
 */
public class Ch13Ex13 {

    static public final String POEM
            = "Twas brillig, and the slithy toves\n"
            + "Did gyre and gimble in the wabe.\n"
            + "All mimsy were the borogoves,\n"
            + "And the mome raths outgrabe.\n\n"
            + "Beware the Jabberwock, my son,\n"
            + "The jaws that bite, the claws that catch,\n"
            + "Beware the Jubjub bird, and shun\n"
            + "The frumious Bandersnatch.";

    private static class Display {

        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            d.display("find() '" + m.group() + "' start = " + m.start() + " end  = " + m.end());
        }
        if (m.lookingAt()) // No reset() necessary
        {
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        }
        if (m.matches()) // No reset() necessary
        {
            d.display("matches() start = " + m.start() + " end = " + m.end());
        }
    }

    public static void main(String[] args) {
        for (String in : POEM.split("\n")) {
            System.out.println("input : " + in);
            for (String regex : new String[]{"\\w*are\\w*", "A\\w*", "T\\w+", "Did.*"}) {
                examine(in, regex);
            }
        }
    }
}
