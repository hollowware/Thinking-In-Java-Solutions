/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Add a method to the class Sequence.SequenceSelector that produces
the reference to the outer class Sequence. 
 */
interface SelectorTwo {

    boolean end();

    Object current();

    void next();
}

// Sequence Class
public class Ch10Ex04 {

    private Object[] items;
    private int next = 0;
    private String test = "test";
    
    String getTest () {
        return test;
    }

    public Ch10Ex04(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements SelectorTwo {

        private int i = 0;
        
        Ch10Ex04 getCh10Ex04 () {
            return Ch10Ex04.this;
        }

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

    public SelectorTwo selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Ch10Ex04 sequence = new Ch10Ex04(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        SelectorTwo selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        System.out.println(((SequenceSelector)selector).getCh10Ex04().getTest());
    }
}
