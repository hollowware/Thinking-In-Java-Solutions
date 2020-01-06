/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Use RandomList with two more types in addition to the one shown in main( ).
 * @param <T>
 */

// RandomList<T>
public class Ch15Ex06<T> {

    private final ArrayList<T> storage = new ArrayList<>();
    private final Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        
        Ch15Ex06<String> stringList = new Ch15Ex06<>();
        String [] strArr = ("The quick brown fox jumped over "
                + "the lazy brown dog").split(" ");
        for (String s : strArr) {
            stringList.add(s);
        }
        for (String s : strArr) {
            System.out.print(stringList.select() + " ");
        }
        System.out.println();
        
        System.out.println("**********************");
        
        Ch15Ex06<Integer> intList = new Ch15Ex06<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(intList.select() + " ");
        }
        System.out.println();
        
    }
}
