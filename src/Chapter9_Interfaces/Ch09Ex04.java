/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**
 *
 * @author IX Hero
 */
abstract class Base1 {
    
}

abstract class Base2 {
    
    abstract void f();
    
}

class Child1 extends Base1 {
    
    void f() {
        System.out.println("Child1");
    }
    
}

class Child2 extends Base2 {
    
    @Override
    void f() {
        System.out.println("Child2");
    }
    
}

public class Ch09Ex04 {
    
    static void g(Base1 base) {
        ((Child1)base).f();
    }
    
    static void a(Base2 base) {
        base.f();
    }
    
    public static void main(String[] args) {
        
        Child1 ch = new Child1();
        Ch09Ex04.g(ch);
        Child2 ch1 = new Child2();
        Ch09Ex04.a(ch1);
        
    }
}
