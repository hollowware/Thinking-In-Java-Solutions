/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**(3) Create a base class with two methods. In the first method, call the
second method. Inherit a class and override the second method. Create an object of the
derived class, upcast it to the base type, and call the first method. Explain what happens. 
 */

class BaseClass {
    
    void firstMethod() {
        System.out.println("Im first");
        secondMethod();
    }
    
    void secondMethod() {
        System.out.println("Im second");
    }
    
}

class Derrived extends BaseClass {
    
    @Override
    void secondMethod() {
        System.out.println("Subclass");
    }
    
}

public class Ch08Ex10 {
    public static void main(String[] args) {
        
        BaseClass d = new Derrived(); // Upcasting
        /*
        calling BaseClass method and then
        goes to Overriden Derrived class method.
        */
        d.firstMethod();
        
    }
}
