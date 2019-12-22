/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Modify Exercise 4 so that the custom exception class inherits from 
* RuntimeException, and show that the compiler allows you to leave
* out the try block.
 */
class MyException3 extends RuntimeException {
    
    private String exception;
    
    public MyException3(String msg) {
        super(msg);
        this.exception = msg;
    }
    
    void getException() {
        System.out.println(exception);;
    }
    
}

public class Ch12Ex28 {
    public static void main(String[] args) {
        
           throw new MyException3("Error");
        
    }
}
