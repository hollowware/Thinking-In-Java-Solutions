/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the
second constructor inside the first one. 
 */
public class Ch05Ex09 {
    
    public Ch05Ex09 () {
        this("Hey man, look at me.");
    }
    
    public Ch05Ex09 (String a) {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        
        Ch05Ex09 obj = new Ch05Ex09();
        
    }
}
