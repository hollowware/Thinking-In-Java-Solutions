/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (2) Implement reverseSelector( ) in Sequence.java.
 */
interface SelectorThree {

    boolean end();

    Object current();

    void next();
}

// Sequence class
public class Ch10Ex22 {

    private Object[] items;
    private int next = 0;

    public Ch10Ex22(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements SelectorThree {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }
    
    private class ReverseSelector implements SelectorThree {
        
        private int i = items.length - 1;

        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i > -1) {
                i--;
            }
        }
        
    }

    public SelectorThree selector() {
        return new SequenceSelector();
    }

    public SelectorThree reverseSelector() {
        return new ReverseSelector();
    }

    public static void main(String[] args) {
        Ch10Ex22 sequence = new Ch10Ex22(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        SelectorThree selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        
        SelectorThree reverseSelector = sequence.reverseSelector();
        while(!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
        System.out.println();
    }
}
