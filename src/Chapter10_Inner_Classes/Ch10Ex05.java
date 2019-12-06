/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Create a class with an inner class. In a separate class, make an instance of
the inner class. 
 */
class NewClass {
    
    class Inner {
        
        void f() {
            System.out.println("Inner");
        }
        
    }
    
    Inner giveInner () {
        return new Inner();
    }
    
}

class Separate {
    
    NewClass nc = new NewClass();
    NewClass.Inner inner = nc.giveInner();
    
}

public class Ch10Ex05 {
    public static void main(String[] args) {
        
        Separate sep = new Separate();
        sep.inner.f();
        
    }
}
