/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**(2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
them to an array of Cycle. Try to call balance( ) on each element of the array and observe
the results. Downcast and call balance( ) and observe what happens. 
 */
class ICycle {

    public void ride(ICycle c) {
        System.out.println("Riding a - " + c);
    }

}

class IUnicycle extends ICycle {

    private String name = "Unicycle";
    
    void balance() {
        System.out.println("IUnicycle balance");
    }

    @Override
    public String toString() {
        return "Unicycle{" + "name=" + name + '}';
    }

}

class IBicycle extends ICycle {

    private String name = "Bicycle";
    
    void balance() {
        System.out.println("IBicycle balance");
    }

    @Override
    public String toString() {
        return "Bicycle{" + "name=" + name + '}';
    }

}

class iTricycle extends ICycle {

    private String name = "Tricycle";

    @Override
    public String toString() {
        return "Tricycle{" + "name=" + name + '}';
    }

}
public class Ch08Ex17 {
    public static void main(String[] args) {
        
        ICycle [] arr = {
            new IUnicycle(),
            new IBicycle(),
            new iTricycle()
        };
        
        for (ICycle ic : arr) {
            // Can't call balance() as base class dont have it. 
        }
        
        ((IUnicycle)arr[0]).balance();
        ((IBicycle)arr[1]).balance();
//        ((iTricycle)arr[2]).balance(); iTricycle dont have balance method()
        
    }
}
