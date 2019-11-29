/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**
 * Exercise 9: (2) Create a class called Root that contains an instance of each
 * of the classes (that you also create) named Component1, Component2, and
 * Component3. Derive a class Stem from Root that also contains an instance of
 * each “component.” All classes should have default constructors that print a
 * message about that class.
 */
class Component1 {

    public Component1() {
        System.out.println("Component1");
    }
}

class Component2 {

    public Component2() {
        System.out.println("Component2");
    }
}

class Component3 {

    public Component3() {
        System.out.println("Component3");
    }
}

class Root {

    Component1 com1;
    Component2 com2;
    Component3 com3;
    
    public Root() {
        System.out.println("Root");
    }

}

class Stem extends Root {

    Component1 com4;
    Component2 com5;
    Component3 com6;
    
    public Stem() {
        System.out.println("Stem");
    }
    
}

public class Ch07Ex09 {

    public static void main(String[] args) {

        Stem stem = new Stem();
    }

}
