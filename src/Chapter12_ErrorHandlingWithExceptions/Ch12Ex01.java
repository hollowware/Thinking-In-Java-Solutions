/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Create a class with a main(0 that throws an object of class Exception
* inside a try block. Give the constructor for Exception a String argument.
* Catch the exception inside a catch clause and print the String argument.
* Add a finally clause and print a message to prove you were there.
 */
class MyException extends Exception {
    
    public MyException(String msg) {
        super(msg);
    }
    
}

public class Ch12Ex01 {
    public static void main(String[] args) {
        
        try {
            throw new MyException("Coused by thrown MyException");
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("You were there");
        }
        
    }
}
