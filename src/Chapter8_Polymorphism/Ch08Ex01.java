/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**
 * (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride(
 * ) method.
 */
class Cycle {

    public void ride(Cycle c) {
        System.out.println("Riding a - " + c);
    }

}

class Unicycle extends Cycle {

    private String name = "Unicycle";

    @Override
    public String toString() {
        return "Unicycle{" + "name=" + name + '}';
    }

}

class Bicycle extends Cycle {

    private String name = "Bicycle";

    @Override
    public String toString() {
        return "Bicycle{" + "name=" + name + '}';
    }

}

class Tricycle extends Cycle {

    private String name = "Tricycle";

    @Override
    public String toString() {
        return "Tricycle{" + "name=" + name + '}';
    }

}

public class Ch08Ex01 {

    public static void main(String[] args) {

        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        u.ride(u);
        b.ride(b);
        t.ride(t);

    }
}
