/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Create three new types of exceptions. Write a class with a method that
* throws all three. In main(), call the method but only use a single catch
* clause that will catch all three types of exceptions.
 */
class ExceptionOne extends Exception {
    
}

class ExceptionTwo extends Exception {
    
}

class ExceptionThree extends Exception {
    
}

class BadAss {
    
    void palmTree (int num) throws ExceptionOne, ExceptionTwo, ExceptionThree {
        if (num > 0) throw new ExceptionOne();
        if (num == 0) throw new ExceptionTwo();
        if (num < 0) throw new ExceptionThree();
    }
    
}

public class Ch12Ex09 {
    public static void main(String[] args) {
        
        BadAss ba = new BadAss();
        try {
            ba.palmTree(1);
            ba.palmTree(0);
            ba.palmTree(-1);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
