/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (3) Modify polymorphism/Frog.java so that it uses try-finally to guarantee
 * proper cleanup, and show that this works even if you return from the middle
 * of the try-finally.
 */
class Characteristic {

    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class Description {

    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    protected void dispose() {
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature {

    private Characteristic p
            = new Characteristic("is alive");
    private Description t
            = new Description("Basic Living Creature");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {

    private Characteristic p
            = new Characteristic("has heart");
    private Description t
            = new Description("Animal not Vegetable");

    Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {

    private Characteristic p
            = new Characteristic("can live in water");
    private Description t
            = new Description("Both water and land");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

// class Frog
public class Ch12Ex17 extends Amphibian {

    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Ch12Ex17() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Ch12Ex17 frog = new Ch12Ex17();
        try {
            return;
        } finally {
            System.out.println("Bye!");
            frog.dispose();
        }

    }
}
