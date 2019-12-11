/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator
 * instead of a Selector.
 */
//interface Selector2 {
//
//    boolean end();
//
//    Object current();
//
//    void next();
//}
// Sequence
public class Ch11Ex09 {

    private List<Object> items;
    private int next = 0;

    public Ch11Ex09() {
        items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        
        Ch11Ex09 sequence = new Ch11Ex09();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Iterator<Object> it = sequence.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
