/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**
 *
 * @author IX Hero
 */
abstract class Rodent {

    public abstract void eat();

    public abstract void hide();

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

public class Ch09Ex01 {

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
