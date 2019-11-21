/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate
that this reference is initialized by Java to null. 
 */
public class Ch05Ex01 {
    
    static String name;
    
    public static void main(String[] args) {
        
        System.out.println(Ch05Ex01.name);
        
    }
}
