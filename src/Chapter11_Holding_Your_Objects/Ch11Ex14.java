/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 * (3) Create an empty LinkedList<Integer>. Using a Listlterator, add Integers
 * to the List by always inserting them in the middle of the List.
 */
public class Ch11Ex14 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList();
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        for (Integer i : array) {
            ListIterator<Integer> it = list.listIterator((list.size()) / 2);
            it.add(i);
            System.out.println(list);
        }
        
    }
}
