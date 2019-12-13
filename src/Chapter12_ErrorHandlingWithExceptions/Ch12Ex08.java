/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**Write a class with a method that throws an exception of the type created
* in Exercise 4. Try compiling it without an exception specification to see
* what the compiler says. Add the appropriate exception specification. Try
* out your class and its exception inside a try-catch clause.
 */
class MyException1 extends Exception {
    
    private String exception;
    
    public MyException1(String msg) {
        super(msg);
        this.exception = msg;
    }
    
    void getException() {
        System.out.println(exception);;
    }
    
}

class Banana {
    
    void bananaLand() throws MyException1  {
        System.out.println("throw from bananaLand()");
        throw new MyException1("Exception");
    }
    
}

public class Ch12Ex08 {
    public static void main(String[] args) {
        
        Banana b = new Banana();
        try {
            b.bananaLand();
        } catch (MyException1 ex) {
            ex.getException();
        }
        
    }
}
