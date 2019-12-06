/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (1) Create a class that holds a String, and has a toString( ) method that
 * displays this String. Add several instances of your new class to a Sequence
 * object, then display them.
 */
class HoldString {

    String name = "Java";

    @Override
    public String toString() {
        return "HoldString{" + "name=" + name + '}';
    }

}

interface Selector {

    boolean end();

    Object current();

    void next();
}

// Sequence Class
public class Ch10Ex02 {

    private Object[] items;
    private int next = 0;

    public Ch10Ex02(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {

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

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        HoldString hs = new HoldString();
        Ch10Ex02 sequence = new Ch10Ex02(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(hs);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
