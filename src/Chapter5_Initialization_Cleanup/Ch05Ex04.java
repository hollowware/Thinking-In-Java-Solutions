/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a
String argument and prints it along with your message. 
 */
public class Ch05Ex04 {
    
    public Ch05Ex04 () {
        System.out.println("Object created.");
    }
    
    public Ch05Ex04 (String arg) {
        System.out.println(arg);
    }
    
    public static void main (String[] args) {
        
        Ch05Ex04 obj = new Ch05Ex04();
        Ch05Ex04 objTwo = new Ch05Ex04("Java created.");
        
    }
}
