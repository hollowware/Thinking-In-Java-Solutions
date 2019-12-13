/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Create your own exception class using the extends keyword. Write a 
* constructor for this class that takes a String argument and stores it inside
* the object with a String reference. Write a method that displays the stored 
* String. Create a try-catch clause to exercise your new exception.
 */
class MyException2 extends Exception {
    
    private String exception;
    
    public MyException2(String msg) {
        super(msg);
        this.exception = msg;
    }
    
    void getException() {
        System.out.println(exception);;
    }
    
}

public class Ch12Ex04 {
    public static void main(String[] args) {
        
        try {
           throw new MyException2("Error");
        } catch(MyException2 me) {
            me.getException();
        }
        
    }
}
