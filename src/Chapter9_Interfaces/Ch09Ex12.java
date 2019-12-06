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
interface CanFight {

    void fight();
}

interface CanSwim {

    void swim();
}

interface CanFly {

    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter implements CanClimb {

    public void fight() {
    }

    @Override
    public void climb() {
        System.out.println("Climbing");
    }
}

class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}

// Adventure
public class Ch09Ex12 {

    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }
    
    public static void a(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        a(h);
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }
}
