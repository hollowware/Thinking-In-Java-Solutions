/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**Following the example of MultiIterableClass, add reversed() and randomized() 
* methods to NonCollectionSequence.java, as well as making  NonCollectionSequence.java
* implement Iterable and show that all the approaches * work in foreach statements.
 */
class IntegerSequence {
    
    protected Integer [] arr;
    
    IntegerSequence (int size) {
        this.arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
    }
    
}

// NonCollectionSequence class
public class Ch11Ex32 extends IntegerSequence implements Iterable<Integer> {
    
    public Ch11Ex32(int size) {
        super(size);
    }
    
    public Iterable<Integer> reversed() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    
                    int current = arr.length - 1;
                    
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Integer next() {
                        return arr[current--];
                    }
                };
            }
            
        };
    }
    
    public Iterable<Integer> randomized() {
        return () -> {
            List<Integer> shuffled = new ArrayList(Arrays.asList(arr));
            Collections.shuffle(shuffled, new Random());
            return shuffled.iterator();
        };
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            
            private int index = 0;
            
            @Override
            public boolean hasNext() {
                return index < arr.length;
            }

            @Override
            public Integer next() {
                return arr[index++];
            }
            
        };
    }
    
    public static void main(String[] args) {
        
        Ch11Ex32 obj = new Ch11Ex32(50);
        for (Integer num : obj.arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        for (Integer num : obj.reversed()) {
            System.out.print(num + ", ");
        }
        System.out.println();
        for (Integer num : obj.randomized()) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
    
}
