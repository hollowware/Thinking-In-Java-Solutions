/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * (3) "Generify" innerclasses/Sequence.java.
 */
interface Selector {

    boolean end();

    Object current();

    void next();
}

// GenerifySequence class
public class Ch15Ex04<T> {

    private List<T> list = new ArrayList<>();

    public Ch15Ex04(List<T> list) {
        this.list = list;
    }

    public void add(T e) {
        list.add(e);
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == list.size();
        }

        @Override
        public Object current() {
            return list.get(i);
        }

        @Override
        public void next() {
            if (i < list.size()) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        Ch15Ex04<String> gs = new Ch15Ex04<>(list);
        for (int i = 0; i < 10; i++) {
            gs.add(Integer.toString(i));
        }
        Selector selector = gs.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
    
}
