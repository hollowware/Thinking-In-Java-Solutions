/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**
 * (2) Inherit a new class from class Detergent. Override scrub( ) and add a new
 * method called sterilize( ).
 */
class Detergent {

    public void scrub() {
        System.out.println("Im a scrub method.");
    }

}

public class Ch07Ex02 extends Detergent {
    
    @Override
    public void scrub() {
        System.out.println("Overriden scrub method.");
    }
    
    void sterilize() {
        System.out.println("Sterilize.");
    }
    
    public static void main(String[] args) {
        
        Detergent d = new Detergent();
        Ch07Ex02 obj = new Ch07Ex02();
        
        d.scrub();
        System.out.print("After override: ");
        obj.scrub();
        obj.sterilize();
    }
}
