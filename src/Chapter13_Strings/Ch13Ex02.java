/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Repair InfiniteRecursion.javao
 */
public class Ch13Ex02 {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<Ch13Ex02> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new Ch13Ex02());
        }
        System.out.println(v);
    }
}
