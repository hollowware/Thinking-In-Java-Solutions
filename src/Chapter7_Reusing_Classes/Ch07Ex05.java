/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(1) Create two classes, A and B, with default constructors (empty argument
lists) that announce themselves. Inherit a new class called C from A, and create a member of
class B inside C. Do not create a constructor for C. Create an object of class C and observe
the results. 
 */
class A {
    
    public A () {
        System.out.println("Announce A");
    }
    
}

class B {
    
    public B () {
        System.out.println("Announce B");
    }
    
}

class C extends A {
    
    B b = new B();
    
}

public class Ch07Ex05 {
    public static void main(String[] args) {
        
        C c = new C();
        
    }
}
