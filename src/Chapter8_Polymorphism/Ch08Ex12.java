/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

import java.util.Random;

/**
 * (3) Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes. Now add member objects to both the base
 * and derived classes and show the order in which their initialization occurs
 * during construction.
 */
class Characteristic {

    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

}

class Description {

    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

}

class Rodentt {

    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    Rodentt() {
        System.out.println("Rodent()");
    }

    public void eat() {
        System.out.println("Rodent eat");
    }

    public void hide() {
        System.out.println("Rodent hide");
    }

    @Override
    public String toString() {
        return "Rodentt{" + "name=" + name + '}';
    }

}

class Mousee extends Rodentt {

    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");

    Mousee() {
        System.out.println("Mouse()");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void hide() {
        System.out.println("Mouse hide");
    }

    @Override
    public String toString() {
        return "Mousee{" + "name=" + name + '}';
    }

}

class Gerbill extends Rodentt {

    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");

    Gerbill() {
        System.out.println("Rat()");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void hide() {
        System.out.println("Gerbil hide");
    }

    @Override
    public String toString() {
        return "Gerbill{" + "name=" + name + '}';
    }

}

class Hamsterr extends Rodentt {

    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");

    Hamsterr() {
        System.out.println("Squirrel()");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void hide() {
        System.out.println("Hamster hide");
    }

    @Override
    public String toString() {
        return "Hamsterr{" + "name=" + name + '}';
    }

}

class RandomRodentGenerator {

    Random random = new Random();

    public Rodentt next() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Mousee();
            case 1:
                return new Gerbill();
            case 2:
                return new Hamsterr();
        }
    }

}

public class Ch08Ex12 {

    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodentt[] rodents = new Rodentt[10];
        for (Rodentt r : rodents) {
            r = gen.next();
            System.out.println(r);
        }
    }
}
