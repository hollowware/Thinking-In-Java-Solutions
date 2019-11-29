/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Create a class with a method that is overloaded three times. Inherit a
new class, add a new overloading of the method, and show that all four methods are available
in the derived class. 
 */
class NewClass {
    
    void methodToOverload () {
        System.out.println("No args");
    }
    
    void methodToOverload (String a) {
        System.out.println("String arg");
    }
    
    void methodToOverload (int b) {
        System.out.println("Int arg");
    }
    
}

class Kid extends NewClass {
    
    void methodToOverload (String a, int b) {
        System.out.println("New Overloaded method");
    }
    
}

public class Ch07Ex13 {
    public static void main(String[] args) {
        
        Kid kid = new Kid();
        kid.methodToOverload();
        kid.methodToOverload("Hello");
        kid.methodToOverload(3);
        kid.methodToOverload("Hello", 3);
        
        
    }
}
