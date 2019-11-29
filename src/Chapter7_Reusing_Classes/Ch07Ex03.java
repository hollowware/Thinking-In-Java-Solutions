/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**You can see that the construction happens from the base “outward,” so the base class is
initialized before the derived-class constructors can access it. Even if you don’t create a
constructor for Cartoon( ), the compiler will synthesize a default constructor for you that
calls the base class constructor.
Exercise 3: (2) Prove the previous sentence. 
 */
class BaseClass {
    
    public BaseClass () {
        System.out.println("Im master constructor");
    }
    
}

class ClassOne extends BaseClass {
    
//    public ClassOne () {
//        super();
//        System.out.println("Im first class after base class.");
//    }
    
}

class ClassTwo extends ClassOne {
    
    public ClassTwo () {
        super();
        System.out.println("Im second class after base class.");
    }
    
}
public class Ch07Ex03 {
    public static void main(String[] args) {
        
        ClassTwo ct = new ClassTwo();
        
    }
}
