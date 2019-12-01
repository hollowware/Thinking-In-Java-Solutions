/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

import java.util.Random;

/**(1) Add a new method in the base class of Shapes.java that prints a
message, but don’t override it in the derived classes. Explain what happens. Now override it
in one of the derived classes but not the others, and see what happens. Finally, override it in
all the derived classes. 
 */
// Shape class
public class Ch08Ex02Ex03Ex04 {

    public void draw() {
    }

    public void erase() {
    }

    public void speak() {
        System.out.println("Base class");
    }

}

class Circle extends Ch08Ex02Ex03Ex04 {

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

class Square extends Ch08Ex02Ex03Ex04 {

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

class Triangle extends Ch08Ex02Ex03Ex04 {

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

class NewType extends Ch08Ex02Ex03Ex04 {

    @Override
    public void draw() {
        System.out.println("NewType.draw()");
    }

}

class RandomShapeGenerator {

    private final Random rand = new Random(50);

    public Ch08Ex02Ex03Ex04 next() {
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
}

class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Ch08Ex02Ex03Ex04[] s = new Ch08Ex02Ex03Ex04[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Ch08Ex02Ex03Ex04 shp : s) {
            shp.draw();
        }
    }
}
