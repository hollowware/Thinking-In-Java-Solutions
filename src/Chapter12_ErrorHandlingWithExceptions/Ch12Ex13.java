/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**(2) Modify Exercise 9 by adding a finally clause. Verify that your finally
clause is executed, even if a NullPointerException is thrown. 
 */
class ExceptionA extends Exception {
    
}

class ExceptionB extends Exception {
    
}

class ExceptionC extends Exception {
    
}

class Bad {
    
    void palmTree (int num) throws ExceptionA, ExceptionB, ExceptionC {
        if (num > 0) throw new ExceptionA();
        if (num == 0) throw new ExceptionB();
        if (num < 0) throw new ExceptionC();
    }
    
}

public class Ch12Ex13 {
    public static void main(String[] args) {
        
        Bad ba = new Bad();
        try {
            ba.palmTree(1);
            ba.palmTree(0);
            ba.palmTree(-1);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Executed");
        }
        
    }
}
