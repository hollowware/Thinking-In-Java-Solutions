/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
that prints a message. Create an object of this class. 
 */
public class Ch05Ex03 {
    
    public Ch05Ex03 () {
        System.out.println("Object created.");
    }
    
    public static void main (String[] args) {
        
        Ch05Ex03 obj = new Ch05Ex03();
        
    }
}
