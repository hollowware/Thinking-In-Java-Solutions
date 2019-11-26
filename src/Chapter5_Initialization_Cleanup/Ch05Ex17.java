/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 17: (2) Create a class with a constructor that takes a String argument. During
construction, print the argument. Create an array of object references to this class, but don’t
actually create objects to assign into the array. When you run the program, notice whether
the initialization messages from the constructor calls are printed. 
 */
public class Ch05Ex17 {
    public static void main(String[] args) {
        
        Tester [] arr = new Tester[10];
        
    }
}

class Tester {
    
    public Tester (String arg) {
        System.out.println(arg);
    }
    
}