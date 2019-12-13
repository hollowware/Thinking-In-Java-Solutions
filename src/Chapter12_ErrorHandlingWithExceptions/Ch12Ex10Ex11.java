/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**Create a class with two methods, f() and g(). In g(), throw an exception of
* a new type that you define. In f(), call g(), catch its exception and, in the
* catch clause, throw a different exception (of a second type that you define).
* Test your code in main().
 */
class NiceException extends Exception {
    
}

class NotNiceException extends Exception {
    
}

class WithTwoMethods {
    
    void f() throws NiceException {
        g();
    }
    
    void g() throws NiceException {
        throw new NiceException();
    }
    
}

public class Ch12Ex10Ex11 {
    public static void main(String[] args) {
        
        WithTwoMethods wtm = new WithTwoMethods();
        try {
            try {
                wtm.f();
            } catch(NiceException ne) {
                System.out.println("Inner");
                throw new RuntimeException(ne);
            }
        } catch (RuntimeException re) {
            System.out.println("Outer");
        }
        
    }
}
