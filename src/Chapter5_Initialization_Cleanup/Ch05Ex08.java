/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 8: (1) Create a class with two methods. Within the first method, call the second
method twice: the first time without using this, and the second time using this—just to see it
working; you should not use this form in practice. 
 */
public class Ch05Ex08 {
    
    void firstMethod () {
        System.out.println("im first");
        System.out.println("calling second twice: ");
        secondMethod();
        this.secondMethod();
    }
    
    void secondMethod() {
        System.out.println("im second");
    }
    
    public static void main (String[] args) {
        
        Ch05Ex08 obj = new Ch05Ex08();
        obj.firstMethod();
        
    }
    
}
