/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Create a class called Amphibian. From this, inherit a class called
Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
Amphibian and demonstrate that all the methods still work. 
 */
class Amphibian {
    
    void swim(Amphibian a) {
        System.out.println(a + " - swiming.");
    }
    
    static void amphibian (Amphibian a) {
        a.swim(a);
    }
}

// Frog
public class Ch07Ex16 extends Amphibian {
    
    String name = "Frog";
    
    public static void main(String[] args) {
        
        Ch07Ex16 obj = new Ch07Ex16();
        Amphibian.amphibian(obj);
        
    }

    @Override
    public String toString() {
        return "Ch07Ex16{" + "name=" + name + '}';
    }
    
    
    
}
