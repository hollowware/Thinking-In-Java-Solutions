package Chapter14_TypeInformation;

import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * (3) Implement a rotate(Shape) method in Shapes.java, such that it checks to
 * see if it is rotating a Circle (and, if so, doesn’t perform the operation).
 *
 * (4) Modify Shapes.java so that it can "highlight" (set a flag in) all shapes
 * of a particular type. The toString( ) method for each derived Shape should
 * indicate whether that Shape is "highlighted."
 */
abstract class Shape2 {

    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle2 extends Shape2 {

    boolean flag = false;

    @Override
    public String toString() {
        return "Circle " + (flag ? "Highlighted" : "Unhighlighted");
    }
}

class Square2 extends Shape2 {

    boolean flag = false;

    @Override
    public String toString() {
        return "Square " + (flag ? "Highlighted" : "Unhighlighted");
    }
}

class Triangle2 extends Shape2 {

    boolean flag = false;

    @Override
    public String toString() {
        return "Triangle " + (flag ? "Highlighted" : "Unhighlighted");
    }
}

class Rhomboid2 extends Shape2 {

    boolean flag = false;

    @Override
    public String toString() {
        return "Rhomboid " + (flag ? "Highlighted" : "Unhighlighted");
    }
}

public class Ch14Ex05Ex06 {

    static void setFlag(Shape2 shape) {
        if (shape instanceof Circle2) {
            ((Circle2) shape).flag = true;
        } else if (shape instanceof Square2) {
            ((Square2) shape).flag = true;
        } else if (shape instanceof Triangle2) {
            ((Triangle2) shape).flag = true;
        } else if (shape instanceof Rhomboid2) {
            ((Rhomboid2) shape).flag = true;
        }
    }

    static void rotate(Shape2 shape) {
        if (!(shape instanceof Circle2)) {
            System.out.println("Rotate " + shape);
        } else {
            System.out.println("Oh no its Circle..");
        }
    }

    public static void main(String[] args) {

        List<Shape2> shapeList = Arrays.asList(
                new Circle2(), new Square2(), new Triangle2(), new Rhomboid2()
        );
//        shapeList.forEach((shape) -> {
//            rotate(shape);
//        });

        shapeList.forEach((shape) -> {
            if (shape instanceof Rhomboid2) {
                setFlag(shape);
            }
            System.out.println(shape);
        });

    }
}
