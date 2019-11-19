/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s
object. Test for comparison using == and equals( ) for all references. 
 */
public class Ch03Ex06 {
    public static void main(String[] args) {
        
        Dogster dog = new Dogster("Spot", "Ruff!");
        Dogster dogo = new Dogster("Scruffy", "Wurf!");
        System.out.println(dog.name + " says - " + dog.says);
        System.out.println(dogo.name + " says - " + dogo.says);
        if (dog.equals(dogo))
            System.out.println("+");
        else 
            System.out.println("-");
    }
}

class Dogster {
    
    String name;
    String says;
    
    public Dogster (String name, String says) {
        this.name = name;
        this.says = says;
    }
    
}
