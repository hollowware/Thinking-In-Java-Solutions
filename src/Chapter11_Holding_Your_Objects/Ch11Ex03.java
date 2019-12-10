/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * (2) Modify innerclasses/Sequence.java so that you can add any number of
 * elements to it.
 */
interface Selector {

    boolean end();

    Object current();

    void next();
}

// Sequence
public class Ch11Ex03 {

    private List<Object> items;
    private int next = 0;

    public Ch11Ex03() {
        items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Ch11Ex03 sequence = new Ch11Ex03();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
    }
}
