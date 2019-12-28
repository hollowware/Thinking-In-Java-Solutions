/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

import java.util.Arrays;
import java.util.List;

/**
 * (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape,
 * then downcast it back to a Rhomboid. Try downcasting to a Circle and see what
 * happens.
 */
abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Ch14Ex03Ex04 {

    public static void main(String[] args) {

        // Upcasting
        Shape r = new Rhomboid();
        if (r instanceof Shape) {
            System.out.println("All cool");;
        } else {
            System.out.println("arghhh");
        }
        // Downcasting
        Rhomboid rh = new Rhomboid();
        ((Shape) rh).draw();
        
        // checking for instance 
        if (r instanceof Circle) {
            ((Circle) r).draw();
        } else {
            System.out.println("(Shape)r is not a Circle");
        }
        // inconvertible types:
        // ((Circle)r).draw();

    }
}
