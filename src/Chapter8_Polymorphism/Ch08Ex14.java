/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

import java.util.Random;

/**
 * (4) Modify Exercise 12 so that one of the member objects is a shared object
 * with reference counting, and demonstrate that it works properly.
 */
class Shared {

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    public void showRefcount() {
        System.out.println("refcount = " + refcount);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Characteristicc {

    private String s;

    Characteristicc(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

}

class Descriptionn {

    private String s;

    Descriptionn(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

}

class Rodenttt {

    private String name = "Rodent";
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    Rodenttt(Shared shared) {
        System.out.println("Rodent() " + id);
        this.shared = shared;
        this.shared.addRef();
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

class Mouseee extends Rodenttt {

    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");

    Mouseee(Shared shared) {
        super(shared);
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

class Gerbilll extends Rodenttt {

    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");

    Gerbilll(Shared shared) {
        super(shared);
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

class Hamsterrr extends Rodenttt {

    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");

    Hamsterrr(Shared shared) {
        super(shared);
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

class RandomRodentGeneratorr {

    Shared shared = new Shared();
    Random random = new Random();

    public Rodenttt next() {
        switch (random.nextInt(3)) {
            default:
            case 0: 
                return new Mouseee(shared);
            case 1:
                return new Gerbilll(shared);
            case 2:
                return new Hamsterrr(shared);
        }
    }

}

public class Ch08Ex14 {
    
    static RandomRodentGeneratorr gen = new RandomRodentGeneratorr();
    
    public static void main(String[] args) {
        Rodenttt[] rodents = new Rodenttt[5];
        for (Rodenttt rod : rodents) {
            rod = gen.next();
            System.out.println(rod);
        }
        gen.shared.showRefcount();
    }
}
