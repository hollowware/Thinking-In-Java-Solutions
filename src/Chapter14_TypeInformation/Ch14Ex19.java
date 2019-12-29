/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

/**(4) In ToyTest.java, use reflection to create a Toy object using the nondefault constructor. 
 */
interface HasBatteries2 {
}

interface Waterproof2 {
}

interface Shoots2 {
}

class Toy2 {

    Toy2() {
        System.out.println("Creating Toy() object");
    }

    Toy2(int i) {
        System.out.println("Creating Toy(" + i + ") object");
    }
}

class FancyToy2 extends Toy2
        implements HasBatteries2, Waterproof2, Shoots2 {

    FancyToy2() {
        super(1);
    }
}

// ToyTest class
public class Ch14Ex19 {

    public static void main(String[] args) {
        // get appropriate constructor and create new instance:
        try {
            Toy2.class.getDeclaredConstructor(int.class).newInstance(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
