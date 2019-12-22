/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

/**
 * (5) Using the documentation for java.util.regex.Pattern as a resource, write
 * and test a regular expression that checks a sentence to see that it begins
 * with a capital letter and ends with a period.
 */
public class Ch13Ex07 {

    public static void main(String[] args) {

        // starts with any capital A through Z
        // then zero or more of any char except endline
        // ends with . 
        String regex = "^[A-Z].*[\\.]$";
        String s1 = "Once upon a time.";
        String s2 = "abcd.";
        String s3 = "Abcd?";
        String s4 = "An easy way out.";
        String s5 = "Zorro.";
        String s6 = "X.";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        System.out.println(s3.matches(regex));
        System.out.println(s4.matches(regex));
        System.out.println(s5.matches(regex));
        System.out.println(s6.matches(regex));

    }
}
