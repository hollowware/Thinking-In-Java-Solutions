/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**(3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
etc. In the base class, provide methods that are common to all Rodents, and override these
in the derived classes to perform different behaviors depending on the specific type of
Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
your base-class methods to see what happens. 
 */
class Rodent {

    public void eat() {
        System.out.println("Rodent eat");
    }

    public void hide() {
        System.out.println("Rodent hide");
    }

}

class Mouse extends Rodent {

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void hide() {
        System.out.println("Mouse hide");
    }

}

class Gerbil extends Rodent {

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void hide() {
        System.out.println("Gerbil hide");
    }

}

class Hamster extends Rodent {

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void hide() {
        System.out.println("Hamster hide");
    }

}

public class Ch08Ex09 {

    public static void main(String[] args) {

        Rodent[] rodents = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };
        
        for (Rodent rod : rodents) {
            rod.eat();
            rod.hide();
        }
        
    }
}
