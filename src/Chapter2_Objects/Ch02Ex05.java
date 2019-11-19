/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2_Objects;

/**
 * Modify the previous exercise so that the values of the data in DataOnly are
 * assigned to and printed in main().
 */
class DataOnlyCopy {

    int b = 15;
    String name = "John";
    boolean boo = true;

}

public class Ch02Ex05 {
    public static void main(String[] args) {

        DataOnlyCopy dataOnly = new DataOnlyCopy();
        System.out.println(dataOnly.b);
        System.out.println(dataOnly.name);
        System.out.println(dataOnly.boo);

    }

}
