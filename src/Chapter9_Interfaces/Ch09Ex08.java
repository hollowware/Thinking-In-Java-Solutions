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
interface FastFood {
    
    void cola();
    void fries();
    
}

class Meal {
    Meal() {
        System.out.println("Meal");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PorableLunch");
    }
}

//Sandwich class
public class Ch09Ex08 extends PortableLunch implements FastFood {
    
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    
    public Ch09Ex08() {
        System.out.println("Sandwich");
    }

    @Override
    public void cola() {
        System.out.println("cola");
    }

    @Override
    public void fries() {
        System.out.println("fries");
    }
    
    public static void main(String[] args) {
        
        Ch09Ex08 obj = new Ch09Ex08();
        obj.cola();
        obj.fries();
        
    }
    
}
