/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**(1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
polymorphism works. 
 */
class Cyclee {
    
    private int wheels;

    public void ride(Cyclee c) {
        System.out.println("Riding a " + c + " and it has " + c.getWheels() + " wheels.");
    }
    
    public int getWheels() {
        return wheels;
    }

}

class Unicyclee extends Cyclee {

    private String name = "Unicycle";
    private int wheels = 3;
    
    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Unicycle{" + "name=" + name + '}';
    }

}

class Bicyclee extends Cyclee {

    private String name = "Bicycle";
    private int wheels = 4;
    
    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "name=" + name + '}';
    }

}

class Tricyclee extends Cyclee {

    private String name = "Tricycle";
    private int wheels = 5;
    
    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Tricycle{" + "name=" + name + '}';
    }

}

public class Ch08Ex05 {

    public static void main(String[] args) {

        Unicyclee u = new Unicyclee();
        Bicyclee b = new Bicyclee();
        Tricyclee t = new Tricyclee();
        u.ride(u);
        b.ride(b);
        t.ride(t);

    }
}
