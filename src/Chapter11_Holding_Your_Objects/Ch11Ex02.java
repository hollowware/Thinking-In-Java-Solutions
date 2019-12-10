/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.Set;
import java.util.TreeSet;

/**
 * (1) Modify SimpleCollection.java to use a Set for c.
 */
//  SimpleCollection class
public class Ch11Ex02 {

    public static void main(String[] args) {

        Set<Integer> c = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i); 
        }
        c.forEach((i) -> {
            if (i != 9)
                System.out.print(i + ", ");
            else 
                System.out.print(i);
        });
        System.out.println();
    }
}

