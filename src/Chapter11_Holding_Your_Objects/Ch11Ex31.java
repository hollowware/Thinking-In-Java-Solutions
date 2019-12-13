/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.Iterator;
import java.util.Random;

/**Modify polymorphism/shape/RandomShapeGenerator.java to make it
* Iterable. You'll need to add a constructor that takes the number of
* elements that you want the iterator to produce before stopping. Verify
* that it works.
 */

// Shape class
public class Ch11Ex31 {

    public void draw() {
    }

    public void erase() {
    }

    public void speak() {
        System.out.println("Base class");
    }

}

class Circle extends Ch11Ex31 {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void speak() {
        System.out.println("Circle Class");
    }

}

class Square extends Ch11Ex31 {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void speak() {
        System.out.println("Square Class");
    }
}

class Triangle extends Ch11Ex31 {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void speak() {
        System.out.println("Triangle Class");
    }
}

class NewType extends Ch11Ex31 {

    @Override
    public void draw() {
        System.out.println("NewType.draw()");
    }

}

class RandomShapeGenerator implements Iterable<Ch11Ex31> {
    
    private Ch11Ex31 [] arr;
    
    RandomShapeGenerator (int size) {
        this.arr = new Ch11Ex31 [size];
        for (int i = 0; i < size; i++) {
            arr[i] = next();
        }
    }

    private final Random rand = new Random(50);

    public Ch11Ex31 next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new NewType();
        }
    }
    
    public void display(Iterator<Ch11Ex31> it) {
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public Iterator<Ch11Ex31> iterator() {
        return new Iterator<Ch11Ex31>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < arr.length;
            }
            @Override
            public Ch11Ex31 next() {
                return arr[index++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

class Shapes {
    public static void main(String[] args) {
        
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        rsg.display(rsg.iterator()); 
        
    }
}
