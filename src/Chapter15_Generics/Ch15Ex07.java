/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

import java.util.Iterator;

/**
 * (2) Use composition instead of inheritance to adapt Fibonacci to make it
 * Iterable.
 */
interface Generator<T> {

    T next();

}

// Fibonacci 
public class Ch15Ex07 implements Generator<Integer>, Iterable<Integer> {

    private int count = 0;
    private int m;
    
    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public Ch15Ex07() {
    }

    public Ch15Ex07(int m) {
        this.m = m;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return m > 0;
            }

            @Override
            public Integer next() {
                m--;
                return Ch15Ex07.this.next();
            }

            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Ch15Ex07 gen = new Ch15Ex07();
        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next() + " ");
        }
        System.out.println();
        Iterator it = new Ch15Ex07(20).iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
